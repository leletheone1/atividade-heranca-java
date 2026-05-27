public class ContaBancaria {
    // Atributos encapsulados
    private String cliente;
    private int numeroConta;
    protected double saldo; // protected permite que as subclasses acessem diretamente

    // Construtor
    public ContaBancaria(String cliente, int numeroConta, double saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar (Regra: saldo não pode ficar negativo)
    public void sacar(double valor) {
        if (valor > 0 && (this.saldo - valor) >= 0) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para o saque de R$ " + valor);
        }
    }

    // Getters e Setters básicos
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
