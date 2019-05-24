package beans;

public class Users {

	private String nom;
	private String prenom;
	private String Téléphone;
	private String adresse;
	private String email;
	private String Filière;
	
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

	public String getTéléphone() {
		return Téléphone;
	}

	public void setTéléphone(String téléphone) {
		Téléphone = téléphone;
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

	public String getFilière() {
		return Filière;
	}

	public void setFilière(String filière) {
		Filière = filière;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Users(String nom, String prenom, String téléphone, String adresse, String email, String filière,
			String matricule) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Téléphone = téléphone;
		this.adresse = adresse;
		this.email = email;
		Filière = filière;
		this.matricule = matricule;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
			}