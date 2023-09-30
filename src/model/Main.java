package model;

public class Main {

	public static void main(String[] args) {
		// Declaración de variables
		int[] array = {1, 3, 6, 7, 12, 21, 23, 18, 5, 10, 14, 17};
		mostrarArrayRecursivo(array , 0);
		int elemento = 7;
		int posElemento = encontrarElemento(array, elemento, 0);
		System.out.println("\n" + "El valor se encuentra en la posición " + posElemento + " del arreglo");


	}

	// Muestra los valores de un Array
	public static void mostrarArrayRecursivo(int[] array, int i) {

		// Caso base
		if(i == (array.length-1)) {
			System.out.println(array[i]);

		}else{
			System.out.println(array[i]);
			mostrarArrayRecursivo(array, i+1);
		}
	}

	//Busca un elemento de Array de forma recursiva
	public static int encontrarElemento(int[] array, int elemento, int i) {

		if(array[i] == elemento){
			return i;
		}else{
			return encontrarElemento(array, elemento, i+1);
		}

	}

}
