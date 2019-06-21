package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import beans.Etudiant;
import dataBase.*;


/**
 * Servlet implementation class ServlAuthentification
 */
@MultipartConfig
@WebServlet("/ServlAuthentification")
public class ServlAuthentification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServlAuthentification() {
        super();
        // TODO Auto-generated constructor stub
    }
 public void init() throws ServletException{
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("Authentification.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Login=request.getParameter("login");
		String Password=request.getParameter("mdp");
		if (Login.equals("nacima")&Password.equals("nacima")) {
			request.getRequestDispatcher("Acceil_Admin.jsp").forward(request,response);
		}
		else {
       Etudiant utilisateur=new Etudiant(Login,Password);
       InterfaceMetier calcul=new Implementation();
   	
        try {
			boolean verifie= calcul.exist(utilisateur);
			if(verifie) {
				
				request.getRequestDispatcher("Acceil_Etudiant.jsp").forward(request,response);
			}
			else {
				String error="vous etes pas un utilisateur";
						request.setAttribute("error", error);
				request.getRequestDispatcher("Authentification.jsp").forward(request,response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

	}
	}
}
