package CadastroPoo;

import java.io.IOException;
import Model.PessoaFisica;
import Model.PessoaFisicaRepo;
import Model.PessoaJuridica;
import Model.PessoaJuridicaRepo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroPOO {

    private static final Scanner scan = new Scanner(System.in);
    private static final PessoaFisicaRepo rPessoaFisica = new PessoaFisicaRepo();
    private static final PessoaJuridicaRepo rPessoaJuridica = new PessoaJuridicaRepo();

    public static void main(String[] args) {
        try (scan) {
            int opcao;
            do {
                exibirMenu();
                opcao = receberOpcao();
                switch (opcao) {
                    case 1 -> incluirPessoa();
                    case 2 -> alterarPessoa();
                    case 3 -> excluirPessoa();
                    case 4 -> exibirPessoaId();
                    case 5 -> exibirTodasPessoas();
                    case 6 -> salvarDados();
                    case 7 -> recuperarDados();
                    case 0 -> System.out.println("Estamos Finalizando . . .");
                    default -> System.out.println("Opção inválida.");
                }
            } while (opcao != 0);
        }
    }

    private static void exibirMenu() {
        System.out.println("Selecione uma opção: ");
        System.out.println("1 - Incluir");
        System.out.println("2 - Alterar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Exibir pelo ID");
        System.out.println("5 - Exibir todos");
        System.out.println("6 - Salvar dados");
        System.out.println("7 - Recuperar dados");
        System.out.println("0 - Finalizar");
    }

    private static int receberOpcao() {
        System.out.print("opção: ");
        return scan.nextInt();
    }

    private static void incluirPessoa() {
        System.out.println("Escolha a Opção (1) - Pessoa Física, (2) - Pessoa Juridica:");
        int cadastroTipo = scan.nextInt();
        scan.nextLine();
        try {
            switch (cadastroTipo) {
                case 1 -> inclurPessoaFisica();
                case 2 -> incluirPessoaJuridica();
                default -> System.out.println("Opção inválida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada invalida, Cetifique-se de colocar um número valido.");
        }
    }

    private static void inclurPessoaFisica() {
        System.out.println("Entre com o ID, Nome, CPF e Idade: ");
        int id = scan.nextInt();
        String nome = scan.next();
        String cpf = scan.next();
        int idade = scan.nextInt();
        rPessoaFisica.inserir(new PessoaFisica(id, nome, idade, cpf));
        System.out.println("Pessoa fisica cadastrada com Exito!");
    }

    private static void incluirPessoaJuridica() {
        System.out.println("Entre com o ID, Nome e CNPJ: ");
        int id = scan.nextInt();
        String nome = scan.next();
        String cnpj = scan.next();
        rPessoaJuridica.inserir(new PessoaJuridica(id, nome, cnpj));
        System.out.println("Pessoa Juridica cadastrada com Exito! ");
    }

    private static void alterarPessoa() {
        System.out.println("Escolha a opcao (1) - Pessoa Física, (2) - Pessoa Juridica:");
        int cadastroTipo = scan.nextInt();
        scan.nextInt();
        try {
            switch (STR) {
                case 1 -> alterarPessoaFisica();
                case 2 -> alterarPessoaJuridica();
                default -> System.out.println("Opção Inválida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada invalida, Cetifique-se de colocar um número valido.");
        }
    }

    private static void alterarPessoaFisica(){
        
    }
