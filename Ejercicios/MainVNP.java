public class MainVNP {
    public static void main(String[] args) {
        Pato pato = new Pato();
        Volador volador = pato;
        Nadador nadador = pato;
        volador.volar();
        nadador.nadar();
    }
}
