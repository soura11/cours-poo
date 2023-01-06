package org.eclipse.model;

public abstract class Personne {
	private int num;
	private String nom;
	private String prenom;
	
	private static int nbrPersonnes;
	
	{
		Personne.nbrPersonnes++;
	}
	
	public Personne( ) {
		
		
	}
	public Personne(int num, String nom, String prenom) {
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		
	}

	public void setNum(int value) {
		if (value > 0) {
			num = value;
		} else {
			num = 0;
		}
	}
	public int getNum() {
		return num;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public static int getNbrPersonnes() {
		return nbrPersonnes;
	}
	public abstract void afficherDetails();
	
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

}
