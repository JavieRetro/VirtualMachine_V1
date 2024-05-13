package Main;

public class Memory {
	private Integer[] Memory;
	private int size; // Igual a numElems en OperandStack
	private boolean isEmpty;
	private int max_Memory;
	
	//Constructora
	public Memory() {
		this.Memory = new Integer[size];
		this.isEmpty = true;
		this.max_Memory = 10;
		this.size = 10;
	}
	
     
	@Override
	//metodo toString
	public String toString() {
		String memory = "Memoria:";
		String memory2 =""; 
		if (isEmpty() == true) {
			memory2 = "<vacia>";
		} else {
		for(int i = 0; i < memory.length(); i++) {
		memory2 += "[" + i + "]" + ":" + Memory[i] + " ";	
			}
		  }
		 memory += memory2;
		 return memory;
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
		if(posicion >= this.size) {
			this.isEmpty = false;
			Integer[] Memory2 = new Integer[posicion*2];
			for (int i = 0; i < Memory2.length; i++) {
				if(i <= Memory.length) {
	            Memory2[i] = this.Memory[i];
				}else {
			    Memory2[i] = null;
				}
	        }
			this.Memory = Memory2;
		}
	}
	

	//metodo write(pos, value) return tipo boolean si se puede escribir, devolver true;
	public boolean write(int posicion, int valor) {
		if(posicion >= 0) {
			this.resize(posicion);
			this.Memory[posicion] = valor;
			this.isEmpty = false;
			return true;
		}else {
		
	return false;
	}
}	
	//metodo read(pos) return integer por el array;
	public Integer read(int posicion) {
		if(Memory[posicion] >= 0) {
			return this.Memory[posicion];
		}else {
			return -1;
		}
	}
	

}
