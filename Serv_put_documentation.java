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

import beans.Documentation;

import dataBase.Implementation;
import dataBase.InterfaceMetier;

/**
 * Servlet implementation class Serv_put_documentation
 */
@MultipartConfig
@WebServlet("/Serv_put_documentation")
public class Serv_put_documentation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv_put_documentation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("Publier_Documentation.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		InterfaceMetier con = new Implementation();
		Part part=request.getPart("fichier");
		String filename=extractFileName(part);
		System.out.println(filename);
		String savePath ="D:\\jadid\\Mobilite\\WebContent\\MobiliteDocument3"+ File.separator + filename;
		part.write( savePath+ File.separator);
        Documentation fichier=new Documentation(savePath);
		
        try {
        	
			con.ajouter(fichier);
			request.getRequestDispatcher("Apres-documentation.jsp").forward(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
	 request.getRequestDispatcher("Apres-documentation.jsp").forward(request,response);}
	
	    
	
        
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
