package produit;

public class Poisson extends Produit {
	String datepeche;

	@Override
	public void dercrireProduit() {
		System.out.println("poisson p�ch�s " + this.datepeche);
	}
}