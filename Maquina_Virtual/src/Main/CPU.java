package Main;

public class CPU {
	
	private OperandStack Stack;
	private Memory memory;
	private boolean halt;
	
	public CPU() {
		this.Stack = new OperandStack();
		this.memory = new Memory();
		this.halt = false;
		
	}
	
	public boolean execute(ByteCode instr) {
		
		 switch (instr.getInstruction()) {
	        case ADD:
	            return sumaPila();
	        case SUB:
	            return restaPila();
	        case DIV:
	            return dividirPila();
	        case MUL:
	            return multiplicarPila();
	        case PUSH:
	            return Push(instr.getparam());
	        case HALT:
	            return this.Halt();
	        case LOAD:
	            return Load(instr.getparam());
	        case OUT:
	            return Out();
	        case STORE:
	            return Store(instr.getparam());
	        default:
	            return false;
	        }
	    }
		
	
	

	public String toString() {
		return("Estado de la CPU: " + " \n " + " " + this.Stack.toString() + "\n" + "  " + this.memory.toString());
	}

		public void erase() {
		this.memory = new Memory();
		this.Stack = new OperandStack();
		
	}

	public boolean sumaPila() {
		// TODO Auto-generated method stub
		this.runCPU();
		if(!this.Stack.isEmpty()){
		int num1 = this.Stack.pop();
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
		return false;
	}
}
		
	
	
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
	
	public boolean multiplicarPila() {
		this.runCPU();
		if(!this.Stack.isEmpty()){
		int num1 = this.Stack.pop();
		int num2 = this.Stack.pop();
		if(num1 == -1 || num2 == -1){
			return false;
		}else {
		int multiplicación = num1 * num2;
		this.Stack.push(multiplicación);
		return true;
	}
		} else{
			return false;
		}
	}
	
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
	
	
	public boolean Store(int position){
		// TODO Auto-generated method stub
		this.halt = false;
		int elemento = this.Stack.pop();
		if(elemento == -1) {
			return false;
		}else {
			this.memory.write(position, elemento);
			return true;
		}
		
	}
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

	public void runCPU() {
		// TODO Auto-generated method stub
		this.halt = false;
		
	}

	public boolean Halt() {
		// TODO Auto-generated method stub
		if (!this.halt) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isHalt() {
		return this.halt;

	}
}



