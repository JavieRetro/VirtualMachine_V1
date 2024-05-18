package main;

public class OperandStack {
	private int[] Stack;//Array
	private final int MAX_STACK;;
	private int num_Elems;//Cantidad de instrucciones que poseo en el array

	public OperandStack() {
		this.num_Elems = 0;
		this.MAX_STACK = 10;
		this.Stack = new int[this.MAX_STACK];
	}
	
	public String toString() {
		String texto = "Pila: ";
		if (this.isEmpty()) {
			texto += ("<vacia>");
		}else {
			for(int i = 0; i < this.num_Elems; i++){
				String numero = " " + this.Stack[i] + " ";
				texto += numero; 
			}
		}
		return texto;
	
	}
	
	public boolean isEmpty() {
		if(this.num_Elems == 0) {
			return true;
		}else {
		return false;
		
	}
  }
	
	public boolean push(int numero) {
		if(this.num_Elems < this.MAX_STACK) {
			this.Stack[this.num_Elems] = numero;
			this.num_Elems++;
			return true;
		}else {
			return false;
		}	
	}
	
	public int pop() {
		if(this.isEmpty()) {
			return -1;
		} else {
			int temp = this.Stack[this.num_Elems - 1];
			this.Stack[this.num_Elems - 1] = 0;
			this.num_Elems --;
			return temp;
		}
	}
	
	public int getCima() {
		
		if(!this.isEmpty()) {
			return this.Stack[num_Elems - 1];
		}else {
		return -1;
		}
	}
}	
	
