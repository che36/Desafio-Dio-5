public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void tranferir(double valor, Conta destino);

    void imprimirExtrato();
}
