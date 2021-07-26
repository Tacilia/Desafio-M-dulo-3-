package br.com.userede.SistemaImobiliario;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa{

    private String numeroIdentificacao;

    public Funcionario(){

    }

    public Funcionario(String nome, String telefone, String cpf, String identificacao) {
        super(nome, telefone, cpf);
        this.numeroIdentificacao = identificacao;
    }

    public String getIdentificacao() {
        return numeroIdentificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.numeroIdentificacao = identificacao;
    }

    @Override
    public String toString() {
        StringBuilder devolve = new StringBuilder();
        devolve.append(super.toString());
        devolve.append("\n Identificação:" +numeroIdentificacao+ "\n");
        devolve.append("\n ------------------------ \n");
        return devolve.toString();
    }
}
