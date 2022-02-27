package Dio.bootcamp.oo;

public class Main {

    public static void main(String[] args) {

        Cliente bruno = new Cliente();
        bruno.setNome("Bruno");

        Conta contaCorrente = new ContaCorrente(bruno);
        Conta poupanca = new ContaPoupanca(bruno);

        contaCorrente.depositar(150);
        contaCorrente.transferir(50, poupanca);

        contaCorrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        Cliente felix = new Cliente();
        felix.setNome("felix");

        Conta contaCorrente2 = new ContaCorrente(felix);
        Conta poupanca2 = new ContaPoupanca(felix);

        contaCorrente2.depositar(1500);
        contaCorrente2.transferir(50, poupanca);

        contaCorrente2.imprimirExtrato();
        poupanca2.imprimirExtrato();


    }
}
