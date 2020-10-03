package br.com.mobiletkbrazil.modelo.ecommerce;

import br.com.mobiletkbrazil.modelo.ecommerce.srp.ServicoDeFrete;
import br.com.mobiletkbrazil.modelo.ecommerce.srp.TabelaDePreco;

public class CalculadoraDePrecos {

    private TabelaDePreco tabela;
    private ServicoDeFrete frete;

    public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeFrete frete) {
        this.tabela = tabela;
        this.frete = frete;
    }

    public double calcula(Produto produto) {
        double desconto = tabela.calculaDesconto(produto.getValor());
        double valorFrete = frete.calculaFrente(produto.getEstado());
        return produto.getValor() * (1 - desconto) + valorFrete;
    }
}
