package Aula26_Metodo_Retorno;

public class Carro {
	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A automia do carro é:" + capCombustivel * consumoCombustivel + "km");
	}
	
	double obeterAutonomia(){
		
		System.out.println("Metodo Autonomia foi chamdo.");
		return capCombustivel * consumoCombustivel;
	}

}