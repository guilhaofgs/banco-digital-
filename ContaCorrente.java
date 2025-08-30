public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Número da Conta: " + numero);
        System.out.println("Saldo: R$" + saldo);
    }
}