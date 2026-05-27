public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String cliente, int numeroConta, double saldo, double limite) {
        super(cliente, numeroConta, saldo);
        this.limite = limite;
    }

    // Sobrescrita do método sacar para permitir saldo negativo até o limite
    @Override
    public void sacar(double valor) {
        // O novo saldo não pode ser menor que o limite negativo (-limite)
        if (valor > 0 && (this.saldo - valor) >= -this.limite) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso (Uso de limite).");
        } else {
            System.out.println("Saldo e limite insuficientes para o saque de R$ " + valor);
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
