package Main;

public class Memory {
	private Integer[] Memory;
	private int size; // Igual a numElems en OperandStack
	private boolean isEmpty;
	private int MAX_MEMORY = 0;
	
	//Constructora
	public Memory() {
		this.Memory = new Integer[this.MAX_MEMORY];
		this.isEmpty = true;
		this.MAX_MEMORY = 10;
		this.size = 10;
	}
	
     
	@Override
	//metodo toString
	public String toString() {
		String memory = "Memoria:";
		if (isEmpty) {
		System.out.println("<vacia>"); 
		} else {
			int i = 0;
			while (i < this.Memory.length) {
			if (this.Memory[i] != null) {
			String numero = " [" + i + "] " + this.Memory[i] + "  ";
			System.out.println(numero); 
			}
			i++;
		  }
		}
		return memory;
	}
      

	private void resize (int posicion) {
		if(posicion >= this.size) {
			this.isEmpty = false;
			Integer[] Memory2 = new Integer[posicion * 2];
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
			this.isEmpty = false;
			return true;
		}else {	
	        return false;
	}
}	
	//metodo read(pos) return integer por el array;
	public Integer read(int posicion) {
		if(this.Memory[posicion] != null) {
			return this.Memory[posicion];
		}else {
			return -1;
		}
	}
	

}
