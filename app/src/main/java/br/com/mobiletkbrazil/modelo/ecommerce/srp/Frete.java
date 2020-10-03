package br.com.mobiletkbrazil.modelo.ecommerce.srp;

public class Frete implements ServicoDeFrete {

    @Override
    public double calculaFrente(String estado) {
        if ("SAO PAULO".equals(estado.toUpperCase())) {
            return 7.5;
        } else if ("MINAS GERAIS".equals(estado.toUpperCase())) {
            return 12.5;
        } else if ("RIO DE JANEIRO".equals(estado.toUpperCase())) {
            return 10.5;
        } else {
            return 10.0;
        }
    }
}
