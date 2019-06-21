package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Billet;

import dataBase.Implementation;
import dataBase.InterfaceMetier;

/**
 * Servlet implementation class Servl_Liste_dem_billet
 */
@WebServlet("/Servl_Liste_dem_billet")
public class Servl_Liste_dem_billet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servl_Liste_dem_billet() {
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
			
		    
			
		    ArrayList<Billet> events=con.etudiant_billet();
		   request.setAttribute("events", events);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		   request.getRequestDispatcher("Liste_billet.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
