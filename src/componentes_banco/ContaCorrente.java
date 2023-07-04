package componentes_banco;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("***Extrato componentes_banco.Conta Corrente***");
        super.imprimirInfoComum();

    }
}
