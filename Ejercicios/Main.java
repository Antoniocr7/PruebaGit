public class Main {
    public static void main(String[] args) {
        try {
            int resultado = Calculadora.dividir(10, 0);
            System.out.println("Resultado: " + resultado);  
        } catch (MiExcepcion e){
            System.out.println("Error: " + e.getMessage());
        } finally{
            System.out.println("Operación finalizada");
        }
    }    
}

