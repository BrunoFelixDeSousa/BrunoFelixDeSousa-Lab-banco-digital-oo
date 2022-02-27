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
    }
}
