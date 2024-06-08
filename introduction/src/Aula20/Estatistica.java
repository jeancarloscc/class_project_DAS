package Aula20;

public class Estatistica {
    private int cont;
    private double min;
    private double max;
    private double soma;
    private double media;

    public void adicionarValor(int valor){
        soma += valor;
    }

    public double getSoma(){
        return soma;
    }
}
