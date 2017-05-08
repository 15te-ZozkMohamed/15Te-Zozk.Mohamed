
public class Sort {
	//Vi behöver en 1000 array av int
	static int[] lista = new int[1000];
	
	static void slumplista(){
		for (int i=0 ; i < 1000 ;i++)
			lista[i] = (int) (Math.random()*1000);
	}
	
	public static void main(String[] args) {
		
		//Vi ska mäta tiden det tar att starta på något smart sätt
		
		//Fyll listan med 1000 slumpade tal
		slumplista();

		//Bubbelsortera
		long startTime = System.currentTimeMillis();
		bubbleSort();
		long finishTime = System.currentTimeMillis();
		System.out.println("Det tog " + (finishTime - startTime) + " ms att Bubbelsortera");
		
		//Slumpas igen
		slumplista();
		startTime = System.currentTimeMillis();
		
		//Insortera 
		insertSort();
		finishTime = System.currentTimeMillis();
		System.out.println("Det tog " + (finishTime - startTime) + " ms att Instickssortera");
		
		//Slumpas igen
		slumplista();
		startTime = System.currentTimeMillis();
		
		//Megasortera
		mergesort();
		finishTime = System.currentTimeMillis();
		System.out.println("Det tog " + (finishTime - startTime) + " ms att Mergesortera");
		
		//Slumpas igen
		slumplista();
		startTime = System.currentTimeMillis();
		
		//Selectionsort
		selectionsort();
		finishTime = System.currentTimeMillis();
		System.out.println("Det tog " + (finishTime - startTime) + " ms att Selectionsortera");
		
		//Slumpas igen
		slumplista();
		startTime = System.currentTimeMillis();
		
		quickSort();
		finishTime = System.currentTimeMillis();
		System.out.println("Det tog " + (finishTime - startTime) + " ms att Quicksortera");

		}

		static void bubbleSort(){
			//to be coded
			try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
				
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}

		static void insertSort(){
			// To be coded.
				try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
			
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
	}
		
		static void mergesort(){
			// To be coded.
				try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
			
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
	}
		
		static void selectionsort(){
			// To be coded.
				try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
			
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
		static void quickSort(){
			// To be coded.
				try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
			
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
}

