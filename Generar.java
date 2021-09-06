package practica3;

import java.util.Random;

public class Generar {
	static String app, apm, nom, year, mes, dia, gen, est;
	
	public static Mexicano iniciar(int i,Mexicano [] arreglo) {
		
		app = Capture.capturarString(">> Ingrese el apellido paterno").toUpperCase();
		apm = Capture.capturarString(">> Ingrese el apellido materno").toUpperCase();
		nom = Capture.capturarString(">> Ingrese el nombre").toUpperCase();
		year = Capture.capturarString(">> Ingrese el año de nacimiento (YYYY)");
		mes = Capture.capturarString(">> Ingrese el mes de nacimiento (MM)");
		dia = Capture.capturarString(">> Ingrese el dia de nacimiento (DD)");
		gen = Capture.capturarString(">> Ingrese el genero (M/H)").toUpperCase();
		est = Capture.capturarString(">> Ingrese el estado de nacimiento (Ej. Baja California = BC)").toUpperCase();
		System.out.println();
		
		arreglo[i].nom = app+" "+apm+" "+nom;
		arreglo[i].curp = (Generar.validarCurp(app, apm, nom)+String.valueOf(year.charAt(2))
				+String.valueOf(year.charAt(3))+String.valueOf(mes.charAt(0))
				+String.valueOf(mes.charAt(1))+String.valueOf(dia.charAt(0))+String.valueOf(dia.charAt(1))
				+String.valueOf(gen.charAt(0))+String.valueOf(est.charAt(0))
				+String.valueOf(est.charAt(1))+(Generar.buscarConsonante(app))
				+(Generar.buscarConsonante(apm))+(Generar.buscarConsonante(nom))
				+(Generar.homoclaveRandom1())+(Generar.homoclaveRandom2())); //acá se suman todos los chars
		
		
		arreglo[i].rfc = (Generar.validarCurp(app, apm, nom)+String.valueOf(year.charAt(2))
			+String.valueOf(year.charAt(3))+String.valueOf(mes.charAt(0))
			+String.valueOf(mes.charAt(1))+String.valueOf(dia.charAt(0))
			+String.valueOf(dia.charAt(1))+(Generar.homoclaveRandom1())
			+(Generar.homoclaveRandom2())+(Generar.homoclaveRandom2()));
		
		return null;
		
		
	}
	public static String buscarVocal(String palabra) {

		for(int i=1;i<palabra.length();i++) {
			char vocales [] = new char [] {'A','E','I','O','U'};
			for(int j=0;j<vocales.length;j++) {
				if(palabra.charAt(i) == vocales[j]) {
					String vocal = String.valueOf(vocales[j]);
					return vocal;
				}
			}
		}
		return null;
		
	}
	
	public static String validarCurp(String app, String apm, String nom) {
		//String curpValidada = String.valueOf(app.charAt(0))+(Generar.buscarVocal(app))+(String.valueOf(apm.charAt(0)))+(String.valueOf(nom.charAt(0)));
		String [] elementosCurp = new String [] {String.valueOf(app.charAt(0)),Generar.buscarVocal(app),String.valueOf(apm.charAt(0)),String.valueOf(nom.charAt(0))};
		String [] altisonantes = new String [] {"CACA","VACA","COLA","PENE","PIPI","POPO","LOCA","LOCO","BABA"}; //Estas son algunas que se me ocurrieron
		for(int i=0;i<altisonantes.length;) {
			if((elementosCurp[0]+elementosCurp[1]+elementosCurp[2]+elementosCurp[3])==altisonantes[i]) {
				String nuevaCurp = elementosCurp[0]+elementosCurp[1]+elementosCurp[2]+"X";
				return nuevaCurp;
			}
			else {
				String viejaCurp = elementosCurp[0]+elementosCurp[1]+elementosCurp[2]+elementosCurp[3];
				return viejaCurp;
			}
		}
		
		
		return null;
	}
	public static String buscarConsonante(String palabra) {
		// Para la segunda consonante del primer apellido, del segundo apellido y del nombre
		for(int i=1;i<palabra.length();i++) {
			char consonantes [] = new char [] {'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
			for(int j=0;j<consonantes.length;j++) {
				if(palabra.charAt(i) == consonantes[j]) {
					String letra = String.valueOf(consonantes[j]);
					return letra;
				}
			}
		}
		return null;
	}
	
	public static String homoclaveRandom1() {
		Random aleatorio = new Random(System.currentTimeMillis());
		// Producir nuevo int aleatorio entre 0 y 9
		int num = aleatorio.nextInt(10);
		aleatorio.setSeed(System.currentTimeMillis());
		return String.valueOf(num);
		
		}
	
	public static String homoclaveRandom2() {
		Random aleatorio = new Random(System.currentTimeMillis());
		// Producir nuevo int aleatorio entre 0 y 9
		int num = aleatorio.nextInt(21);
		char consonantes [] = new char [] {'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
		aleatorio.setSeed(System.currentTimeMillis());
		return String.valueOf(consonantes[num]);
		
		}
}

