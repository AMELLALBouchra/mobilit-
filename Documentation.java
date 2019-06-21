package beans;

import java.io.Serializable;

public class Documentation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String fichier;

	public String getFichier() {
		return fichier;
	}

	public void setFichier(String fichier) {
		this.fichier = fichier;
	}

	public Documentation(String fichier) {
		super();
		this.fichier = fichier;
	}

	public Documentation() {
		super();
	}
	

}
