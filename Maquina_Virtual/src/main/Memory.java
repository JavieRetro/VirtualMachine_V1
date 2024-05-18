package main;

public class Memory {
	private Integer[] memory;
	private int size; // Igual a numElems en OperandStack
	private boolean isEmpty;
	private final int MAX_MEMORY = 0;
	
	//Constructora
	public Memory() {
		this.memory = new Integer[this.MAX_MEMORY];
		this.isEmpty = true;
		this.size = 10;
	}
	
     
	@Override
	//metodo toString
	public String toString() {
		String memoria = "Memoria:";
		if (isEmpty) {
			memoria += " <vacía>";
		} else {
			for(int i = 0; i < memory.length; i++) {
				if (this.memory[i] != null) {
			 String num =("[" + i + "]" + this.memory[i] + " ");
			 memoria += num;
				}
				i++;
			}
		}
		return memoria;
	}   


	private void resize (int posicion) {
		if (posicion >= this.size) {
			this.isEmpty = false;
			Integer[] memory2 = new Integer[posicion * 2];
			for (int i = 0; i < this.memory.length; i++) {
				memory2[i] = this.memory[i];
			}
			this.memory = memory2;
		}
	}

	//metodo write(pos, value) return tipo boolean si se puede escribir, devolver true;
	public boolean write(int posicion, int valor) {
		if(posicion >= 0) {
			this.resize(posicion);
			this.memory[posicion] = valor;
			this.isEmpty = false;
			return true;
		}else {	
	        return false;
	}
}	
	//metodo read(pos) return integer por el array;
	public Integer read(int posicion) {
		if(this.memory[posicion] == null) {
			return -1;
		}else {
			return this.memory[posicion];
		}
	}
}
