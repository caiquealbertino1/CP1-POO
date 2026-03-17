package br.com.fiapride.main;
import br.com.fiapride.model.Veiculo;

public class Principal {
    public static void main(String[] args) {

        // Criando o veículo com o construtor (Nome, Placa, Gasolina Inicial)
        Veiculo veiculo1 = new Veiculo("Carlos", "ABC-1234", -10.0);

        // Testando as operações
        veiculo1.adicionar(50.0);
        veiculo1.gasta(30.0);

        // Tentativa de gastar mais do que tem (O sistema vai bloquear)
        veiculo1.gasta(100.0);

        // Exibição dos dados formatada
        System.out.println("\n--- Status Final do Veículo ---");
        System.out.println("Proprietário: " + veiculo1.getIndividuo());
        System.out.println("Placa       : " + veiculo1.getPlaca());
        System.out.printf("Combustível : %.2f Litros%n", veiculo1.getGasolina());
        System.out.println("-------------------------------");
    }
}