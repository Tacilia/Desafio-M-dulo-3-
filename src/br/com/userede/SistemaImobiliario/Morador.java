package br.com.userede.SistemaImobiliario;

public class Morador extends Pessoa{
    private String numeroContrato;

    public Morador(){

    }
    public Morador(String nome, String telefone, String cpf, String numeroContrato) {
        super(nome, telefone, cpf);
        this.numeroContrato = numeroContrato;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }
    @Override
    public String toString() {
        StringBuilder retorne = new StringBuilder();
        retorne.append(super.toString());
        retorne.append("\n Número do contrato: " + numeroContrato + "\n");
        retorne.append("---------------------------");
        return retorne.toString();
    }
}
