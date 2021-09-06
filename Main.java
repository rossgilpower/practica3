package practica3;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

	Mexicano mx1 = new Mexicano(null,null,null);
	Mexicano mx2 = new Mexicano(null,null,null);
	Mexicano mx3 = new Mexicano(null,null,null);
	
	Mexicano arreglo [] = new Mexicano [] {mx1,mx2,mx3};
	
	for(int i=0; i<arreglo.length;i++) {
		Generar.iniciar(i,arreglo);
		}
	System.out.println("El CURP del primer mexicano ("+arreglo[0].nom+") es: \n\t"+arreglo[0].curp);
	System.out.println("El RFC del segundo mexicano ("+arreglo[1].nom+") es: \n\t"+arreglo[1].rfc);
	System.out.println("El CURP y RFC del tercer mexicano ("+arreglo[2].nom+") es: \n\t"+arreglo[2].curp+"\n\t"+arreglo[2].rfc);
	}
	
}

class Capture{
	//Aquí para capturar enteros
    public static int capturarEntero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextInt());
    }
    //Aquí para capturar flotantes
    public static float capturarFlotante(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextFloat());
    }
    //Aquí para capturar dobles
    public static double capturarDoble(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextDouble());
    }
    //Y finalmente aquí para capturar cadenas
    public static String capturarString(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());
    }

}
