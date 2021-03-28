/**
 * Clase objeto Calculadora 
 * @see <a href="http://docs.oracle.com/javase/7/docs/technotes/tools/windows/javadoc.html">Javadoc</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/">Javadoc JDK</a>
 * @author Herberth Espinoza
 * @version 1.0
 */
package entornos;

public class Calculadora {
    //Atributos
    public double iOperadorA;
    public double iOperadorB;
    //Constructor Vacío
    public Calculadora()
    {
        this.iOperadorA = 10;
        this.iOperadorB = 8;
    }
//Constructor
    public Calculadora(double iOperadorA, double iOperadorB) {
        this.iOperadorA = iOperadorA;
        this.iOperadorB = iOperadorB;
    }

    public double getiOperadorA() {
        return iOperadorA;
    }

    public void setiOperadorA(double iOperadorA) {
        this.iOperadorA = iOperadorA;
    }

    public double getiOperadorB() {
        return iOperadorB;
    }

    public void setiOperadorB(double iOperadorB) {
        this.iOperadorB = iOperadorB;
    }
    
    
    public double Suma()
    {
    	//@return:operación suma
        return iOperadorA + iOperadorB;
    }
    
    public double Resta()
    {
    	//@return:operación resta
        return iOperadorA - iOperadorB;
    }
    
    public double Multiplicacion()
    {
    	//@return:operación multiplicación
        return iOperadorA * iOperadorB;
    }
    
    public double Division()
    {
    	//@return:operación división
         return iOperadorA / iOperadorB;
    }
    public double raiz()
    {
    	//@return:operación raiz cuadrada  
         return Math.sqrt(iOperadorA);
    }
    public double logaritmo()
    {
    	//@return:operación logaritmica  
         return Math.log10(iOperadorA);
    }

        
    
    
}