import org.w3c.dom.ls.LSOutput;
class Calculadora {

   interface Callback {
        void retornoint(int resultadoDivision);
        void retornaError(String error);
    }
    static void divide(int a, int b, Callback callback) {
       if( b != 0){
           callback.retornoint(a/b);
       } else{
           callback.retornaError("error");
       }
    }
}
public class Main {
    public static void main(String[] args) {
       Calculadora calculadora = new Calculadora();

       Calculadora.divide(new Calculadora.Callback() {
           @Override
           public void retornoint(int resultadoDivision) {

           }
           @Override
           public void retornaError(String error) {
           }
           int resultadoDivision = Calculadora.divide(13, 2);
         System.out.println("La division es: " + resultadoDivision);


       }
    }