package dataBase;

import java.util.ArrayList;



import beans.*;

public interface InterfaceMetier {
	public boolean exist(Etudiant utilisateur) throws Exception;
	public void ajouter( Etudiant_inscrit users);
	public  ArrayList<Etudiant_inscrit> etudiant_inscrit();
	public  ArrayList<Billet> etudiant_billet();
	public void ajouter( Billet users);
	public void ajouter( Documentation fichier);
	
}
