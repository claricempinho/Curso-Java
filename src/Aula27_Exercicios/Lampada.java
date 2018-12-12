package Aula27_Exercicios;

public class Lampada {
	String potencia;
	String tensao;
	int temperatura;
	String cor;
	String filamento;
	boolean ligada;
	boolean desligada;
	
	void ligar() {
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if(ligada) {
			System.out.println("Ligada");
		}else {
			System.out.println("Desligada");
		}
	}
	
	void mudarEstado() {
		if (ligada) {
			desligar();
		}else {
			ligar();
		}
	}
}
