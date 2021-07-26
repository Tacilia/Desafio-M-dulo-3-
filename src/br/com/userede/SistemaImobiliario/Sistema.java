package br.com.userede.SistemaImobiliario;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Imovel> imoveis = new ArrayList<>();
    private Funcionario responsavel;

    public Sistema(){

    }
    public void executarSistema(){
        int opcao = 0;
        while (opcao != 5){
            System.out.println("Digite uma das opções abaixo:");
            System.out.println("1 - Cadastrar o Funcionario");
            System.out.println("2 - Cadastrar o Imovel");
            System.out.println("5 - Encerrar o Sistema");

            opcao = IO.usuarioDigita().nextInt();
            switch (opcao){
                case 1:
                    this.cadastrarFuncionario();
                    break;
                case 2:
                    this.cadastrarImovel();
                    break;
            }
        }
        System.out.println(this.imoveis);
    }
    public void cadastrarFuncionario(){
        System.out.println("Digite o número de identificação do Funcionario: ");
        String numeroIdentificacao = IO.usuarioDigita().nextLine();
        System.out.println("Digite o nome do Funcionario: ");
        String nome = IO.usuarioDigita().nextLine();
        System.out.println("Digite o cpf do Funcionario: ");
        String cpf = IO.usuarioDigita().nextLine();
        System.out.println("Digite o telefone do Funcionario: ");
        String telefone = IO.usuarioDigita().nextLine();
        this.responsavel = new Funcionario(nome, cpf, telefone, numeroIdentificacao);
    }

    private Morador cadastrarMorador(){
        System.out.println("Digite o numero do contrato: ");
        String numeroContrato = IO.usuarioDigita().nextLine();
        System.out.println("Digite o nome do Morador: ");
        String nome = IO.usuarioDigita().nextLine();
        System.out.println("Digite o cpf do Morador: ");
        String cpf = IO.usuarioDigita().nextLine();
        System.out.println("Digite o telefone do Morador: ");
        String telefone = IO.usuarioDigita().nextLine();
        Morador morador = new Morador(nome, cpf, telefone, numeroContrato);
        return morador;
    }

    public void cadastrarImovel() {
        System.out.println("Digite o endereço do Imovel: ");
        String endereco = IO.usuarioDigita().nextLine();
        System.out.println("Digite o valor do Aluguel: ");
        double valorDoAluguel = IO.usuarioDigita().nextDouble();
        Imovel imovel = new Imovel(endereco, valorDoAluguel, this.responsavel);
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("Digite uma das opções abaixo:");
            System.out.println("3 - Cadastrar um morador");
            System.out.println("4 - Encerrar o cadastro do Imóvel");

            opcao = IO.usuarioDigita().nextInt();
            switch (opcao) {
                case 3:
                    Morador morador = this.cadastrarMorador();
                    imovel.getMoradores().add(morador);
                    break;
            }
        }
        this.imoveis.add(imovel);
    }
}
