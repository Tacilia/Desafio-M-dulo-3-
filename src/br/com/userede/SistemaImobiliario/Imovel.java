package br.com.userede.SistemaImobiliario;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
        private String endereco;
        private double valorDoAluguel;
        private Funcionario responsavel;

        private List<Morador> moradores = new ArrayList<>();

        public Imovel() {

        }

        public Imovel(String endereco, double valorDoAluguel, Funcionario responsavel) {
                this.endereco = endereco;
                this.valorDoAluguel = valorDoAluguel;
                this.responsavel = responsavel;
        }

        public String getEndereco() {
                return endereco;
        }

        public void setEndereco(String endereco) {
                this.endereco = endereco;
        }

        public double getValorDoAluguel() {
                return valorDoAluguel;
        }

        public void setValorDoAluguel(double valorDoAluguel) {
                this.valorDoAluguel = valorDoAluguel;
        }

        public Funcionario getResponsavel() {
                return responsavel;
        }

        public void setResponsavel(Funcionario responsavel) {
                this.responsavel = responsavel;
        }

        public List<Morador> getMoradores() {
                return moradores;
        }

        @Override
        public String toString() {
                StringBuilder devolva = new StringBuilder();
                devolva.append("\n ---------------------------- \n");
                devolva.append("\n Endereço: " + endereco + "\n");
                devolva.append("\n Valor do Aluguel: " + valorDoAluguel + "\n");
                devolva.append("\n ---------------------------- \n");
                devolva.append("\n Funcionario: " + responsavel+"\n");
                devolva.append("\n ---------------------------- \n");
                devolva.append("\n Moradores: " + moradores + "\n");
                devolva.append("\n ---------------------------- \n");
                return devolva.toString();
        }
}
