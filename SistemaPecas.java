public class SistemaPecas {
    public static void main(String[] args) {
        System.out.println("--- Criando Peça Nacional ---");
        Peca p1 = new Peca("Processador Intel i5", 600.00f, 150.00f);
        p1.exibir();

        System.out.println("\n--- Criando Peça Importada ---");
        PecaImportada p2 = new PecaImportada("Placa de Vídeo RTX 4060", 1200.00f, 300.00f, 200.00f, 80.00f);
        p2.exibir();
    }
}
