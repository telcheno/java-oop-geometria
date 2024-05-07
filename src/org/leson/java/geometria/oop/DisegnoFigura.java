package org.leson.java.geometria.oop;

public class DisegnoFigura {
	
	public void disegno(int base, int altezza) {
		
			for(int  y = 0;  y <= altezza; y++) {
				
					//il for del asse x itera il cilo che stampa ogni elemento da sinistra verso destra
					for(int x = 0; x <= base; x++) {
						
					//uso un condizionale per stampare gli elementi
						//SE y è == 0 o y == alteza cio è nel asse verticale
						if(y == 0 || y == altezza) {
							
						//stampo il elemento da ogni iterazione in verso orizontale mentre è nella iterazione del asse x
						System.out.print("@");	
							
						//ALTRIMENTI SE y == 0 o y == base 	
						}else if(x == 0 || x == base) {
							
						//stampo il elemnto nella iterazione corrispondente  
						System.out.print("@");
						
						//ALTRIMANTI
						}else {
						
						//stampo il elemento nelle iterazioni che non rientrano nelle condizioni precedenti 
						System.out.print("-");
						
						//SE l'iterazione è == alla base salta la linea e riprende il ciclo
						}if(x == base) {
							System.out.print("\n");					
						}
						
					}
				}
				
				System.out.println("\n La @ rapresenta i valori di base e altezza e il - rapresenta il area del rettangolo");

	}

}