package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	int poids;
	Gaulois chasseur;
	
	

	@Override
	public void dercrireProduit() {
		System.out.println("sanglier de " + Integer.toString(this.poids) + "kg chass� par " + chasseur.getNom());   
	}
}