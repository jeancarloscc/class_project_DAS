public class OperadorTernario {
    public static void main(String[] args) {
        boolean b = false;
        int a = (b||10>5) ? 100 : 200;
        System.out.println(a);
    }
}
