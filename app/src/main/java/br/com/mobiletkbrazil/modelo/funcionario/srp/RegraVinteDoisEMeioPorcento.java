package br.com.mobiletkbrazil.modelo.funcionario.srp;

import br.com.mobiletkbrazil.modelo.funcionario.Funcionario;

public class RegraVinteDoisEMeioPorcento implements RegraDeCalculo {

    @Override
    public double calcula(Funcionario funcionario) {
        return funcionario.getSalario() - (funcionario.getSalario() * 0.225);
    }

}
