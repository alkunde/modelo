package br.com.mobiletkbrazil.modelo.banco;

public class ContaSalario extends ContaCorrenteComum {

    public void rende() {
        throw new Exception("Essa conta não possui rendimento");
    }
}
