package Main;

public class CPU {
	
	public OperandStack Stack;
	public Memory memory;
	public boolean fin;
	
	public CPU() {
		
	}
	
	public void erase() {
		
	}
	
	public boolean execute(ByteCode instr) {
		
		if(instr.equals(ENUM_BYTECODE.ADD)) {
			sumaPila();
			return true;
		}
		return false;
	}

	public void sumaPila() {
		// TODO Auto-generated method stub
		
	}
	
	public void restaPila() {
		
	}
	
	public void multiplicarPila() {
		
	}
	
	public void dividirPila() {
		
	}
	
	public boolean isHalt() {
		return fin;
	}
	

}
