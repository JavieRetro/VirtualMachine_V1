package main;

/**
 * Clase ByteCodeProgram
 * 
 * @author javie
 */
public class ByteCodeProgram {
	/**
	 * Atributos
	 */
	private int num_elems;
	private int size;
	private ByteCode[]program;
	
	/**
	 * Constructora
	 */

	public ByteCodeProgram() {
		this.size = 10;
		this.num_elems = 0;
		this.program = new ByteCode[this.size];
	}
	
	/**
	 * Inicialización del programa para ejecutar los Bytecodes
	 * @param cpu objeto de la clase CPU para ejecutar el programa
	 * @return cadena de String detallando la ejecución
	 */
	public String runProgram(CPU cpu) {
		
		String mensaje = " ";
		for(int i = 0; i < this.num_elems; i++) { //Ejecutar las instrucciones que tenga el programa
			if(!cpu.isHalt() && cpu.execute(this.program[i])) {
				mensaje += "El estado de la máquina tras la ejecición de: " + this.program[i].getInstruction() + " "
						+ this.program[i].getParam() + " es: " + "\n " + cpu.toString() + "\n";

			} else if (!cpu.isHalt()) {
				mensaje += "\n Error: Ejecución incorrecta del comando" ;

			}
		}
		cpu.erase();
		cpu.runCPU();
		return mensaje;
	}

	/**
	 * Añadir instrucciones ByteCode al programa
	 * @param bc ByteCode a añadir en el programa
	 */
	public void setInstruction(ByteCode bc) {
		if(this.num_elems >= this.program.length) {
			this.resize();
			this.program[this.num_elems] = bc;
			this.num_elems++;
		}else {
			this.program[this.num_elems] = bc;
			this.num_elems++;
		}
	}
	
	/**
	 * Añadir al programa un ByteCode en una posicion especifica
	 * 
	 * @param bc  ByteCode que se va a añadir al programa
	 * @param position  posicion donde escribiremos el ByteCode
	 * @return true si se ha añadido correctamente, sino false
	 */
	public boolean setInstructionPosition(ByteCode bc, int position) {
		// TODO Auto-generated method stub
		if(position >= 0) {
		if (position >= this.program.length) {
			this.resize();
			this.program[position] = bc;
			return true;
		}else {
			this.program[position] = bc;
			return true;
		}
	}else {
			return false;
		}
	}
	
	/**
	 * Devolver el último Bytecode del programa
	 * 
	 * @return la ultima instrucción del programa
	 */
	public ByteCode getInstruction() {
		return this.program[this.num_elems];
	}
    
	/**
	 * Devuelve el ByteCode en la posicion position del programa
	 * 
	 * @param position es la posicion en la que se desea saber que ByteCode hay
	 * @return devuelve el ByteCode en la posicion indicada
	 */
	public ByteCode getInstructionPosition(int position) {
		return this.program[position];
	}
	public void resize() {
		ByteCode[] program2 = new ByteCode[this.size * 2];
		for(int i = 0; i < this.program.length; i++){
			program2[i] = this.program[i];
			}
		this.program = program2;
		}
	
	/**
	 *Convertir el programa de tipo ByteCode a un String
	 * 
	 * @return programa convertido a tipo String
	 */
	public String toString() {
		String cadena = "Programa almacenado: \n";
		for (int i = 0; i < this.num_elems; i++) {
			cadena += i + " : " + this.program[i].getInstruction() + " " + this.program[i].getParam() + "\n";
		}
		return cadena;
	}

	/**
	 * Metodo para resetear el programa,  pone a 0 el num de  elementos
	 */
	public void reset(){
		// TODO Auto-generated method stub
		this.program = new ByteCode[this.size];
		this.num_elems = 0;
	}
	
	/**
	 * Indica el tamaño del array del programa
	 * @return el tamaño del array
	 */
	public int programSize() {
		// TODO Auto-generated method stub
		return this.program.length;
	}
	
}
