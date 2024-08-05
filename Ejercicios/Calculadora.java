public class Calculadora {
    public static int dividir(int a, int b) throws MiExcepcion {
        if (b == 0){
            throw new MiExcepcion("División por cero");
        }
        return a/b;
    }
}
