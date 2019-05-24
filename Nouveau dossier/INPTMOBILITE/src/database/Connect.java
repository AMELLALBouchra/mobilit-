package database;

import java.util.ArrayList;
import java.util.List;

import beans.*;

public interface Connect {
	public void ajouter( Users users);
	
	ArrayList<preselect> selectionner(String filiere, int nbr);

	public ArrayList<preselect> selectionner(String filiere);
	
	
}
