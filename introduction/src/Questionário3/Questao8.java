package Questionário3;

public class Questao8 {
    public static void main(String[] args) {
        F obj1 = new R();
        obj1.imprime();
        R obj2 = (R) obj1;
        obj2.imprime('C');
        F obj3 = new P();
        obj3.imprime();
    }
}

class R extends F {
    public void imprime(){
        System.out.println("R,");
    }
}

class P extends F {
    public void imprime(){
        System.out.println("P,");
    }
}

class F {
    public void imprime(){
        System.out.println("F,");
    }
    public void imprime(char c){
        System.out.println(c + ",");
    }
}
