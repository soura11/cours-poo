package org.eclipse.model;

import org.eclipse.interfaces.MiseEnForme;

public class Enseignant extends Personne implements MiseEnForme{
	private int salaire;
	
	
	
	public Enseignant() {
		super();
	}

	public Enseignant (int num, String nom, String prenom, int salaire) {
		super(num, nom, prenom);
		this.salaire = salaire;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	@Override
	public void afficherDetails() {
		System.out.println(getNom() + " " + salaire);
		
	}

	@Override
	public String toString() {
		return "Enseignant [ " + super.toString() + ", salaire=" + salaire + "]";
	}

	@Override
	public void afficherNomEnMajuscule() {
		System.out.println(getNom().toUpperCase());
		
	}

	
	
	
}
