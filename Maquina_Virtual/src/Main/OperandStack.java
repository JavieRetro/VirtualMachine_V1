package Main;

public class OperandStack {
	private int[] Stack;//Array
	private static int MAX_Stack;;
	private int Num_Elems;//Cantidad de instrucciones que poseo en el array

	public OperandStack() {
		this.Num_Elems = 0;
		this.MAX_Stack = 10;
		this.Stack = new int[this.MAX_Stack];
	}
	
	public String toString() {
		String texto = " ";
		if (isEmpty() == true) {
			for(int i = 0; i < Stack.length; i++) {
				texto += this.Stack[i] + " ";
			}
		}else{
			texto = "vacío";
			
		}
		return texto;
	
	}
	
	public boolean isEmpty() {
		if(this.Num_Elems > 0) {
			return false;
		}else {
		return true;
		
	}
  }
	
	public boolean push(int numero) {
		if(this.Num_Elems < this.MAX_Stack) {
			this.Stack[this.Num_Elems] = numero;
			this.Num_Elems++;
			return true;
		}else {
			return false;
		}	
	}
	
	public int pop() {
		int temp = this.Stack[Num_Elems];
		if(!isEmpty()== false) {
			this.Num_Elems--;
			return temp;
		}else {
			return -1;
		}
	}
	
	public int getCima() {
		
		if(isEmpty() == false) {
			return this.Stack[Num_Elems - 1];
		}else {
		return -1;
		}
	}
}	
	
