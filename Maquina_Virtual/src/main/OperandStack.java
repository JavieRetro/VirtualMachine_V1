package main;
/**
 * Clase OperandStack
 * 
 * @author javie
 */
public class OperandStack {
	/**
	 * Atributos
	 */
	private int[] Stack;//Array
	private final int MAX_STACK;;
	private int num_Elems;//Cantidad de instrucciones que poseo en el array
   /**
    * Constructora
    */
	public OperandStack() {
		this.num_Elems = 0;
		this.MAX_STACK = 10;
		this.Stack = new int[this.MAX_STACK];
	}
	
	/**
	 * Convertir el array en un string. Retornamos los elems del array
	 * para usarlos en otros métodos
	 * 
	 * stack(n)= n es el nº elementos en la pila
	 * 
	 * @return Retornamos el array en un String
	 */
	public String toString() {
		String texto = "Pila: ";
		if (this.isEmpty()) {
			texto += "<vacia>";
		}else {
			for(int i = 0; i < this.num_Elems; i++){
				String numero = " " + this.Stack[i] + " ";
				texto += numero; 
			}
		}
		return texto;
	
	}
	/**
	 * Si un array está vacío o no
	 * @return true si el array vacío, si no false.
	 */
	
	public boolean isEmpty() {
		if(this.num_Elems == 0) {
			return true;
		}else {
		return false;
		
	}
  }
	/**
	 * Añadir elems al array
	 * @param numero -> elemento que añadimos en la pila(Stack)
	 * @return true si se añade el elemento correctamente, sino false
	 */
	public boolean push(int numero) {
		if(this.num_Elems < this.MAX_STACK) {
			this.Stack[this.num_Elems] = numero;
			this.num_Elems++;
			return true;
		}else {
			return false;
		}	
	}   
	
	/**
	 * Cogemos el último elem del array y lo eliminamos
	 * 
	 * @return -1 si la pila esta vacía, sino el elemento que esta en la última posición
	 */
	public int pop() {
		if(this.isEmpty()) {
			return -1;
		} else {
			int temp = this.Stack[this.num_Elems - 1];
			this.num_Elems --;
			return temp;
		}
	}
	
	/**
	 * Indicamos cuál es el ultimo elem del array
	 * 
	 * @return -1 si no podemos obtenemos la cima, sino devuelve el último elemento
	 */
	public int getCima() {
		
		if(!this.isEmpty()) {
			return this.Stack[num_Elems - 1];
		}else {
		return -1;
		}
	}
}	
	
