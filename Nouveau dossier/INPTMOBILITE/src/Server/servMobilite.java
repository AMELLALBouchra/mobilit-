package Server;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.CellType;

import beans.Users;
import beans.preselect;
import database.Connect;
import database.ImplConnect;

/**
 * Servlet implementation class Bouchra
 */
@MultipartConfig
@WebServlet("/servMobilite")
public class servMobilite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servMobilite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 /* Connect con=new ImplConnect();
		;ArrayList<preselect> listes=   con.selectionner("filiere");
		request.setAttribute("listes", listes);
		
		request.getRequestDispatcher("preselection.jsp").forward(request,response);*/
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page=request.getParameter("page");
		if(page.equals("inscrire")) {

		    String nom= request.getParameter("nom");
		    String prenom=request.getParameter("prenom");
		    String email = request.getParameter("emailINPT");
		    String telephone   =request.getParameter("tel");
		    String adresse  = request.getParameter("adresse");
		    String matricule = request.getParameter("MatEtud");
		    String filiere = request.getParameter("filiere");
		   String cv= request.getParameter("cv");
		    
		   //String lettremotivation= request.getParameter("lettremotivation");
		    Part part=request.getPart("cv");
			String filename=extractFileName(part);
			
			String savePath ="C:\\Users\\hp\\eclipse-workspace\\INPTMOBILITE\\WebContent\\files"+File.separator+filename;
			
			File fileSaveDir=new File(savePath);
			part.write(savePath + File.separator);
			
			
			/*Part part1=request.getPart("lettremotivation");
				String filenames1=extractFileName1(part1);
				
				String savePath1 ="C:\\Users\\hp\\eclipse-workspace\\regroupementevents\\WebContent\\images"+File.separator+filenames1;
				
				File fileSaveDir1=new File(savePath1);
				part.write(savePath1 + File.separator);*/

	  	  Users user=new Users(nom,prenom,telephone,adresse,email,filiere,matricule);
          Connect con=new ImplConnect();
		  con.ajouter(user);}
		  //request.getRequestDispatcher("accueil_etudiant.jsp").forward(request,response);
		
	
		if(page.equals("note")) {
			String filiere = request.getParameter("filiere");
			System.out.println(filiere);

			 Part part=request.getPart("notes");
				String filename=extractFileName(part);
				
				String savePath ="C:\\Users\\hp\\eclipse-workspace\\INPTMOBILITE\\WebContent"+File.separator+filename;
				
				File fileSaveDir=new File(savePath);
				part.write(savePath + File.separator);
			
			
			
			@SuppressWarnings("rawtypes")
			

				// Déclaration des variables
				ArrayList<String> values = new ArrayList<String>();
				Connection connection;
				Statement statement;

				// Récupération des données depuis le fichier excel
				
				try {

					InputStream input = new FileInputStream(filename);
					POIFSFileSystem fs = new POIFSFileSystem(input);
					HSSFWorkbook wb = new HSSFWorkbook(fs);
					HSSFSheet sheet = wb.getSheetAt(0);
					Iterator rows = sheet.rowIterator();

					while (rows.hasNext()) {

						values.clear();

						HSSFRow row = (HSSFRow) rows.next();

						Iterator cells = row.cellIterator();

						while (cells.hasNext()) {

							HSSFCell cell = (HSSFCell) cells.next();
							
		                    if (CellType.NUMERIC == cell.getCellType())
								values.add(Integer.toString((int) cell.getNumericCellValue()));
							else if (CellType.STRING == cell.getCellType())
								values.add(cell.getStringCellValue());
							
						}

						// Insertion en BDD
						try {
							Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

							connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobilite?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root","");

							statement = connection.createStatement();
							
							
							 
								System.out.println(filiere);
								
								double moyenne=Double.parseDouble(values.get(2))*(0.2)+ Double.parseDouble(values.get(3))*(0.3)+Double.parseDouble(values.get(4))*(0.5);
								String sql = String
										.format("INSERT INTO "+filiere+"(nom, prenom, note_s1, note_s2, note_s3,moyenne) VALUES ('%s', '%s', '%s', '%s', %s ,%s)",
												values.get(0), values.get(1),
												values.get(2), values.get(3), values.get(4),moyenne);

								int count = statement.executeUpdate(sql);

								// Message de succès
								if (count > 0) {
									System.out.println("Enregistrement effectué!");
								

//								}
						
									request.getRequestDispatcher("apres_fournir_notes.jsp").forward(request,response);
						} }catch (Exception e) {
							e.printStackTrace();
						}

					}
				} catch (IOException e) {
					e.printStackTrace();}}
				

		if(page.equals("preselect")) {
			
			  Connect con=new ImplConnect();
			  String filiere=request.getParameter("filiere");
			  int nbr=Integer.parseInt(request.getParameter("nbr"));
				ArrayList<preselect> listes=   con.selectionner(filiere , nbr);
				
				request.setAttribute("nbr", nbr);
				request.setAttribute("listes", listes);
				
				request.getRequestDispatcher("result_preselection.jsp").forward(request,response);
	}
		
		if(page.equals("preselect_etud")) {
			
			  Connect con=new ImplConnect();
			  String filiere=request.getParameter("filiere");
			  
				ArrayList<preselect> listes=   con.selectionner(filiere );
				
				
				request.setAttribute("listes", listes);
				
				request.getRequestDispatcher("result_preselection_etud.jsp").forward(request,response);
	}
		
		
	}
	private String extractFileName(Part part) {
		String contentDisp =part.getHeader("content-disposition");
		String[] items =contentDisp.split(";");
		for (String s :items) {
			
			if (s.trim().startsWith("filename")){
				return s.substring(s.indexOf("=")+ 2 , s.length() -1);
			}
					
			
			
			
			
		}
		
		return "";}}
	
	
	
	
	