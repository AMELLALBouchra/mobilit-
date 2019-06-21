package dataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import dataBase.Singeleton;
import beans.Billet;
import beans.Documentation;
import beans.Etudiant;
import beans.Etudiant_inscrit;

public class Implementation implements InterfaceMetier{

	@Override
	public boolean exist(Etudiant utilisateur) throws Exception {
		// TODO Auto-generated method stub
		ResultSet resultat=null;
		Connection conn=Singeleton.getconnection();
		PreparedStatement statmenent;
		
		   statmenent = conn.prepareStatement("select login,password from etudiant where login=? and password=?");
		
		   statmenent.setString(1,utilisateur.getLogin());
		   statmenent.setString(2,utilisateur.getPassword());
		   resultat=statmenent.executeQuery();

		
				if(resultat.next()) {
					return true;}
				else {
					return false;
				}
		
		
	}

	@Override
	public void ajouter(Etudiant_inscrit users) {
		// TODO Auto-generated method stub
		Connection conn = Singeleton.getconnection();
		PreparedStatement statmenent;
		try {
			statmenent = conn.prepareStatement("insert into etudiants_inscrits(nom,prenom,email_inpt,matricule_etudiant,telephone,addresse,filiere,cv,lm)VALUES (?,?,?,?,?,?,?,?,?)");

			statmenent.setString(1, users.getNom());
			statmenent.setString(2, users.getPrenom());
			statmenent.setString(3, users.getEmail_inpt());
			statmenent.setString(4, users.getMatricule());
			statmenent.setString(5, users.getTelephone());
			statmenent.setString(6, users.getAddresse());
			statmenent.setString(7, users.getFiliere());
			statmenent.setString(8, users.getCv());
			statmenent.setString(9, users.getLm());

			statmenent.executeUpdate();
			statmenent.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}
		
	}

	@Override
	public ArrayList<Etudiant_inscrit> etudiant_inscrit() {
		// TODO Auto-generated method stub
		ResultSet resultat = null;
		Connection conn = Singeleton.getconnection();
		PreparedStatement statmenent;
		ArrayList<Etudiant_inscrit> Evenement = new ArrayList<>();
		try {
			statmenent = conn.prepareStatement("select nom,prenom,filiere from etudiants_inscrits ORDER BY filiere");
            
			resultat = statmenent.executeQuery();
			while (resultat.next()) {
				
				
				
				String nom = resultat.getString("nom");
				
				String prenom = resultat.getString("prenom");
				String filiere = resultat.getString("filiere");
				
   
				Etudiant_inscrit evenement=new Etudiant_inscrit(nom,prenom,filiere);
				Evenement.add(evenement);
				System.out.println(prenom);
				System.out.println(nom);
				System.out.println(filiere);
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Evenement;
	
	}

	@Override
	public ArrayList<Billet> etudiant_billet() {
		
		// TODO Auto-generated method stub
		ResultSet resultat = null;
		Connection conn = Singeleton.getconnection();
		PreparedStatement statmenent;
		ArrayList<Billet> Evenement = new ArrayList<>();
		try {
			statmenent = conn.prepareStatement("select nom,prenom,ecole_part,ville_depart,ville_arrive,date_depart,tel_mobile,tel_fixe,email,cni from billet ORDER BY ecole_part");
            
			resultat = statmenent.executeQuery();
			while (resultat.next()) {
				
				
				
				String nom = resultat.getString("nom");
				
				String prenom = resultat.getString("prenom");
				String ecole_part = resultat.getString("ecole_part");
				String ville_depart = resultat.getString("ville_depart");
				String ville_arrive = resultat.getString("ville_arrive");
				String date_depart = resultat.getString("date_depart");
				String tel_mobile = resultat.getString("tel_mobile");
				String tel_fixe = resultat.getString("tel_fixe");
				String email = resultat.getString("email");
				String cni = resultat.getString("cni");
				
   
				Billet evenement=new Billet(nom,prenom,ecole_part,ville_depart,ville_arrive,date_depart,tel_mobile,tel_fixe,email,cni);
				Evenement.add(evenement);
				System.out.println(prenom);
				System.out.println(nom);
			
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Evenement;
	
		
	}

	@Override
	public void ajouter(Billet users) {
		// TODO Auto-generated method stub
		
		Connection conn = Singeleton.getconnection();
		PreparedStatement statmenent;
		try {
			statmenent = conn.prepareStatement("insert into billet (nom,prenom,ecole_part,ville_depart,ville_arrive,date_depart,tel_mobile,tel_fixe,email,cni) VALUES (?,?,?,?,?,?,?,?,?,?)");

			statmenent.setString(1, users.getNom());
			statmenent.setString(2, users.getPrenom());
			statmenent.setString(3, users.getEcole_part());
			statmenent.setString(4, users.getVille_depart());
			statmenent.setString(5, users.getVille_arrive());
			statmenent.setString(6, users.getDate_depart());
			statmenent.setString(7, users.getTel_mobile());
			statmenent.setString(8, users.getTel_fixe());
			statmenent.setString(9, users.getEmail());
			statmenent.setString(10, users.getCni());

			statmenent.executeUpdate();
			statmenent.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}
		
		
	}

	@Override
	public void ajouter(Documentation fichier) {
		// TODO Auto-generated method stub
		Connection conn = Singeleton.getconnection();
		PreparedStatement statmenent;
		try {
			statmenent = conn.prepareStatement("insert into documentation (fichier) VALUE (?) ");

			statmenent.setString(1, fichier.getFichier());
			

			statmenent.executeUpdate();
			statmenent.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}
		
	}
	
	}


