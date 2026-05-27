public class PecaImportada extends Peca {
    private float taxaImportacao;
    private float taxaFrete;

    // Construtor padrão
    public PecaImportada() {
        super();
    }

    // Construtor completo utilizando super()
    public PecaImportada(String nome, float custo, float lucro, float taxaImportacao, float taxaFrete) {
        super(nome, custo, lucro);
        this.taxaImportacao = taxaImportacao;
        this.taxaFrete = taxaFrete;
    }

    // Sobrescrita: preço na subclasse = preço base (custo + lucro) + taxas
    @Override
    public float calcularPreco() {
        return super.calcularPreco() + this.taxaImportacao + this.taxaFrete;
    }

    @Override
    public void exibir() {
        super.exibir(); // Mostra os dados básicos da peça
        System.out.println("Taxa de Importação: R$ " + taxaImportacao);
        System.out.println("Taxa de Frete: R$ " + taxaFrete);
        System.out.println("Preço Total Importada: R$ " + calcularPreco());
    }

    // Getters e Setters
    public float getTaxaImportacao() { return taxaImportacao; }
    public void setTaxaImportacao(float taxaImportacao) { this.taxaImportacao = taxaImportacao; }
    public float getTaxaFrete() { return taxaFrete; }
    public void setTaxaFrete(float taxaFrete) { this.taxaFrete = taxaFrete; }
}
