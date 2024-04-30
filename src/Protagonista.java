public class Protagonista extends Personaje {

    private int nivelHeroismo;

    // Constructor
    public Protagonista(String nombre, String poder, int vidas, int nivelHeroismo) {
        super(nombre, poder, vidas);
        this.nivelHeroismo = nivelHeroismo;
    }

    // Getter y Setter específico para nivelHeroismo
    public int getNivelHeroismo() {
        return nivelHeroismo;
    }

    public void setNivelHeroismo(int nivelHeroismo) {
        this.nivelHeroismo = nivelHeroismo;
    }

    @Override
    public void actuar() {

        System.out.println("El protagonista está mostrando su heroísmo.");
    }

    
}
