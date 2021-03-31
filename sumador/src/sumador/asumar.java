package sumador;

public class asumar {
	
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

	public int total(String cad) {
		int sumar = 0;
		
		for(int i = 0; i<cad .length(); i++) {
			String cifra = cad.substring(i, i+1);
			sumar = sumar + Integer.parseInt(cifra);
		}
		
		return sumar;
	}

}
