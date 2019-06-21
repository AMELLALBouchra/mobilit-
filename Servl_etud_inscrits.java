package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import beans.Etudiant_inscrit;
import dataBase.Implementation;
import dataBase.InterfaceMetier;

/**
 * Servlet implementation class Servl_etud_inscrits
 */
@WebServlet("/Servl_etud_inscrits")
public class Servl_etud_inscrits extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servl_etud_inscrits() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 InterfaceMetier con = new Implementation();
			
		    
			
		    ArrayList<Etudiant_inscrit> events=con.etudiant_inscrit();
		   request.setAttribute("events", events);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		   request.getRequestDispatcher("liste_etud_inscrit.jsp").forward(request,response);}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
