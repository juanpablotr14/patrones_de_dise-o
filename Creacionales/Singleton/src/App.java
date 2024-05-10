public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n---------- Patron de Diseño Singleton ---------\n");

        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

    }
}
