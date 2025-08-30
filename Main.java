public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Fernando Silva");

        Conta contaCorrente = new ContaCorrente(1001, cliente1);
        Conta contaPoupanca = new ContaPoupanca(2001, cliente1);

        contaCorrente.depositar(500);
        contaCorrente.sacar(100);
        contaCorrente.imprimirExtrato();

        contaPoupanca.depositar(1000);
        contaPoupanca.sacar(250);
        contaPoupanca.imprimirExtrato();
    }
}