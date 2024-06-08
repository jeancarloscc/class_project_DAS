package Aula22;

public class Ponto2d {
    private double x, y;

    public Ponto2d() {
        x = 0;
        y = 0;
    }

    public Ponto2d(double px, double py) {
        x = px;
        y = py;
    }

    public double distancia(double px, double py) {
        return Math.sqrt(Math.pow(x - px, 2) + Math.pow(y - py, 2));
    }

    public double distancia(Ponto2d p){
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }

    public String toString() {
        return "Ponto2d [x = : " + x + ", y = : " + y + "]";
    }
}
