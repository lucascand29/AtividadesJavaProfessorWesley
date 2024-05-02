package atividadesPratica10;

import java.util.Scanner;

public class Atividade01 {

	class Veiculo {

		private String numeroChassi;
		private String placa;
		private String marca;
		private String modelo;
		private int ano;

		public Veiculo(String numeroChassi, String placa, String marca, String modelo, int ano) {
			super();
			this.numeroChassi = numeroChassi;
			this.placa = placa;
			this.marca = marca;
			this.modelo = modelo;
			this.ano = ano;
		}

		public String getNumeroChassi() {
			return numeroChassi;

		}

		public String getPlaca() {
			return placa;
		}

		public void imprimirVeiculo() {
			System.out.println("Número do chassi: " + numeroChassi);
			System.out.println("Placa: " + placa);
			System.out.println("Marca: " + marca);
			System.out.println("Modelo: " + modelo);
			System.out.println("Ano: " + ano);
		}

	}

	class CadastroVeiculos {
		private Veiculo[] veiculos;
		private int tamanho;

		public CadastroVeiculos(int capacidade) {
			veiculos = new Veiculo[capacidade];
			tamanho = 0;
		}

		public void adicionarVeiculo(Veiculo veiculo) {
			veiculos[tamanho] = veiculo;
			tamanho++;
		}

		public void imprimirVeiculos() {
			System.out.println("Veiculos cadastrados:");
			for (int i = 0; i < tamanho; i++) {
				veiculos[i].imprimirVeiculo();
				System.out.println();
			}
		}

		public Veiculo pesquisarVeiculo(String chave) {
			for (int i = 0; i < tamanho; i++) {
				if (veiculos[i].getNumeroChassi().equals(chave) || veiculos[i].getPlaca().equals(chave)) {
					return veiculos[i];
				}
			}
			return null;
		}

		public void excluirVeiculo(String chave) {
			for (int i = 0; i < tamanho; i++) {
				if (veiculos[i].getNumeroChassi().equals(chave) || veiculos[i].getPlaca().equals(chave)) {
					veiculos[i] = veiculos[tamanho - 1];
					veiculos[tamanho - 1] = null;
					tamanho--;
					System.out.println("Veículo excluído com sucesso.");
					return;
				}
			}
			System.out.println("Veículo não encontrado.");
		}
	}
	
	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        CadastroVeiculos cadastro = new CadastroVeiculos(100); 

	        while (true) {
	            System.out.println("Menu:");
	            System.out.println("1. Adicionar veículo");
	            System.out.println("2. Imprimir veículos cadastrados");
	            System.out.println("3. Pesquisar veículo");
	            System.out.println("4. Excluir veículo");
	            System.out.println("5. Sair");
	            System.out.print("Escolha uma opção: ");
	            int opcao = scanner.nextInt();
	            scanner.nextLine(); 
	            switch (opcao) {
	                case 1:
	                    System.out.println("Digite o número do chassi:");
	                    String numeroChassi = scanner.nextLine();
	                    System.out.println("Digite a placa:");
	                    String placa = scanner.nextLine();
	                    System.out.println("Digite a marca:");
	                    String marca = scanner.nextLine();
	                    System.out.println("Digite o modelo:");
	                    String modelo = scanner.nextLine();
	                    System.out.println("Digite o ano:");
	                    int ano = scanner.nextInt();
	                    Veiculo veiculo = new Veiculo(numeroChassi, placa, marca, modelo, ano);
	                    cadastro.adicionarVeiculo(veiculo);
	                    break;
	                case 2:
	                    cadastro.imprimirVeiculos();
	                    break;
	                case 3:
	                    System.out.println("Digite o número do chassi ou placa do veículo:");
	                    String chavePesquisa = scanner.nextLine();
	                    Veiculo encontrado = cadastro.pesquisarVeiculo(chavePesquisa);
	                    if (encontrado != null) {
	                        encontrado.imprimirVeiculo();
	                    } else {
	                        System.out.println("Veículo não encontrado.");
	                    }
	                    break;
	                case 4:
	                    System.out.println("Digite o número do chassi ou placa do veículo a ser excluído:");
	                    String chaveExclusao = scanner.nextLine();
	                    cadastro.excluirVeiculo(chaveExclusao);
	                    break;
	                case 5:
	                    System.out.println("Saindo do programa...");
	                    return;
	                default:
	                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
	            }
	        }
	    }
	}
}
