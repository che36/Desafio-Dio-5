public abstract class Conta implements IConta {
    protected static final int AGENCIA_PADRAO = 0;
    protected int agencia;
    protected int numero;
    protected double saldo;


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void tranferir(double valor, Conta destino) {

    }
}
