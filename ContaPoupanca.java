public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    // Construtor usando o super() para herdar os dados da classe mãe
    public ContaPoupanca(String cliente, int numeroConta, double saldo, int diaRendimento) {
        super(cliente, numeroConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    // Método específico para calcular o novo saldo com base na taxa (ex: 0.05 para 5%)
    public void calcularNovoSaldo(double taxaRendimento) {
        double rendimento = this.getSaldo() * taxaRendimento;
        depositar(rendimento); // Reutiliza o método depositar
        System.out.println("Novo saldo atualizado com rendimento: R$ " + this.getSaldo());
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
}
