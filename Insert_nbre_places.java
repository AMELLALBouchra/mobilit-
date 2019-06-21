package servlets;

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





import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.CellType;


/**
 * Servlet implementation class Insert_nbre_places
 */
@MultipartConfig
@WebServlet("/Insert_nbre_places")
public class Insert_nbre_places extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert_nbre_places() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 Part part=request.getPart("notes");
			String filename=extractFileName(part);
			
			String savePath ="D:\\jadid\\Mobilite\\WebContent"+File.separator+filename;
			
			File fileSaveDir = new File(savePath);
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
				Iterator  rows = sheet.rowIterator();

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
						
						
						 
							
							
							
							String sql = String
									.format("INSERT INTO nbre_places (Ecole_part, filiere_part, nbre_de_place, filiere_inpt) VALUES ('%s', '%s', '%s', '%s')",
											values.get(0), values.get(1),
											values.get(2), values.get(3));

							int count = statement.executeUpdate(sql);

							// Message de succès
							if (count > 0) {
								System.out.println("Enregistrement effectué!");
							

//							}
					
								request.getRequestDispatcher("apres_places.jsp").forward(request,response);
					} }catch (Exception e) {
						e.printStackTrace();
					}

				}
			} catch (IOException e) {
				e.printStackTrace();}}
	
	
	
	private String extractFileName(Part part) {
		String contentDisp =part.getHeader("content-disposition");
		String[] items =contentDisp.split(";");
		for (String s :items) {
			
			if (s.trim().startsWith("filename")){
				return s.substring(s.indexOf("=")+ 2 , s.length() -1);
			}
					
			
			
			
			
		}
		
		return "";}}


