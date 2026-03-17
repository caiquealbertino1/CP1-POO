package br.com.fiapride.model;

public class Veiculo {

    private String individuo;
    private String placa;
    private double gasolina;

    // Construtor: Garante que o objeto seja criado com dados válidos
    public Veiculo(String individuo, String placa, double gasolinaInicial) {
        this.individuo = individuo;
        this.placa = placa;
        // Usamos o setter aqui para a validação de valor negativo
        setGasolina(gasolinaInicial);
    }

    // Métodos de Negócio
    public void adicionar(double litros) {
        if (litros > 0) {
            this.gasolina += litros;
            System.out.println("Abastecimento de " + litros + "L realizado com sucesso.");
        } else {
            System.out.println("Erro: O valor para adicionar deve ser positivo.");
        }
    }

    public void gasta(double litros) {
        if (litros <= this.gasolina) {
            this.gasolina -= litros;
            System.out.println("Viagem realizada! Gasto: " + litros + "L.");
        } else {
            System.out.println("Erro: Gasolina insuficiente para completar a tarefa.");
        }
    }

    // Getters e Setters
    public String getIndividuo() {
        return individuo;
    }

    private void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getGasolina() {
        return gasolina;
    }

    private void setGasolina(double gasolina) {
        if (gasolina >= 0) {
            this.gasolina = gasolina;
        } else {
            System.out.println("Aviso: Tentativa de definir gasolina negativa. Ajustado para 0.");
            this.gasolina = 0;
        }
    }
}