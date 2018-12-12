package Aula27_Metos_Retornos;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();//instanciando o objeto do tipo carro.Criando uma variavel do tipo classe carro para usar os seus metodos
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiro = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		double automia = van.obeterAutonomia();
		System.out.println("A autonomia do carro é: " + automia);
		System.out.println("A autonomia do carro é: " + van.obeterAutonomia());
		
		double qtdCombustivel = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		System.out.println("Quantidade de combustivel por km: " + qtdCombustivel);
		System.out.println("Quantidade de combustivel por km: " + qtdCombustivel15);


	}

}
