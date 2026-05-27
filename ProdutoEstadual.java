public class ProdutoEstadual extends Produto {
    private double imposto; // Guardado em decimal (ex: 0.10 para 10%)

    public ProdutoEstadual(String descricao, double valor) {
        super(descricao, valor);
        this.imposto = 0.10; // Fixo conforme o enunciado
    }

    @Override
    public double calcularValorFinal() {
        return super.getValor() * (1 + this.imposto);
    }

    public double getImposto() { return imposto; }
}
