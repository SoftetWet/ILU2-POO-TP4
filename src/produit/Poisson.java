package produit;

public class Poisson extends Produit {
	String datepeche;

	@Override
	public void dercrireProduit() {
		System.out.println("poisson pêchés " + this.datepeche);
	}
}