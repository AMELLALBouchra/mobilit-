package beans;

public class Users {

	private String nom;
	private String prenom;
	private String T�l�phone;
	private String adresse;
	private String email;
	private String Fili�re;
	
	private String matricule;

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

	public String getT�l�phone() {
		return T�l�phone;
	}

	public void setT�l�phone(String t�l�phone) {
		T�l�phone = t�l�phone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFili�re() {
		return Fili�re;
	}

	public void setFili�re(String fili�re) {
		Fili�re = fili�re;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Users(String nom, String prenom, String t�l�phone, String adresse, String email, String fili�re,
			String matricule) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		T�l�phone = t�l�phone;
		this.adresse = adresse;
		this.email = email;
		Fili�re = fili�re;
		this.matricule = matricule;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
			}