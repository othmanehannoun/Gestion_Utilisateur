package gestionUtilisateurs;

public class Profil {

	public int id;
	public String code;
	public String libelle;
	
	static int comp = 0;
	public Profil(String code, String libelle) {
		this.id = comp++;
		this.code = code;
		this.libelle = libelle;
	}
	
}

