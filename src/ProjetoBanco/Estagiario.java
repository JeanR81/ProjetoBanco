package ProjetoBanco;

import ProjetoBanco.Funcionario;

public class Estagiario extends Funcionario {

    public Estagiario(String nomeFunc, String cargoFunc, Long rgFunc, Long cpfFunc, Float salario, Integer mesesTrabalhados, Long matricula){
        this.nomeFunc = nomeFunc;
        this.cargoFunc = cargoFunc;
        this.rgFunc = rgFunc;
        this.cpfFunc = cpfFunc;
        this.salario = salario;
        this.mesesTrabalhados = mesesTrabalhados;
        this.matricula = matricula;
    }
    public double calcularPlr(double salario){
        return salario*2;
}}
