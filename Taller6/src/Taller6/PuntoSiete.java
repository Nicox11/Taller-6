package Taller6;
import java.util.Scanner;
public class PuntoSiete {
	Scanner sc = new Scanner(System.in);
		
		public void puntoSiete() {
			int promedio;
			int[] prueba;
			prueba = new int[5];
			
			for(int i=0 ; i<5 ; i++) {
				
				System.out.println("digite el resultado de la prueba #" + (i+1));
				prueba[i]=sc.nextInt();
				
			}
			promedio = prueba[0]+prueba[1]+prueba[2]+prueba[3]+prueba[4]/5;
			System.out.println("el promedio es "+ promedio);
		}
		
	}



