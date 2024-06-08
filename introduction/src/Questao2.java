public class Questao2 {
    public static void main(String[] args) {
        int a = 0;
        int b;
        b = a++ + ++a;
        b = a++ + a++ + b;
        b = ++a + a++ + b;
        b = ++a + ++a + b;
        b = ++a + b;
        System.out.println(a);
        System.out.println(b);
    }
}
