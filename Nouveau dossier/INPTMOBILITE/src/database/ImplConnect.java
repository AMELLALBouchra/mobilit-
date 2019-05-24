package database;


import java.sql.*;
import java.util.ArrayList;

import beans.*;
import beans.preselect;

public class ImplConnect implements Connect {

	@Override
	public void ajouter(Users user) {
		// TODO Auto-generated method stub
		Connection conn = Singleton.getconnection();
		PreparedStatement statmenent;
		try {
			statmenent = conn.prepareStatement(
					"insert into inscris(matricule,nom, prenom,email,telephone,adresse,filiere) VALUES (?,?,?,?,?,?,?)");

			statmenent.setString(1, user.getMatricule());
			statmenent.setString(2, user.getNom());
			statmenent.setString(3, user.getPrenom());
			statmenent.setString(4, user.getEmail());
			
			statmenent.setString(5, user.getTéléphone());

			statmenent.setString(6, user.getAdresse());
			statmenent.setString(7, user.getFilière());
			//statmenent.setString(8, user.getCv());
			//statmenent.setString(9, user.getLettremotivation());
			//System.out.println("sss" + user.getCv());

			statmenent.executeUpdate();
			statmenent.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}
	}

	public ArrayList<preselect> selectionner(String filiere, int nbr) {
		// TODO Auto-generated method stub
		ResultSet resultat = null;
		ArrayList<preselect> liste=new ArrayList<>();
		Connection conn = Singleton.getconnection();
		PreparedStatement statmenent;
		try {
			statmenent = conn.prepareStatement(
					"select * from "+ filiere+" ORDER by moyenne desc");
			
			resultat = statmenent.executeQuery();
			while (resultat.next()) {
				String nom = resultat.getString("nom");
				String prenom = resultat.getString("prenom");
				double moyenne = resultat.getDouble("moyenne");
				System.out.println(nom);
				preselect personne=new preselect(nom,prenom,moyenne);
				liste.add(personne);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			statmenent = conn.prepareStatement(
					"insert into "+ filiere+"1"+"(select nom,prenom,moyenne from "+ filiere+" ORDER by moyenne desc LIMIT"+nbr+") VALUES (?,?,?)");

			String nom = resultat.getString("nom");
			String prenom = resultat.getString("prenom");
			double moyenne = resultat.getDouble("moyenne");

			statmenent.executeUpdate();
			statmenent.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}
		
		
	return liste;

		
		
		
		
		
		
		
	}

	@Override
	public ArrayList<preselect> selectionner(String filiere) {
		// TODO Auto-generated method stub
		ResultSet resultat = null;
		ArrayList<preselect> liste=new ArrayList<>();
		Connection conn = Singleton.getconnection();
		PreparedStatement statmenent;
		try {
			statmenent = conn.prepareStatement(
					"select * from "+ filiere+"1");
			
			resultat = statmenent.executeQuery();
			while (resultat.next()) {
				String nom = resultat.getString("nom");
				String prenom = resultat.getString("prenom");
				double note = resultat.getDouble("note");
				System.out.println(nom);
				preselect_etud personne=new preselect_etud(nom,prenom,note);
				liste.add(personne);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}


