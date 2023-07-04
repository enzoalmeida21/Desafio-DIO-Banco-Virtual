import componentes_banco.Cliente;
import componentes_banco.Conta;
import componentes_banco.ContaCorrente;
import componentes_banco.ContaPoupanca;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cliente enzo = new Cliente();
        enzo.setNome("Enzo Almeida");
        Cliente camila = new Cliente();
        camila.setNome("Camila Barroso");


        Conta cc = new ContaCorrente(enzo);

        cc.depositar(450.89);
        cc.sacar(234.67);

        Conta cp = new ContaPoupanca(camila);

        cc.transferir(187, cp);
        cp.depositar(387.65);
        cp.sacar(34.9);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}