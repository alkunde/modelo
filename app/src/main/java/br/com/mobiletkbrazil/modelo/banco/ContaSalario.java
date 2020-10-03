package br.com.mobiletkbrazil.modelo.banco;

import br.com.mobiletkbrazil.modelo.banco.lsp.GerenciadorDeContas;

public class ContaSalario extends ContaCorrenteComum {

    private GerenciadorDeContas gerenciador;

    public void deposita(double valor) {
        this.gerenciador.deposita(valor);
    }

    public void saca(double valor) {
        this.gerenciador.saca(valor);
    }

    public double getSaldo() {
        return gerenciador.getSaldo();
    }

    @Override
    public String toString() {
        return "Saldo conta salário -> " + this.getSaldo();
    }
}
