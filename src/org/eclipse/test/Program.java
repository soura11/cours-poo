package org.eclipse.test;

import org.eclipse.enums.Sport;
import org.eclipse.model.Enseignant;
import org.eclipse.model.Etudiant;
import org.eclipse.model.Personne;

public class Program {

	public static void main(String[] args) {
//		System.err.println(Personne.getNbrPersonnes());
//		Personne personne = new Personne();
//		personne.setNum(100);
//		personne.setNom("wick");
//		personne.setPrenom("john");
//		System.out.println(personne);
//		System.err.println(Personne.getNbrPersonnes());
//		
//		Personne personne2 = new Personne(200, "Dalton", "Jack");
//		System.out.println(personne2);
//		System.err.println(Personne.getNbrPersonnes());
//		Enseignant enseignant = new Enseignant(400, "Baggio", "Roberto", 1700);
//		System.out.println(enseignant);
//		Etudiant etudiant = new Etudiant(500, "Abruzzi", "John", "Licence");
//		System.out.println(etudiant);
//		// Personne e = new Etudiant(500, "Abruzzi", "John", "Licence"); // un etudiant peut être une personne donc syntaxe juste
//		// Etudiant p = new Personnne(200, "Dalton", "Jack") ne marche pas car une personne n'est pas un etudiant
//		
//		System.out.println(etudiant instanceof Etudiant);
//		System.out.println(etudiant instanceof Personne);
//		System.out.println(personne instanceof Etudiant );
//		System.out.println(etudiant.getClass().getSimpleName());
//		System.out.println(etudiant.getClass().getSuperclass().getSimpleName());
//		
//		Personne[] personnes = {personne2, enseignant, etudiant};
//		for (Personne elt : personnes) {
//			if(elt instanceof Etudiant et) {
//				System.out.println(et.getNiveau());
//			} else if (elt instanceof Enseignant es) {
//				System.out.println(es.getSalaire());
//			} else {
//				System.out.println(elt.getNum());
		Enseignant enseignant = new Enseignant(400, "Baggio", "Roberto", 1700);
		enseignant.afficherDetails();
		Etudiant etudiant = new Etudiant(500, "Abruzzi", "John", "Licence");
		etudiant.afficherDetails();
		enseignant.afficherNomEnMajuscule();
		etudiant.afficherNomEnMajuscule();
		Sport sport = Sport.HANDBALL;
		System.out.println(sport);
		System.out.println(sport.ordinal());
//				
//			}
//		}
	}

}
