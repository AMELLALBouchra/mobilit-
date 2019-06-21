package beans;

import java.io.Serializable;

public class Etudiant_inscrit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom;
	private String email_inpt  ;
	private String matricule ;
	private String telephone;
	private String addresse;
	private String filiere  ;
	private String cv ;
	private String lm ;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail_inpt() {
		return email_inpt;
	}
	public void setEmail_inpt(String email_inpt) {
		this.email_inpt = email_inpt;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
	}
	public String getLm() {
		return lm;
	}
	public void setLm(String lm) {
		this.lm = lm;
	}
	public Etudiant_inscrit(String nom, String prenom, String email_inpt, String matricule, String telephone,
			String addresse, String filiere, String cv, String lm) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email_inpt = email_inpt;
		this.matricule = matricule;
		this.telephone = telephone;
		this.addresse = addresse;
		this.filiere = filiere;
		this.cv = cv;
		this.lm = lm;
	}
	public Etudiant_inscrit() {
		super();
	}
	public Etudiant_inscrit(String nom, String prenom, String filiere) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.filiere = filiere;
	}
	
	
}
