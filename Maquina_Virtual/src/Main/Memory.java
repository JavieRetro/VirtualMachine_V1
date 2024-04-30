package Main;

public class Memory {
	private Integer[] Memory;
	private int size = 10; // Igual a numElems en OperandStack
	private boolean empty;
	private int max_Memory;
	
	//Constructora
	public Memory() {
		this.Memory = new Integer[size];
		this.empty = true;
	}
	
     
	@Override
	//metodo toString
	public String toString() {
		String memory = " ";
		if (isEmpty() == false) {
		for(int i = 0; i < size; i++) {
			if(this.Memory[i] == null) {
				
			}else {
			memory += this.Memory[size] + " , ";
				
			}
		}
		return memory;
		}else 
		return null;
	}

	
	
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		if(size > 0) {
			return true;
		}else {
		return false;
		}
	}

	private void resize (int posicion) {
		if(posicion >= size) {
			this.empty = false;
			Integer[] Memory2 = new Integer[posicion*2];
			for (int i = 0; i < this.Memory.length; i++) {
	            Memory2[i] = this.Memory[i];
	        }
			this.Memory = Memory2;
		}
	}
	

	//metodo write(pos, value) return tipo boolean si se puede escribir, devolver true;
	public boolean write(int posicion, int valor) {
		if(posicion >= 0) {
			this.resize(posicion);
			this.Memory[posicion] = valor;
			return true;
		}else {
		
	return false;
	}
}	
	//metodo read(pos) return integer por el array;
	public Integer read(int posicion) {
		if(this.Memory[posicion] == null) {
			return null;
		}else {
			return this.Memory[posicion];
		}
	}
	

}
