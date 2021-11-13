package Principal;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import java.util.ArrayList;

import Modelagem.Carro;
import Modelagem.Marca;
import Modelagem.Modelo;

public class Principal {
	
	// atributos static sao atributos de classe
	private static Carro[] vagas = new Carro[100]; // o estacionamento tem 100 vagas numeradas de 0..99
	private static ArrayList<Marca> marcas = new ArrayList<Marca>();
	private static ArrayList<Carro> historico = new ArrayList<Carro>();
	
	// eventualmente outros atributos static
	private static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {
        // Adicionando marcas HardCoded
		Marca Jeep = new Marca("Jeep");
		Marca Ford = new Marca("Ford");
		Modelo Teste = new Modelo("Teste");
		Ford.addModelos(Teste);

		marcas.add(Jeep);
		marcas.add(Ford);

		menu();
        
    }
	
	private static void entradaCarro() {
		// Listar as marcas
		System.out.println("\n==> Escolha a marca do carro\n");
		listarMarcas();
		// Opcoes para marcas
		int opcaoMarca = scanner.nextInt();
		if(opcaoMarca < 0 || opcaoMarca > marcas.size()){
			System.out.println("\nOpcao invalida.\n");
		}
		else if(opcaoMarca == 0){
			// Adicionar uma marca se não houver
			cadastrarMarca();
		}
		else{
			Marca marcaEscolhida = marcas.get(opcaoMarca - 1);

			// Listar os modelos
			listarModelos(marcaEscolhida);
			
			int opcaoModelo = scanner.nextInt();
			// Adicionar um modelo se não houver

			// Receber a Placa do carro

			// Cadastrar o horário de entrada



		}

	}
		// criar o carro e cadastra-lo no vetor na posicao correta
	
	
	private static float saidaCarro() {
		System.out.println("Voce entrou no metodo saidaCarro().");
		float preco = 0;
		// logica para calcular preco do estacionamento e coloca-lo no historico
		return preco;
	}
	
	private static void listarMarcas(){
		System.out.println("0 - Cadastrar nova marca");
		
		for(int i=0; i<marcas.size(); i++) { 
			System.out.println( (i + 1) + " - " + marcas.get(i).getNome());
		}

		}

	private static void listarModelos(Marca marcaEscolhida){
		System.out.println("0 - Cadastrar nova marca");

		for(int i=0; i < marcaEscolhida.getModelos().size(); i++) { 
			System.out.println( (i + 1) + " - " + marcaEscolhida.getModelos().get(i).getNome());
		}

		}

	public static void menu(){

		int opcao;

		do{
		System.out.println("\tMenu estacionamento");
	    System.out.println("0. Fim");
	    System.out.println("1. Entrada");
	    System.out.println("2. Saida");
        opcao = scanner.nextInt();
            
            switch(opcao){
				case 0:
                System.out.println("Programa encerrado");	   
				scanner.close();

				break;

            	case 1:
				entradaCarro();
				
				break;
                
            	case 2:
                
				saidaCarro();
				break;
                
            default:
                System.out.println("Opcao invalida.");
            }
        } while(opcao != 0);

	    }
	
	private static void cadastrarMarca() {
			System.out.println("\n==> Cadastro de marca de carro\n");
			String nome;
			
			scanner.nextLine();
			System.out.print("   Marca a ser cadastrada: ");
			nome = scanner.nextLine();
			
			Marca marca = new Marca(nome);
			marcas.add(marca);
		}
		// outros m�todos static conforme especificacao do trabalho e necessidades de implementacao
}