package Main;

public class CPU {
	
	public OperandStack Stack;
	public Memory memory;
	public boolean fin;
	
	public CPU() {
		
	}
	
	public void erase() {
		this.memory = new Memory();
		this.Stack = new OperandStack();
		
	}
	
	public boolean execute(ByteCode instr) {
		
		if(instr.equals(ENUM_BYTECODE.ADD)) {
			sumaPila();
			return true;
		}
		else if(instr.equals(ENUM_BYTECODE.SUB)) {
			restaPila();
			return true;
		}
		else if(instr.equals(ENUM_BYTECODE.MUL)) {
			multiplicarPila();
			return true;
		}
		else if(instr.equals(ENUM_BYTECODE.DIV)) {
			dividirPila();
			return true;	
		}
		else if(instr.equals(ENUM_BYTECODE.HALT)) {
			isHalt();
			return true;
		}
		else if(instr.equals(ENUM_BYTECODE.STORE)) {
			storePila();
			return true;
		}
		else if(instr.equals(ENUM_BYTECODE.LOAD)) {
			cerrarPila();
			return true;
		}
		return false;
	}

	

	public boolean sumaPila() {
		// TODO Auto-generated method stub
		int num1 = pila.pop();
		int num2 = pila.pop();
		
		int suma = num1 + num2;
		pila.push(suma);
		return true;
		
	}
	
	public boolean restaPila() {
		int num1 = pila.pop();
		int num2 = pila.pop();
		
		int resta = num1 - num2;
		pila.push(resta);
		return true;
	}
	
	public boolean multiplicarPila() {
		int num1 = pila.pop();
		int num2 = pila.pop();
		
		int multiplicación = num1 * num2;
		pila.push(multiplicación);
		return true;
	}
	
	public boolean dividirPila() {
		int num1 = pila.pop();
		int num2 = pila.pop();
		
		int division = num1 / num2;
		pila.push(division);
		return true;
		
	}
	
	public boolean isHalt() {
		if(!this.isHalt()) {
			return true;
		}else {
			return false;
		}
	}
	private void storePila() {
		// TODO Auto-generated method stub
		
	}
	private void cerrarPila() {
		// TODO Auto-generated method stub
		
	}

}
