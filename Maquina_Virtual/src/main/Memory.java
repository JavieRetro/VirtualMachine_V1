package main;
/**
 * Clase Memory
 * 
 * @author javie
 */

public class Memory {
	/**
	 * Atributos
	 */
	private Integer[] memory;
	private final int MAX_MEMORY;
	private int size;
	private boolean isEmpty;

	/**
	 * Constructora
	 */
	public Memory() {
		this.MAX_MEMORY = 10;
		this.memory = new Integer[this.MAX_MEMORY];
		this.size = 10;
		this.isEmpty = true;
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
		String cadena = "Memoria:";
		if (isEmpty) {
			cadena += " <vacía>";
		} else {
			int i = 0;
			while (i < this.memory.length) {
				if (this.memory[i] != null) {
					String numero = " [" + i + "] " + this.memory[i] + "  ";
					cadena += numero;
				}
				i++;
			}
		}
		return cadena;
	}

	/**
	 * Escribe el valor que indiquemos
	 * 
	 * 
	 * @param position Posicion donde queremos escribir. 
	 * @param valor valor quequeremos a escribir en x posicion
	 * @return true si la hemos escrito, sino retornar false
	 */
	public boolean write(int position, int valor) {
		if (position >= 0) {
			this.resize(position);
			this.memory[position] = valor;
			this.isEmpty = false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * leer valores
	 * 
	 * @param position  posicion que queremos leer
	 * @retu el valor que queremos leer
	 */
	public Integer read(int position) {
		if (this.memory[position] == null && position < 0) {
			return -1;
		} else {
			return this.memory[position];
		}
	}

	/**
	 * Metodo para aumentar el tamaño del array Memory
	 * 
	 * @param position Posicion adondé queremos llegar en el array
	 */
	private void resize(int position) {

		if (position >= this.size) {
			this.isEmpty = false;
			Integer[] memory2 = new Integer[position * 2];
			for (int i = 0; i < this.memory.length; i++) {
				memory2[i] = this.memory[i];
			}
			this.memory = memory2;
		}
	}

}