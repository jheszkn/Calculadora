package entornos;

public class Calculadora_main {

	    public static void main(String[] args) {
	        // TODO code application logic here
	       
	        Calculadora c1 = new Calculadora(6,5);
	        Calculadora cDefecto = new Calculadora();
	        System.out.println("Con valores:");
	        System.out.println(c1.Suma());
	        System.out.println(c1.Resta());
	        System.out.println(c1.Multiplicacion());
	        System.out.println(c1.Division());
	        System.out.println(c1.raiz());
	        System.out.println(c1.logaritmo());
	    }
	    
	}
