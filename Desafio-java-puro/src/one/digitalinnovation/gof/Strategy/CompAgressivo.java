package one.digitalinnovation.gof.Strategy;

public class CompAgressivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se Agressivamente..");
	}

}
