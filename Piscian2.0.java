import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final double piscinalargo = 300.3;
        double[] piscina1 = {0,0};
        double[] piscina2 = {0,0};

        Scanner largo = new Scanner(System.in);
        System.out.println("Introduzca el largo de la piscina 1: ");
        piscina1[0] = largo.nextDouble();
        Scanner ancho = new Scanner(System.in);
        System.out.println("Introduzca el ancho de la piscina 1: ");
        piscina1[1] = ancho.nextDouble();

        Scanner largo2 = new Scanner(System.in);
        System.out.println("Introduzca el largo de la piscina 2: ");
        piscina2[0] = largo2.nextDouble();
        Scanner ancho2 = new Scanner(System.in);
        System.out.println("Introduzca el ancho de la piscina 2: ");
        piscina2[1] = ancho2.nextDouble();

        int[] area = {(int) (piscinalargo * piscina1[0]), (int) (piscinalargo * piscina2[0])};
        int[] volumen = {(int) (area[0] * piscina1[1]), (int) (area[1] * piscina2[1])};

        int anchuracombinada = (int) ((piscina1[1]) * piscina2[1]);
        int areacombinada = (int) (anchuracombinada * piscina2[0]);
        int volumencombinado = volumen[0] + volumen[1];

        System.out.println("La piscina1 tiene un area de: " + area[0] + "m2");
        System.out.println("La piscina1 tiene un volumen de: " + volumen[0] + "m3");
        System.out.println("La piscina2 tiene un area de: " + area[1] + "m2");
        System.out.println("La piscina2 tiene un volumen de: " + volumen[1] + "m3");
        System.out.println("El area combinada de las dos piscinas es: " + areacombinada + "m2");
        System.out.println("El volumen combinada de las dos piscinas es: " + volumencombinado + "m3");

        int aux = (int) piscina1[1];
        piscina1[1] = piscina2[1];
        piscina2[1] = aux;
        int[] volumencambiado = {(int) (area[0] * piscina1[1]), (int) (area[1] * piscina2[1])};

        System.out.println("La piscina1 tiene un volumen cambiado de: " + volumencambiado[0] + "m3");
        System.out.println("La piscina2 tiene un volumen cambiado de: " + volumencambiado[1] + "m3");

        }



    }
