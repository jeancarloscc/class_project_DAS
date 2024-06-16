package Questionário3.Questão6;

public class ClasseY {
    private int y;
    public ClasseY(int y) {
        this.y = y;
    }
    public void metodo(ClasseX x) {
        x.setX(this);
    }

    public int getY() {
        return y;
    }
}
