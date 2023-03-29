import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        /*
        14) Realiza una aplicación que nos calcule una ecuación de segundo grado.
        Debes pedir las variables a, b y c por teclado y comprobar antes que el discriminante
        (operación en la raíz cuadrada).
         Para la raíz cuadrada usa el método sqlrt de Math. Te recomiendo que uses mensajes de traza.
        * */
        String text_a = JOptionPane.showInputDialog("Ingrese valor de a ");
        int a = Integer.parseInt(text_a);
        String text_b = JOptionPane.showInputDialog("Ingrese valor de b ");
        int b = Integer.parseInt(text_b);
        String text_c = JOptionPane.showInputDialog("Ingrese valor de c ");
        int c = Integer.parseInt(text_c);

        double D = Math.pow(b,2)-(4*a*c);
        if(D>0){
            Double x1=(b*(-1)+Math.sqrt(D))/(2*a);
            Double x2=(b*(-1)-Math.sqrt(D))/(2*a);
            System.out.println("X1 = "+x1+", X2 = "+x2);
        } else if (D==0) {
            Double x1=(b*(-1)+Math.sqrt(D))/(2*a);
            System.out.println("X1 = "+x1);
        }else {
            System.out.println("Su resultado es una Imaginaria");
        }
    }
}