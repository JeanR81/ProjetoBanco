package ProjetoBanco;

public class Funcionario {
    protected static String nomeFunc;
    protected static String cargoFunc;
    protected static Long rgFunc;
    protected static Long cpfFunc;
    protected static double salario;
    protected static int mesesTrabalhados;
    protected static double ferias;
    protected static double plr;
    protected static long matricula;

    public Funcionario(){};

    public Funcionario(String nomeFunc, String cargoFunc, Long rgFunc, Long cpfFunc, Float salario, Integer mesesTrabalhados, Double ferias, Double plr, Long matricula) {
        this.nomeFunc = nomeFunc;
        this.cargoFunc = cargoFunc;
        this.rgFunc = rgFunc;
        this.cpfFunc = cpfFunc;
        this.salario = salario;
        this.mesesTrabalhados = mesesTrabalhados;
        this.ferias = ferias;
        this.plr = plr;
        this.matricula = matricula;
        }


    public double calcularFerias (double salario, int mesesTrabalhados){
            return  ((salario * mesesTrabalhados) / 12) + (salario / 3);
        }
        public double calcularPlr (double salario){
            return salario * 3;
        }

        public long identificacaoFuncionario (){
            return this.matricula;
        }


    }




