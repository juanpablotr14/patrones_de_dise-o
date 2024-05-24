package co.com.tascon.state;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n----------- State -----------\n");
        
        User user = new User();

        System.out.println("Estado inicial: " + user.activate());
        System.out.println("Intentando comprar: " + user.buy());
        System.out.println("Estado después de comprar: " + user.activate());

        System.out.println("Desactivando tarjeta: " + user.disable());
        System.out.println("Intentando comprar con tarjeta desactivada: " + user.buy());
        System.out.println("Estado después de intentar comprar con tarjeta desactivada: " + user.activate());

        System.out.println("Bloqueando tarjeta: " + user.lock());
        System.out.println("Intentando comprar con tarjeta bloqueada: " + user.buy());
        System.out.println("Estado después de intentar comprar con tarjeta bloqueada: " + user.activate());

        System.out.println("Desbloqueando tarjeta: " + user.activate());
        System.out.println("Estado después de desbloquear: " + user.activate());
        
    }
}