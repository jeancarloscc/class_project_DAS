package Questionário3.Questão6;

public class ClasseX {
    private int x;

    public ClasseX(int x){
        this.x = x;
    }

    public void setX(ClasseY y){
        x = y.getY();
    }

    public int getX(){
        return x;
    }
}
