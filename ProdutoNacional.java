public class ProdutoNacional extends ProdutoEstadual {
    private double taxa; // Fixo em 5% (0.05)

    public ProdutoNacional(String descricao, double valor) {
        super(descricao, valor);
        this.taxa = 0.05;
    }

    @Override
    public double calcularValorFinal() {
        // Valor base + 10% de imposto + 5% de taxa nacional
        return super.getValor() * (1 + this.getImposto() + this.taxa);
    }

    public double getTaxa() { return taxa; }
}
