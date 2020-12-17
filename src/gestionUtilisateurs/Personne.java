package gestionUtilisateurs;


/* create class Personne */
public class Personne {

	public String matricule;
	public String nom;
	public String prenom;
	public String email;
	public String téléphone;
	public Double salaire;
	
	public Personne(String matricule, String nom, String prénom, String email, String téléphone, Double salaire) {
		
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prénom;
		this.email = email;
		this.téléphone = téléphone;
		this.salaire = salaire;
	}


	
	

/* create setters */
public void setMatricule(String Matr) {
	this.matricule = Matr;
}
public void setNom(String nom) {
	this.nom = nom;
}
public void setPrenom(String prn) {
	this.prenom = prn;
}
public void setMail(String mail) {
	this.email = mail;
}
public void setTelephone(String phone) {
	this.téléphone = phone;
}
public void setSalaire(Double salr) {
	this.salaire = salr;
}

/* create getters */
public String getMatricule() {
	return matricule;
}
public String getNom() {
	return nom;
}
public String getPrenom() {
	return prenom;
}
public String getMail() {
	return email;
}
public String getTelephone() {
	return téléphone;
}
public Double getSalaire() {
	return salaire; 
}


public double calculerSalaire() {
	return this.salaire;
}

public void afficher() {
	System.out.print(this.nom + " " + this.prenom + ", ");
}


}












