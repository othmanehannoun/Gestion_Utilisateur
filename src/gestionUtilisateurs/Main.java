package gestionUtilisateurs;

import java.util.ArrayList;

public class Main {


	public static void main(String[] args) {
		
		Profil profils[] = new Profil[5];

		profils[0] = new Profil("CP", "Chef de projet");
		profils[1] = new Profil("MN", "Manager");
		profils[2] = new Profil("DP", "Directeur de projet");
		profils[3] = new Profil("DRH", "Directeur des ressources humaines");
		profils[4] = new Profil("DG", "Directeur général");
	
		
		ArrayList<Utilisateur> utilisateur = new ArrayList<Utilisateur>();
		
		
		
		Utilisateur user1 = new Utilisateur("A123", "hannoune", "othmane", "othmane@gmail.com", "0687878787", 5000.0, "othmanhann", "123", "service1", profils[1]);
		Utilisateur user2 = new Utilisateur("B456", "tazi", "ghizlan", "ghizlan@gmail.com", "07654545454", 5000.0, "ghizlan", "AZE", "service2", profils[4]);
		Utilisateur user3 = new Utilisateur("C454", "tz", "hicham", "hicham@gmail.com", "0767676767", 3000.0, "hichamZ", "AQSZ", "service3", profils[0]);

		utilisateur.add(user1);
		utilisateur.add(user2);
		utilisateur.add(user3);
		
		System.out.println("La liste des utilisateurs: ");
		
		for (Utilisateur u : utilisateur) {
			u.afficher();
			
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("");
		System.out.println("La liste des Managers:");
		
		for (Utilisateur u : utilisateur) {
			if(u.profil.code.equals("MN")) {
				u.afficher();;
			}
			
			
		}
		
	}

}
