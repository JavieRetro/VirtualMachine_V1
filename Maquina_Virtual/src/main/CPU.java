package main;

/**
 * Clase CPU
 * 
 * @author javie
 */
public class CPU {
	/**
	 * Atributos
	 */
	
	private OperandStack Stack;
	private Memory memory;
	private boolean halt;
	
	/**
	 * Constructora
	 */
	
	public CPU() {
		this.Stack = new OperandStack();
		this.memory = new Memory();
		this.halt = false; 
	}
	
	/**
	 * Método para ejecutar una instrucción y que modifica la memoria y la pila
	 * 
	 * @param instr ByteCode a ejecutar
	 * @return si sucede algún error, retornara false
	 */
	public boolean execute(ByteCode instr) {
		
		 switch (instr.getInstruction()) {
	        case ADD:
	            return this.sumaPila();
	        case SUB:
	            return this.restaPila();
	        case DIV:
	            return this.dividirPila();
	        case MUL:
	            return this.multiplicarPila();
	        case PUSH:
	            return this.Push(instr.getParam());
	        case HALT:
	            return this.Halt();
	        case LOAD:
	            return this.Load(instr.getParam());
	        case OUT:
	            return this.Out();
	        case STORE:
	            return this.Store(instr.getParam());
	        default:
	            return false;
	        }
	    }
		
	/**
	 * Convertir el estado de la CPU en un String
	 * 
	 * @return estado de la CPU como String
	 */
	public String toString() {
		return("Estado de la CPU: " + " \n " + " " + this.Stack.toString() + "\n" + " " + this.memory.toString());
	}
    /**
     * Reiniciar la pila y la memoria    
     */
	public void erase() {
		this.memory = new Memory();
		this.Stack = new OperandStack();
		
	}
    
	/** Sumar cima y subcima de la pila
	 * 
	 * @return true si realizas la operación, sino false 
	 */
	public boolean sumaPila() {
		// TODO Auto-generated method stub
		this.runCPU();
		if(!this.Stack.isEmpty()){
		int num1 = this.Stack.pop();
		if(!this.Stack.isEmpty()) {
		int num2 = this.Stack.pop();
		if(num1 == -1 || num2 == -1) {
			return false;
		}else{
		int suma = num1 + num2;
		this.Stack.push(suma);
		return true;
		}	
	} 
	else{
		this.Stack.push(num1);
		return false;
	}
		
	}else {
		return false;
	}
}
		
	
	/** Restar cima y subcima de la pila
	 * 
	 * @return true si realizas la operación, sino false 
	 */
	public boolean restaPila() {
		this.runCPU();
		if(!this.Stack.isEmpty()) {
		int num1 = this.Stack.pop();
		int num2 = this.Stack.pop();
		if(num1 == -1 || num2 == -1) {
			return false;
		}else {
		int resta = num1 - num2;
		this.Stack.push(resta);
		return true;
	       }
	} else{
			return false;
		}
	}
	
	/** Multiplicar cima y subcima de la pila
	 * 
	 * @return true si realizas la operación, sino false 
	 */
	public boolean multiplicarPila() {
		this.runCPU();
		if(!this.Stack.isEmpty()){
		int num1 = this.Stack.pop();
		int num2 = this.Stack.pop();
		if(num1 == -1 || num2 == -1){
			return false;
		}else {
		int multiplicacion = num1 * num2;
		this.Stack.push(multiplicacion);
		return true;
	}
		} else{
			return false;
		}
	}
	
	/** Dividir cima y subcima de la pila
	 * 
	 * @return true si realizas la operación, sino false 
	 */
	public boolean dividirPila() {
		this.runCPU();
		if(!this.Stack.isEmpty()) {
		int num1 = this.Stack.pop();
		int num2 = this.Stack.pop();
		if(num1 == -1 || num2 == -1) {
			return false;
		}else {
		int division = num1 / num2;
		this.Stack.push(division);
		return true;	
	       }
	} else{
		return false;
	}
}
	
	public boolean Push(int elem) {
		this.runCPU();
		this.Stack.push(elem);	
		return true;	
	}
	
	/**
	 * Anidar en la posicion de la memoria que le indiquemos de la
	 * cima de la pila y lo eliminemos de ella
	 * 
	 * @param position posicion de la memoria donde añadir la cima de la pila
	 * @return true si se puede añadir, si no false
	 */
	public boolean Store(int position){
		// TODO Auto-generated method stub
		if(position > 0) {
		this.halt = false;
		int elemento = this.Stack.pop();
		if(elemento == -1) {
			return false;
		}else {
			this.memory.write(position, elemento);
			return true;
		}
		}else {
			return false;
		}
	}
	
	/**
	 * Leer el valor de una posición de la memoria y se añade
	 * a la pila
	 * 
	 * @param position posicion del elemento de la memoria
	 * @return true si se añade a la pila, sino false
	 */
	public boolean Load(int position){
	// TODO Auto-generated method stub
		this.runCPU();
		int elemento = this.memory.read(position);
		if(elemento != -1 ) {
		this.Stack.push(elemento);
		return true;
	}else {
		return false;
	}
}
	
	/**
	 * Escribir el elemento almacenado en la cima de la pila
	 * 
	 * @return true si se puede escribir, sino false
	 */
	public boolean Out() {
		// TODO Auto-generated method stub
		this.runCPU(); 
		if(!this.Stack.isEmpty()) {
			System.out.println("El elemento almacenado en la cima es: " + this.Stack.getCima());
			return true;
		}else {
			return false;
		}
	}
    /**
     * Ejecutar la maquina
     */
	public void runCPU() {
		// TODO Auto-generated method stub
		this.halt = false;
		
	}

	/**
	 * Metodo que para la maquina
	 * 
	 * @return true si se ha parado,sino, devuelve false
	 */
	public boolean Halt() {
		// TODO Auto-generated method stub
	    this.halt = true;
	    return true;
		}
	
	
	/**
	 * Si la maquina esta parada o no
	 * @return true si lo está, si no devuelve false
	 */
	public boolean isHalt() {
		return this.halt;

	}
}



