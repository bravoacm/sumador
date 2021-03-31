package sumador;

/**
 *  Clase para sumar las cifras de un numero
 * @author Adrian Bravo
 * @version 1.0
 *
 */

public class asumar {
	
	/**
	 * Metodo para mostrar el resultado de la suma de todas las cifras de un numero
	 * @param cad. Contiene la cifra a sumar
	 * @return devuelve el numero introducido y la suma de todas sus cifras
	 */
	
	public String sumativo(String cad) {
		String numero = cad;
		String resultado=null;
		int sumatotal=0;
		if (numero.length()==1) {
			return (numero+" = "+numero);
		} else if(numero.startsWith("-")){
			return null;
		}
		
		sumatotal=total(cad);
		resultado = pintar(numero, sumatotal);
		
		return numero + " = " + resultado;
	}
	
	/**
	 * Metodo para mostrar el resultado como sumandos
	 * @param numero el numero a mostrar
	 * @param sumatotal total de la suma de las cifras del numero
	 * @return devuelve la suma de las cifras como sumandos y su resultado.
	 */

	public String pintar(String numero, int sumatotal) {
		String resultado="";
		for(int i=0; i<numero.length();i++) {
			if(i==numero.length()-1) {
				resultado=resultado+numero.substring(i,i+1)+'='+sumatotal;
			} else {
				resultado = resultado+numero.substring(i,i+1)+'+';
			}
		}
		return resultado;
	}
	
	/**
	 * Metodo que realiza la suma de todas las cifras
	 * @param cad cifra a sumar
	 * @return devuelve el resultado de la suma
	 */

	public int total(String cad) {
		int sumar = 0;
		
		for(int i = 0; i<cad .length(); i++) {
			String cifra = cad.substring(i, i+1);
			sumar = sumar + Integer.parseInt(cifra);
		}
		
		return sumar;
	}

}
