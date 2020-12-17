package gestionUtilisateurs;


/* create class Personne */
public class Personne {

	public String matricule;
	public String nom;
	public String prenom;
	public String email;
	public String t�l�phone;
	public Double salaire;
	
	public Personne(String matricule, String nom, String pr�nom, String email, String t�l�phone, Double salaire) {
		
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = pr�nom;
		this.email = email;
		this.t�l�phone = t�l�phone;
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
	this.t�l�phone = phone;
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
	return t�l�phone;
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












