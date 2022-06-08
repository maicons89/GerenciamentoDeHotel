package hotel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class GerenciamentoHotel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		int opcaoMenu;
		int opcaoMenuCliente;
		int opcaoMenuQuarto;
		int codigoCliente;
		int codigoQuarto;
		int codigoExclusaoCliente;
		int codigoExclusaoQuarto;
		int capacidadeQuarto;
		int codigoEdicaoCliente;
		int codigoEdicaoQuarto;
		int codigoQuartoCheckin;
		int codigoQuartoCheckOut;
		String posicaoQuarto;
		String nomeQuarto;
		String nomeCliente;
		String dataNascimentoCliente;
		String emailCliente;
		String telefoneCliente;
		String cidadeCliente;
		String ufCliente;
		String fumanteCliente;
		String fumanteQuarto;
		double valorDaDiaria;
		ArrayList<Cliente> listaDeClientes = new ArrayList<>();
		ArrayList<Quarto> listaDeQuartos = new ArrayList<>();

		do {

			System.out.println("\n================================");
			System.out.println("Sistema de Gerenciamento de Hotel");
			System.out.println("=================================\n");
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastro de Cliente");
			System.out.println("2 - Cadastro de Quarto");
			System.out.println("3 - Listar Quartos Disponíveis Para Alocação");
			System.out.println("4 - Realizar Check-in");
			System.out.println("5 - Realizar Check-out");
			opcaoMenu = mostrarTeclado.nextInt();
			mostrarTeclado.nextLine();

			switch (opcaoMenu) {
			case 1: // Menu do Cliente
				do {
					System.out.println("1 - Adicionar Cliente");
					System.out.println("2 - Editar Cliente");
					System.out.println("3 - Excluir Cliente");
					System.out.println("4 - Listar Cliente");
					System.out.println("0 - Retornar ao Menu Inicial");
					opcaoMenuCliente = mostrarTeclado.nextInt();
					mostrarTeclado.nextLine();

					switch (opcaoMenuCliente) {
					case 1: // Adicionar Cliente
						System.out.println("Digite o código do cliente");
						codigoCliente = mostrarTeclado.nextInt();
						mostrarTeclado.nextLine();
						System.out.println("Digite o nome do cliente:");
						nomeCliente = mostrarTeclado.nextLine();
						System.out.println("Digite a data de nascimento do cliente:");
						dataNascimentoCliente = mostrarTeclado.nextLine();
						System.out.println("Digite o e-mail do cliente");
						emailCliente = mostrarTeclado.nextLine();
						System.out.println("Digite o telefone do cliente:");
						telefoneCliente = mostrarTeclado.nextLine();
						System.out.println("Digite a cidade do cliente:");
						cidadeCliente = mostrarTeclado.nextLine();
						System.out.println("Digite a UF do cliente:");
						ufCliente = mostrarTeclado.nextLine();
						System.out.println("Digite [S] cliente Fumante ou [N] cliente não Fumante");
						fumanteCliente = mostrarTeclado.nextLine();

						Cliente cliente = new Cliente();
						cliente.setCodigoCliente(codigoCliente);
						cliente.setNome(nomeCliente);
						cliente.setDataNascimento(dataNascimentoCliente);
						cliente.setEmail(emailCliente);
						cliente.setTelefone(telefoneCliente);
						cliente.setCidade(cidadeCliente);
						cliente.setUf(ufCliente);
						cliente.setFumante(fumanteCliente);

						listaDeClientes.add(cliente);
						break;
						
					case 2: // Editar Cliente
						System.out.println("Digite o código identificador do cliente que vocÊ gostaria de EDITAR: ");
						codigoEdicaoCliente = mostrarTeclado.nextInt();
						mostrarTeclado.nextLine();
						Cliente clienteAlteracao = null;
						for (int i = 0; i < listaDeClientes.size(); i++) {
							if (listaDeClientes.get(i).getCodigoCliente() == codigoEdicaoCliente) {
								clienteAlteracao = listaDeClientes.get(i);
								break;
							}
						}

						if (clienteAlteracao != null) {

							System.out.println("Digite o nome do cliente:");
							nomeCliente = mostrarTeclado.nextLine();
							System.out.println("Digite a data de nascimento do cliente:");
							dataNascimentoCliente = mostrarTeclado.nextLine();
							System.out.println("Digite o e-mail do cliente");
							emailCliente = mostrarTeclado.nextLine();
							System.out.println("Digite o telefone do cliente:");
							telefoneCliente = mostrarTeclado.nextLine();
							System.out.println("Digite a cidade do cliente:");
							cidadeCliente = mostrarTeclado.nextLine();
							System.out.println("Digite a UF do cliente:");
							ufCliente = mostrarTeclado.nextLine();
							System.out.println("Digite [S] cliente Fumante ou [N] cliente não Fumante");
							fumanteCliente = mostrarTeclado.nextLine();

							clienteAlteracao.setNome(nomeCliente);
							clienteAlteracao.setDataNascimento(dataNascimentoCliente);
							clienteAlteracao.setEmail(emailCliente);
							clienteAlteracao.setTelefone(telefoneCliente);
							clienteAlteracao.setCidade(cidadeCliente);
							clienteAlteracao.setUf(ufCliente);
							clienteAlteracao.setFumante(fumanteCliente);
							System.out.println("Cliente alterado com sucesso.");
						} else {
							System.out.println("Cliente não encontrado.");
						}
						break;
						
					case 3: // Excluir Cliente
						System.out.println("Digite o código identificador do cliente que vocÊ gostaria de EXCLUIR: ");
						codigoExclusaoCliente = mostrarTeclado.nextInt();
						Cliente clienteExclusao = null;
						for (int i = 0; i < listaDeClientes.size(); i++) {
							if (listaDeClientes.get(i).getCodigoCliente() == codigoExclusaoCliente) {
								clienteExclusao = listaDeClientes.get(i);
								break;
							}
						}
						if (clienteExclusao != null) {
							listaDeClientes.remove(clienteExclusao);
						} else {
							System.out.println("Cliente não encontrado.");
						}
						break;
						
					case 4:// Listar Clientes
						for (int i = 0; i < listaDeClientes.size(); i++) {
							System.out.println("Código do Cliente: " + listaDeClientes.get(i).getCodigoCliente());
							System.out.println("Nome do Cliente: " + listaDeClientes.get(i).getNome());
							System.out.println("Email do Cliente: " + listaDeClientes.get(i).getEmail());
							System.out.println("----------------------------");
						}
						break;
					case 0:
						break;
					default:
						System.out.println("Número inválido");
						break;
					}
				} while (opcaoMenuCliente != 0);
				break;

			case 2: // Opção Menu Quarto
				do {
					System.out.println("1 - Adicionar Quarto");
					System.out.println("2 - Editar Quarto");
					System.out.println("3 - Excluir Quarto");
					System.out.println("4 - Listar Quarto");
					System.out.println("0 - Retornar ao Menu Inicial");
					opcaoMenuQuarto = mostrarTeclado.nextInt();
					mostrarTeclado.nextLine();

					switch (opcaoMenuQuarto) {
					case 1:
						System.out.println("Digite o código do quarto:");
						codigoQuarto = mostrarTeclado.nextInt();
						mostrarTeclado.nextLine();
						System.out.println("Digite o nome do quarto:");
						nomeQuarto = mostrarTeclado.nextLine();
						System.out.println("Digite a posição do quarto:");
						posicaoQuarto = mostrarTeclado.nextLine();
						System.out.println("Digite a capacidade do quarto:");
						capacidadeQuarto = mostrarTeclado.nextInt();
						mostrarTeclado.nextLine();
						System.out.println("Digite se aceita fumante [S] ou [N]:");
						fumanteQuarto = mostrarTeclado.nextLine();
						System.out.println("Digite o valor da diária:");
						valorDaDiaria = mostrarTeclado.nextDouble();

						Quarto quarto = new Quarto();
						quarto.setCodigoQuarto(codigoQuarto);
						quarto.setNome(nomeQuarto);
						quarto.setPosicao(posicaoQuarto);
						quarto.setCapacidadePessoasQuarto(capacidadeQuarto);
						quarto.setFumante(fumanteQuarto);
						quarto.setValorDaDiaria(valorDaDiaria);
						quarto.setOcupado(false);
						listaDeQuartos.add(quarto);
						break;
						
					case 2: // Editar Quarto
						System.out.println("Digite o código identificador do quarto que vocÊ gostaria de EDITAR: ");
						codigoEdicaoQuarto = mostrarTeclado.nextInt();
						mostrarTeclado.nextLine();
						Quarto quartoAlteracao = null;
						for (int i = 0; i < listaDeQuartos.size(); i++) {
							if (listaDeQuartos.get(i).getCodigoQuarto() == codigoEdicaoQuarto) {
								quartoAlteracao = listaDeQuartos.get(i);
								break;
							}
						}
						if (quartoAlteracao != null) {
							System.out.println("Digite o nome do quarto:");
							nomeQuarto = mostrarTeclado.nextLine();
							System.out.println("Digite a posição do quarto:");
							posicaoQuarto = mostrarTeclado.nextLine();
							System.out.println("Digite a capacidade do quarto:");
							capacidadeQuarto = mostrarTeclado.nextInt();
							mostrarTeclado.nextLine();
							System.out.println("Digite se aceita fumante [S] ou [N]:");
							fumanteQuarto = mostrarTeclado.nextLine();
							System.out.println("Digite o valor da diária:");
							valorDaDiaria = mostrarTeclado.nextDouble();

							quartoAlteracao.setNome(nomeQuarto);
							quartoAlteracao.setPosicao(posicaoQuarto);
							quartoAlteracao.setCapacidadePessoasQuarto(capacidadeQuarto);
							quartoAlteracao.setFumante(fumanteQuarto);
							quartoAlteracao.setValorDaDiaria(valorDaDiaria);
							System.out.println("Quarto alterado com sucesso.");
						} else {
							System.out.println("Quarto não encontrado.");
						}
						break;
						
					case 3: // Excluir Quarto
						System.out.println("Digite o código identificador do quarto que você gostaria de EXCLUIR: ");
						codigoExclusaoQuarto = mostrarTeclado.nextInt();
						Quarto quartoExclusao = null;
						for (int i = 0; i < listaDeQuartos.size(); i++) {
							if (listaDeQuartos.get(i).getCodigoQuarto() == codigoExclusaoQuarto) {
								quartoExclusao = listaDeQuartos.get(i);
								break;
							}
						}
						if (quartoExclusao != null) {
							listaDeQuartos.remove(quartoExclusao);
						} else {
							System.out.println("Quarto não encontrado.");
						}
						break;
						
					case 4: // Listar Quartos
						for (int i = 0; i < listaDeQuartos.size(); i++) {
							System.out.println("Código do Quarto: " + listaDeQuartos.get(i).getCodigoQuarto());
							System.out.println("Nome do Quarto: " + listaDeQuartos.get(i).getNome());
							System.out.println("----------------------");
						}
						break;
						
					case 0:
						break;
						
					default:
						System.out.println("Número inválido");
						break;
					}
				} while (opcaoMenuQuarto != 0);
				break;
				
			case 3: // Listar quartos disponíveis
				for (int i = 0; i < listaDeQuartos.size(); i++) {
					if (listaDeQuartos.get(i).isOcupado() == false) {
						System.out.println("Código do Quarto: " + listaDeQuartos.get(i).getCodigoQuarto());
						System.out.println("Nome do Quarto: " + listaDeQuartos.get(i).getNome());
						System.out.println("----------------------");
					}
				}
				break;

			case 4: // check-in
				System.out.println("CHECK-IN");
				System.out.println("Qual o código do quarto?");
				codigoQuartoCheckin = mostrarTeclado.nextInt();
				mostrarTeclado.nextLine();

				Quarto quartoCheckin = null;
				for (int i = 0; i < listaDeQuartos.size(); i++) {
					if (listaDeQuartos.get(i).getCodigoQuarto() == codigoQuartoCheckin) {
						quartoCheckin = listaDeQuartos.get(i);
						break;
					}
				}
				if (quartoCheckin != null) {
					quartoCheckin.setOcupado(true);
					System.out.println("Check-in realizado com sucesso.");
				} else {
					System.out.println("Quarto não encontrado.");
				}
				break;
				
			case 5: // check-out
				System.out.println("CHECK-OUT");
				System.out.println("Qual o código do quarto?");
				codigoQuartoCheckOut = mostrarTeclado.nextInt();
				mostrarTeclado.nextLine();
				
				Quarto quartoCheckOut = null;
				for (int i = 0; i < listaDeQuartos.size(); i++) {
					if (listaDeQuartos.get(i).getCodigoQuarto() == codigoQuartoCheckOut) {
						quartoCheckOut = listaDeQuartos.get(i);
						break;
					}
				}
				if (quartoCheckOut != null) {
					quartoCheckOut.setOcupado(false);
					System.out.println("Check-out realizado com sucesso.");
				} else {
					System.out.println("Quarto não encontrado.");
				}
				break;
				
			case 0:
				System.out.println("Encerrado");
				break;
				
			default:
				System.out.println("Opção inválida");
			}
		} while (opcaoMenu != 0);
	}
}