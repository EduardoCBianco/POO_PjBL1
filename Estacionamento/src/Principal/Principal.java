package Principal;
import java.util.Scanner;

import java.util.ArrayList;

import Modelagem.Carro;
import Modelagem.Marca;
import Modelagem.Modelo;

public class Principal {
	
	// atributos static s�o atributos de classe
	private static Carro[] vagas = new Carro[100]; // o estacionamento tem 100 vagas numeradas de 0..99
	private static ArrayList<Marca> marcas = new ArrayList<Marca>();
	private static ArrayList<Carro> historico = new ArrayList<Carro>();
	
	// eventualmente outros atributos static
	

	
	public static void menu(){
	        System.out.println("\tMenu estacionamento");
	        System.out.println("0. Fim");
	        System.out.println("1. Entrada");
	        System.out.println("2. Sa�da");
	    }
	
	
	
	private static void entradaCarro() {
		System.out.println("Voc� entrou no m�todo entradaCarro().");
	}
		// criar o carro e cadastra-lo no vetor na posicao correta
	
	
	private static float saidaCarro() {
		System.out.println("Voc� entrou no m�todo saidaCarro().");
		float preco = 0;
		// logica para calcular preco do estacionamento e coloca-lo no historico
		return preco;
	}
	
	
	public static void main(String[] args) {
		int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
                entradaCarro();
                break;
                
            case 2:
                saidaCarro();
                break;
                
            default:
                System.out.println("Op��o inv�lida.");
            }
        } while(opcao != 0);
    }
	
	// outros m�todos static conforme especificacao do trabalho e necessidades de implementacao
}
