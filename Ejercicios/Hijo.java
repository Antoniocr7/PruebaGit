public class Hijo extends Padre {
    public void metodo() {
        System.out.println("Método del hijo");
    }
    public void llamarMetodoPadre() {
        super.metodo();
    }
}