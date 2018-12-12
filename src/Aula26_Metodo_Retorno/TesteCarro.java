package Aula26_Metodo_Retorno;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiro = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 20;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		double automia = van.obeterAutonomia();
		System.out.println("A autonomia do carro é:" + automia);
		System.out.println("A autonomia do carro é:" + van.obeterAutonomia());

	}

}
