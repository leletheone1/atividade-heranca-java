import java.util.ArrayList;
import java.util.List;

public class Contas {
    public static void main(String[] args) {
        // Criando uma lista para armazenar as contas (Polimorfismo puro do 2° semestre!)
        List<ContaBancaria> listaContas = new ArrayList<>();

        System.out.println("--- 1. Incluindo dados das contas ---");
        ContaPoupanca poupanca = new ContaPoupanca("Maria Silva", 1001, 1000.00, 5);
        ContaEspecial especial = new ContaEspecial("João Santos", 2002, 500.00, 300.00);

        listaContas.add(poupanca);
        listaContas.add(especial);

        System.out.println("--- 2. Sacando valores ---");
        // Tentando sacar além do saldo na poupança (vai barrar)
        poupanca.sacar(1200.00); 
        // Sacando usando o limite na conta especial (vai permitir)
        especial.sacar(700.00); 

        System.out.println("\n--- 3. Depositando valores ---");
        poupanca.depositar(200.00);
        especial.depositar(100.00);

        System.out.println("\n--- 4. Calculando novo saldo da Poupança (Taxa de 2%) ---");
        // Varre a lista, identifica quem é poupança e calcula o rendimento
        for (ContaBancaria conta : listaContas) {
            if (conta instanceof ContaPoupanca) {
                // Cast necessário para acessar o método específico da poupança
                ((ContaPoupanca) conta).calcularNovoSaldo(0.02); 
            }
        }

        System.out.println("\n--- 5. Mostrando os dados das contas de um cliente ---");
        // Buscando e exibindo os dados de cada conta na lista
        for (ContaBancaria conta : listaContas) {
            System.out.println("------------------------------------");
            System.out.println("Cliente: " + conta.getCliente());
            System.out.println("Nº Conta: " + conta.getNumeroConta());
            System.out.println("Saldo Atual: R$ " + conta.getSaldo());
            
            // Exibe informações específicas usando instanceof
            if (conta instanceof ContaPoupanca) {
                System.out.println("Tipo: Conta Poupança | Dia Rendimento: " + ((ContaPoupanca) conta).getDiaRendimento());
            } else if (conta instanceof ContaEspecial) {
                System.out.println("Tipo: Conta Especial | Limite: R$ " + ((ContaEspecial) conta).getLimite());
            }
        }
    }
}
