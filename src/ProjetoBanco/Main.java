package ProjetoBanco;

import Outros.Sistema;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean i = false;
        while (!i) {

            Sistema sistema = new Sistema();
            sistema.iniciarSistema();

            Cliente cliente = new Cliente("Joao da Silva", 563436L, LocalDate.of(1997, 06, 03), 54353L);
            ContaCorrente conta = new ContaCorrente(54353L, 455);
            ContaPoupanca contaPoupanca = new ContaPoupanca(7856L, 43);
            cliente.setConta(conta);
            cliente.setConta(contaPoupanca);

            Cliente cliente2 = new Cliente("Mauro dos Santos", 5641284L, LocalDate.of(1985, 11, 15), 52482157L);
            ContaCorrente conta2 = new ContaCorrente(234578L, 1234);
            ContaPoupanca contaPoupanca2 = new ContaPoupanca(257558L, 257);
            cliente2.setConta(conta2);
            cliente2.setConta(contaPoupanca2);

            Funcionario gerente = new Gerente("José Fernandez", "gerente", 654165486L, 843135464L, 8000.00F, 12, 12345L);
            Funcionario estagiario = new Estagiario("Marcos Oliveira", "estagiário", 65168415L, 65166486L, 2000.00F, 9, 45678L);


            //System.out.println("O limite de credito da conta é " + conta.getLimiteCredito());

            //conta.deposita(BigDecimal.valueOf(8));
            //conta.pedirLimiteCredito();

            //System.out.println("O saldo da conta corrente  é " + conta.getSaldo());

            //System.out.println(cliente.getConta().get(0).getNumeroConta());
            //System.out.println(cliente.getConta().get(1).getNumeroConta());

            //cliente.getContaCorrente().getLimiteCredito();

            //contaPoupanca.deposita(BigDecimal.valueOf(100));
            //System.out.println("O saldo da minha conta poupança é: " + contaPoupanca.getSaldo());
            //contaPoupanca.renderJuros(1.1);
            //System.out.println("O saldo da minha conta poupança é: " + contaPoupanca.getSaldo());


            Scanner entrada = new Scanner(System.in);
            System.out.println("Bem vindo! Digite a opção desejada:\nDigite 1 para FUNCIONÁRIO\nDigite 2 para CLIENTE");
            int opcaoEscolhida = entrada.nextInt();

            if (opcaoEscolhida == 1) {
                System.out.print("Bem vindo FUNCIONÁRIO! Digite sua matrícula.");
                long matricula = entrada.nextLong();
                if (matricula == gerente.identificacaoFuncionario()) {
                } else {
                    System.out.println("Matrícula inválida. Digite novamente");}



                } else if (opcaoEscolhida == 2) {
                    System.out.print("Bem vindo CLIENTE! Digite sua conta.");
                    int identificacaoCliente = entrada.nextInt();

                } else {
                    System.out.println("Por favor, escolha uma opção válida.");
                }


            }
        }
    }



