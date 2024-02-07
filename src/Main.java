
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cesar = new Cliente();
        cesar.setNome("César");
        Conta cc = new ContaCorrente(cesar);
        Conta cp = new ContaPoupanca(cesar);

        cc.depositar(100);
        cc.imprimirExtrato();
        cc.tranferir(100, cp);
        cp.imprimirExtrato();
    }

}