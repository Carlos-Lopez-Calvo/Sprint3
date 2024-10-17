import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int descuento = 25;
        final int descuento2 = 50;

        int ipinicial;
        double impdesc;
        int cantidad;
        int impfinal;


        Scanner cantidadnum = new Scanner(System.in);
        System.out.println("Introduzca umero de objetos: ");
        cantidad = cantidadnum.nextInt();
        Scanner importeinicial = new Scanner(System.in);
        System.out.println("Introduzca el importe inicial: ");
        ipinicial = importeinicial.nextInt();

        if (cantidad <= 3){
            impdesc = ipinicial * (descuento / 100.0);
        }
        else {
            impdesc = ipinicial * (descuento2 / 100.0);
        }
        impfinal = (int) (ipinicial - impdesc);
        System.out.println("El total es:" + impfinal + "€");
    }
}