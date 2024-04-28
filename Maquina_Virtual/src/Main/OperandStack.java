package Main;

public class OperandStack {
	private int[] Stack;//Array
	private final int MAX_Stack = 100;
	private int Num_Elems = 0;//Cantidad de instrucciones que poseo en el array

	public OperandStack() {
		this.Stack = new int[MAX_Stack];
	}
	
	public boolean isEmpty() {
		if(Num_Elems > 0) {
			return false;
		}else {
		return true;
		
	}
  }
	
	public boolean push(int numero) {
		if(this.Num_Elems < this.MAX_Stack) {
			this.Stack[Num_Elems] = numero;
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
			return this.Stack[Num_Elems];
		}else {
		return -1;
		}
	}
}	
	
