public class Peca {
    private String nome;
    private float custo;
    private float lucro;

    // Construtor padrão (vazio) exigido pelo diagrama
    public Peca() {
    }

    // Construtor com parâmetros
    public Peca(String nome, float custo, float lucro) {
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }

    // Preço na superclasse = custo + lucro
    public float calcularPreco() {
        return this.custo + this.lucro;
    }

    public void exibir() {
        System.out.println("Peça: " + nome);
        System.out.println("Custo: R$ " + custo);
        System.out.println("Lucro estimado: R$ " + lucro);
        System.out.println("Preço Final: R$ " + calcularPreco());
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public float getCusto() { return custo; }
    public void setCusto(float custo) { this.custo = custo; }
    public float getLucro() { return lucro; }
    public void setLucro(float lucro) { this.lucro = lucro; }
}
