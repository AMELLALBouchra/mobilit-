package servlets;



import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;



import beans.Etudiant_inscrit;
import dataBase.Implementation;
import dataBase.InterfaceMetier;




/**
 * Servlet implementation class ServlInscription
 */
@MultipartConfig
@WebServlet("/ServlInscription")
public class ServlInscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServlInscription() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("Inscription.jsp").forward(request,response);}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		InterfaceMetier con = new Implementation();
		String nom= request.getParameter("nom");
		String prenom= request.getParameter("prenom");
		String email_inpt= request.getParameter("email_inpt");
		String matricule= request.getParameter("Matricule");
		String tel= request.getParameter("tel");
		String adresse= request.getParameter("adresse");
		String filiere= request.getParameter("filiere");
		Part part1=request.getPart("cv");
		Part part2=request.getPart("lm");
		String filename1=extractFileName(part1);
        String filename2=extractFileName(part2);
		String savePath1 ="D:\\jadid\\Mobilite\\WebContent\\MobiliteDocument1"+ File.separator + filename1;
		String savePath2 ="D:\\jadid\\Mobilite\\WebContent\\MobiliteDocument1"+ File.separator + filename2;
		part1.write( savePath1+ File.separator);
		part2.write( savePath2+ File.separator);
		Etudiant_inscrit etudiant=new Etudiant_inscrit(nom,prenom,email_inpt,matricule,tel,adresse,filiere,savePath1,savePath2);
		
        try {
			con.ajouter(etudiant);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //request.getRequestDispatcher("apres_pub.jsp").forward(request,response);
        System.out.println(nom);
		System.out.println(prenom);
		System.out.println(tel);
		System.out.println(matricule);
		System.out.println(filiere);}
		
		
	
	private String extractFileName(Part part) {
		String contentDisp =part.getHeader("content-disposition");
		String[] items =contentDisp.split(";");
		for (String s :items) {
			
			if (s.trim().startsWith("filename")){
				return s.substring(s.indexOf("=")+ 2 , s.length() -1);
			}
		}
					
		return "";
			
			
			
		}



	}


