package br.com.ifba;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Bem-vindo ao SmartCity");
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("1 - Criar conta\n2 - Entrar");
            System.out.println("Escolha uma opção: ");
            option = sc.nextInt();
            switch (option){
                case 1:
                    break;
                case 2:
                    System.out.println("Você é morador (M) ou administrador (A)? ");

                    System.out.println("Digite seu email: ");
                    String email = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Digite sua senha: ");
                    String senha = sc.nextLine();

                    System.out.println("-------------------------Menu do morador-------------------------");
                    System.out.println("1 - Gerar ocorrência");
                    System.out.println("2 - Listar ocorrências");
                    System.out.println("3 - Sair do menu de morador");
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("-------------------------Menu do administrador-------------------------");
                    System.out.println("1 - Visualizar ocorrência");
                    System.out.println("2 - Visualizar todas ocorrências");
                    System.out.println("3 - Atualizar status de ocorrência");
                    System.out.println("4 - Sair do menu de administrador");
                    System.out.println("-----------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (option != 0);
    }
}