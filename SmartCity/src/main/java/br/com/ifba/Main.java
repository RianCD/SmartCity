package br.com.ifba;

import br.com.ifba.controller.AdministradorController;
import br.com.ifba.controller.MoradorController;
import br.com.ifba.controller.OcorrenciaController;
import br.com.ifba.entity.*;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        MoradorController moradorController = new MoradorController();
        OcorrenciaController ocorrenciaController = new OcorrenciaController();
        AdministradorController administradorController = new AdministradorController();

        do {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Bem-vindo ao SmartCity");
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Administrador (1) ou Morador (2)? \n0 - Sair");
            System.out.println("Escolha uma opção: ");
            option = sc.nextInt();
            switch (option){
                case 1:
                    do {
                        System.out.println("1 - Criar conta\n2 - Entrar\n3 - Sair");
                        System.out.println("Escolha uma opção: ");
                        option = sc.nextInt();
                        switch (option){
                            case 1:
                                System.out.println("Informe seu nome: ");
                                String nomeAdministrador = sc.next().toUpperCase();
                                System.out.println("Informe seu email: ");
                                String email = sc.next().toUpperCase();
                                System.out.println("Informe seu telefone: ");
                                String telefone = sc.next().toUpperCase();
                                System.out.println("Informe sua senha: ");
                                String senha = sc.next().toUpperCase();
                                Administrador administrador = new Administrador(nomeAdministrador, telefone,email,senha, ocorrenciaController);
                                administradorController.cadastrarAdministrador(administrador);
                                break;
                            case 2:
                                System.out.println("Informe seu email: ");
                                String emailAdministrador = sc.next();
                                System.out.println("Informe sua senha: ");
                                String senhaAdministrador = sc.next();
                                Administrador administradorLogado = administradorController.buscarAdministradorByEmail(emailAdministrador);
                                /*
                                 * lógica para buscar e validar administrador a ser implementada
                                 *
                                 * */
                                do {
                                    System.out.println("-------------------------Menu do administrador-----------------------");
                                    System.out.println("1 - Visualizar ocorrência");
                                    System.out.println("2 - Visualizar todas ocorrências");
                                    System.out.println("3 - Atualizar status de ocorrência");
                                    System.out.println("4 - Sair do menu de administrador");
                                    System.out.println("Escolha uma opção: ");
                                    option = sc.nextInt();
                                    System.out.println("---------------------------------------------------------------------");
                                    switch (option){
                                        case 1:
                                            System.out.println("Informe o Id da ocorrência: ");
                                            Long idOcorrencia = sc.nextLong();
                                            administradorLogado.visualizarOcorrencia(idOcorrencia);
                                            break;
                                        case 2:
                                            System.out.println("-----------------Listando todas as ocorrências-----------------");
                                            System.out.println("----------------------------------------------------------------");
                                            administradorLogado.visualizarTodasOcorrencias();
                                            System.out.println("----------------------------------------------------------------");
                                            break;
                                        case 3:
                                            System.out.println("Informe o Id da ocorrência: ");
                                            Long id = sc.nextLong();
                                            administradorLogado.visualizarOcorrencia(id);
                                            //esse processo vai necessitar de uma exceção no futuro
                                            System.out.println("Informe o novo status da ocorrência: ");
                                            for (Status status : Status.values())
                                                System.out.println("- " + status.name());
                                            String status = sc.next();
                                            Status novoStatus = Status.valueOf(status.toUpperCase());
                                            administradorLogado.atualizarStatusOcorrencia(novoStatus, id);
                                            administradorLogado.visualizarOcorrencia(id);
                                            System.out.println("Status da ocorrência atualizado com sucesso!");
                                            //--------------------------------------------------------
                                            break;
                                        case 4:
                                            break;
                                        default:
                                            break;
                                    }
                                }while (option != 4);
                                break;
                        }
                    }while (option != 4);
                    break;
                case 2:
                    do {
                        System.out.println("1 - Criar conta\n2 - Entrar\n3 - Sair");
                        System.out.println("Escolha uma opção: ");
                        option = sc.nextInt();
                        switch (option){
                            case 1:
                                System.out.println("Informe seu nome: ");
                                String nomeMorador = sc.next().toUpperCase();
                                System.out.println("Informe seu email: ");
                                String email = sc.next().toUpperCase();
                                System.out.println("Informe seu telefone: ");
                                String telefone = sc.next().toUpperCase();
                                System.out.println("Informe sua senha: ");
                                String senha = sc.next().toUpperCase();
                                Morador morador = new Morador(nomeMorador, telefone,email,senha);
                                moradorController.cadastrarMorador(morador);
                                break;
                            case 2:
                                System.out.println("Informe seu email: ");
                                String emailMorador = sc.next();
                                System.out.println("Informe sua senha: ");
                                String senhaMorador = sc.next();//a validação da senha será feita posteriormente
                                Morador moradorLogado = moradorController.buscarMoradorByEmail(emailMorador);
                                /*
                                 * lógica para buscar e validar morador a ser implementada
                                 *
                                 * */
                                do {
                                    System.out.println("-------------------------Menu do morador-------------------------");
                                    System.out.println("1 - Gerar ocorrência");
                                    System.out.println("2 - Listar ocorrências");
                                    System.out.println("3 - Deletar ocorrência");
                                    System.out.println("4 - Sair");
                                    System.out.println("Escolha uma opção: ");
                                    option = sc.nextInt();
                                    System.out.println("-----------------------------------------------------------------");
                                    switch (option){
                                        case 1:
                                            System.out.println("Titulo da ocorrência: ");
                                            String titulo = sc.next();
                                            System.out.println("Descrição da ocorrência: ");
                                            String descricao = sc.next();
//                                            System.out.println("Data da ocorrência: ");//vai pegar now(); por enquanto
                                            LocalDateTime dataOcorrencia = LocalDateTime.now();
                                            System.out.println("Categoria da ocorrência: ");
                                            for (Categoria c : Categoria.values()){//Mostra as categorias disponíveis
                                                System.out.println("- " + c.name());
                                            }
                                            String nomeCategoria = sc.next();
                                            Categoria categoria = Categoria.valueOf(nomeCategoria.toUpperCase());//vai exigir uma exceção no futuro
                                            System.out.println("-------------Endereço da ocorrência-------------");
                                            System.out.println("-----------------------------------------------------");
                                            System.out.println("Rua: ");
                                            String rua = sc.next();
                                            System.out.println("Numero: ");
                                            int numero = sc.nextInt();
                                            System.out.println("Bairro: ");
                                            String bairro = sc.next();
                                            System.out.println("Cidade: ");
                                            String cidade = sc.next();
                                            System.out.println("CEP: ");
                                            String cep = sc.next();
                                            System.out.println("-----------------------------------------------------");
                                            Endereco endereco = new Endereco(rua, numero, bairro, cidade, cep);
                                            Ocorrencia novaOcorrencia = moradorLogado.gerarOcorrencia(titulo, descricao, dataOcorrencia, categoria,endereco);//vai depender de uma exceção voltada para categoria
                                            System.out.println(novaOcorrencia);
                                            moradorLogado.addOcorrencia(novaOcorrencia);//lista de ocorrencias de um morador
                                            ocorrenciaController.addOcorrencia(novaOcorrencia);//lista de todas as ocorrencias
                                            novaOcorrencia.exibirResumo();
                                            System.out.println("Ocorrência registrada com sucesso!!!");
                                            break;
                                        case 2:
                                            System.out.println("-----------------------------------------------------");
                                            System.out.println("Listando suas ocorrências:");
                                            moradorLogado.listOcorrencias();
                                            System.out.println("-----------------------------------------------------");
                                            break;
                                        case 3:
                                            System.out.println("Informe o Id da ocorrência que deseja excluir: ");
                                            Long id = sc.nextLong();
                                            System.out.println("Resumo da ocorrência: ");
                                            ocorrenciaController.buscarOcorrenciaById(id).exibirResumo();
                                            System.out.println("Tem certeza que deseja deletar essa ocorrência? (1 - SIM / 2 - NÃO");
                                            String escolha = sc.next();
                                            if (escolha.equals("1")){
                                                moradorLogado.deletarOcorrencia(id);
                                                System.out.println("Ocorrência deletada com sucesso!");
                                            }else{
                                                System.out.println("ok...");
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }while (option != 4);
                                break;
                        }
                    }while (option != 3);
                default:
                    break;
            }
        }while (option != 0);
    }
}