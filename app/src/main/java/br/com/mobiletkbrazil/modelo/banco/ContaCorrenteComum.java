package br.com.mobiletkbrazil.modelo.banco;

import br.com.mobiletkbrazil.modelo.banco.lsp.GerenciadorDeContas;

public class ContaCorrenteComum {

    private GerenciadorDeContas gerenciador;

    public ContaCorrenteComum() {
        this.gerenciador = new GerenciadorDeContas();
    }

    public void deposita(double valor) {
        this.gerenciador.deposita(valor);
    }

    public void saca(double valor) {
        this.gerenciador.saca(valor);
    }

    public double getSaldo() {
        return this.gerenciador.getSaldo();
    }

    @Override
    public String toString() {
        return "Saldo conta corrente -> " + this.getSaldo();
    }
}
