package Questionário3.Questão6;

public class Main {
    public static void main(String[] args) {
        ClasseX x1 = new ClasseX(3);
        ClasseY y1 = new ClasseY(8);
        y1.metodo(x1);
        System.out.print(x1.getX() + ";");
        System.out.println(y1.getY());
    }
}
