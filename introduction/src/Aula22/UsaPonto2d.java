package Aula22;

public class UsaPonto2d {
    public static void main(String[] args) {
        Ponto2d p1 = new Ponto2d();
        Ponto2d p2 = new Ponto2d(4,5);

        double distancia = p2.distancia(p1);
        System.out.println(distancia);
    }
}
