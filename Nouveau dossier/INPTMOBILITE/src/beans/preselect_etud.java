package beans;

public class preselect_etud {
	private String nom;
	private String prenom;
	private double note;
	public preselect_etud() {
		super();
		// TODO Auto-generated constructor stub
	}
	public preselect_etud(String nom, String prenom, double note) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.note = note;
	}
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
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}

}
