package one.digitalinnovation.gof;

import one.digitalinnovation.gof.Singleton.SingletonEager;
import one.digitalinnovation.gof.Singleton.SingletonLazy;
import one.digitalinnovation.gof.Singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.Strategy.CompAgressivo;
import one.digitalinnovation.gof.Strategy.CompDefensivo;
import one.digitalinnovation.gof.Strategy.CompNormal;
import one.digitalinnovation.gof.Strategy.Comportamento;
import one.digitalinnovation.gof.Strategy.Robo;
import one.digitalinnovation.gof.facade.Facade;

public class teste {
	
	//teste realizados com singleton

	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);

		SingletonLazyHolder lazyhoder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyhoder);
		lazyhoder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyhoder);
		
	//testes realizados com strategy
		
		Comportamento defensivo = new CompDefensivo();
		Comportamento agressivo = new CompAgressivo();
		Comportamento normal = new CompNormal();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		///facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Claudiomiro", "00900099");
		
		
	}

}
