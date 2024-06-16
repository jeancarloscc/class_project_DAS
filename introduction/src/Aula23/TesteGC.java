package Aula23;

public class TesteGC {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Instancias = " + Instancia.getInstancias());
        for (int i = 0; i < 10; i++) {
            Instancia o = new Instancia();
        }

        System.out.println("Instancias = " + Instancia.getInstancias());
        System.gc();
        Thread.sleep(1000);
        System.out.println("Instancias = " + Instancia.getInstancias());
    }
}
