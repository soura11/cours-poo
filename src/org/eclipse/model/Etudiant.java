package org.eclipse.model;

import org.eclipse.interfaces.MiseEnForme;

public class Etudiant extends Personne implements MiseEnForme {
	private String niveau;
	
	public Etudiant() {
		super();
	}

	public Etudiant(int num, String nom, String prenom, String niveau) {
		super(num, nom, prenom);
		this.niveau = niveau;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	@Override
	public void afficherDetails() {
		System.out.println(getNom() + " " + niveau);
		
	}

	@Override
	public String toString() {
		return "Etudiant [niveau=" + niveau + " , " + super.toString() + "]";
	}

	
	
}
