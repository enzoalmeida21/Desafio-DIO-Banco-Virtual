package componentes_banco;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("***Extrato componentes_banco.Conta Poupança***");
        super.imprimirInfoComum();

    }


}
