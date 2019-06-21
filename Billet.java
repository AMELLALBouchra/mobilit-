package beans;

import java.io.Serializable;

public class Billet implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom;
	private String ecole_part;
	private String ville_depart;
	private String ville_arrive;
	private String date_depart;
	private String tel_mobile;
	private String tel_fixe;
	private String email;
	private String cni;
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
	public String getEcole_part() {
		return ecole_part;
	}
	public void setEcole_part(String ecole_part) {
		this.ecole_part = ecole_part;
	}
	public String getVille_depart() {
		return ville_depart;
	}
	public void setVille_depart(String ville_depart) {
		this.ville_depart = ville_depart;
	}
	public String getVille_arrive() {
		return ville_arrive;
	}
	public void setVille_arrive(String ville_arrive) {
		this.ville_arrive = ville_arrive;
	}
	public String getDate_depart() {
		return date_depart;
	}
	public void setDate_depart(String date_depart) {
		this.date_depart = date_depart;
	}
	public String getTel_mobile() {
		return tel_mobile;
	}
	public void setTel_mobile(String tel_mobile) {
		this.tel_mobile = tel_mobile;
	}
	public String getTel_fixe() {
		return tel_fixe;
	}
	public void setTel_fixe(String tel_fixe) {
		this.tel_fixe = tel_fixe;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCni() {
		return cni;
	}
	public void setCni(String cni) {
		this.cni = cni;
	}
	public Billet(String nom, String prenom, String ecole_part, String ville_depart, String ville_arrive,
			String date_depart, String tel_mobile, String tel_fixe, String email, String cni) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.ecole_part = ecole_part;
		this.ville_depart = ville_depart;
		this.ville_arrive = ville_arrive;
		this.date_depart = date_depart;
		this.tel_mobile = tel_mobile;
		this.tel_fixe = tel_fixe;
		this.email = email;
		this.cni = cni;
	}
	public Billet() {
		super();
	}
	
}
