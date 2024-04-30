public class App {
    public static void main(String[] args) throws Exception {
        /*Enemigo enemigo = new Enemigo("Enemigo1", "Volar", 4, 5);
        String vidas= enemigo.informeVidas();
        System.out.println(vidas);*/

        Personaje protagonista = new Protagonista("Héroe", "Super fuerza", 3, 10);
        Personaje enemigo = new Enemigo("Villano", "Control mental", 3, 8);

        protagonista.actuar(); 
        enemigo.actuar(); 


    }
}
