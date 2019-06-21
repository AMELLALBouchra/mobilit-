package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Billet;

import dataBase.Implementation;
import dataBase.InterfaceMetier;

/**
 * Servlet implementation class ServlDemande_billrt
 */
@MultipartConfig
@WebServlet("/ServlDemande_billrt")
public class ServlDemande_billrt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServlDemande_billrt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("Demande_achat_billet.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		InterfaceMetier con = new Implementation();
		String nom= request.getParameter("nom");
		String prenom= request.getParameter("prenom");
		String ecole_part= request.getParameter("ecole_part");
		String ville_depart= request.getParameter("ville_depart");
		String ville_arrive= request.getParameter("ville_arrive");
		String date_depart= request.getParameter("date_depart");
		String tel_mobile= request.getParameter("tel_mobile");
		String tel_fixe= request.getParameter("tel_fixe");
		String email= request.getParameter("email");
		String cni= request.getParameter("cni");
		Billet etudiant=new Billet(nom,prenom,ecole_part,ville_depart,ville_arrive,date_depart,tel_mobile,tel_fixe,email,cni);
		 try {
				con.ajouter(etudiant);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 request.getRequestDispatcher("Apres-Billet.jsp").forward(request,response);
		 System.out.println(nom);
		 System.out.println(prenom);
	}

}
