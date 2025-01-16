package m1_15_Marta_Laveda_Box;

import java.util.List;

public class OrdNumIncPal extends AlgoritmoOrdenacion {
	

	@Override
	public void ordena(List <Carta> listaCartas) {
        // Algoritmo de ordenaci�n
		
		int i;
		int j;
		Carta temp;
		
		for(i=0;i<listaCartas.size()-1;i++) {
			for(j=0;j<listaCartas.size()-1-i;j++) {
			if (comparadorCarta(listaCartas.get(j), listaCartas.get(j+1))>0) {
				 temp=listaCartas.get(j);
				listaCartas.set(j, listaCartas.get(j+1));
				listaCartas.set(j+1, temp);
			}
			}
		}
    }

   
	public static int comparadorCarta(Carta c1, Carta c2) {
        // Comparador de cartas usado en el algoritmo de ordenaci�n
    	int comparacionNumero;
    	
    	//Comparamos primero por número
    	comparacionNumero= Integer.compare(ValorCarta.valorCartas.get(c1.getNumero()), ValorCarta.valorCartas.get(c2.getNumero()));
    	if(comparacionNumero!=0) {
    		return comparacionNumero;
    	}else {
    	
    	//Comparación por palo
    	return c1.getPalo().compareTo(c2.getPalo());
    	}
	}
}
