package sumador;

public class asumar {
	
	public String sumativo(String cad) {
		String numero = cad;
		if (numero.length()==1) {
			return (numero+" = "+numero);
		} else if(numero.startsWith("-")){
			return null;
		}
		return "Parametros incorrectos";
	}

}
