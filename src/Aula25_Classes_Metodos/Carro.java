package Aula25_Classes_Metodos;

public class Carro {
	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A automia do carro é:" + capCombustivel * consumoCombustivel + "km");
	}

}
