package gestionUtilisateurs;

public class Utilisateur extends Personne{

	private String login;
	private String motpass;
	private String service;
	public Profil profil;

	
	public Utilisateur(String matricule, String nom, String prenom, String email, String téléphone, Double salaire,
			String login, String passwrd, String service, Profil profil){
		
		super(matricule, nom, prenom, email, téléphone, salaire);
		this.login = login;
		this.motpass = passwrd;
		this.service = service;
		this.profil = profil;	
	}
	
	
	/* create setters */
	public void setProfil(String login) {
		this.login = login;
	}
	public void setMotpass(String pass) {
		this.motpass = pass;
	}
	public void setService(String ser) {
		this.service = ser;
	}
	
	/* create getters */
	public String getLogin() {
		return login;
	}
	public String getmotPass() {
		return motpass;
	}
	public String getService() {
		return service;
	}
	
	/* create method calculerSalaire */
	double arg;
	public double calculerSalaire() {
		if (this.profil.code.equals("MN")) {
			 arg = salaire*0.08;
			return salaire + arg;
		} else if (this.profil.code.equals("DG")) {
			 arg = salaire * 0.15;
			return salaire + arg;
		}
		return super.calculerSalaire(); 
	}

	public void afficher() {
		super.afficher();
		System.out.println("Le " + this.profil.libelle + " le salaire est: " + this.calculerSalaire() + "DH augmentation: " + arg + "DH");
	}
	
	
	
}


