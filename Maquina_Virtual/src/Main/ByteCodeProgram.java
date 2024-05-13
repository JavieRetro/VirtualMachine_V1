package Main;

import java.util.Iterator;

public class ByteCodeProgram {
	private int num_Elems;
	private final int size;
	private ByteCode[]programa;
	
	
	public ByteCodeProgram() {
		this.size = 10;
		this.num_Elems = 0;
		this.programa = new ByteCode[this.size];
	}
	
	
	public void resize() {
		Bytecode programa2 = new Bytecode[this.size * 2];
		for(int i = 0; i < this.programa.length; i++) {
			programa2[i] = this.programa[i];
		}
		this.programa = programa2;
	}
	
	public void setInstruction(ByteCode bc) {
		if(this.num_Elems >= this.programa.length) {
			this.resize();
			this.programa[this.num_Elems] = bc;
			this.num_Elems++;
		}else {
			this.programa[this.num_Elems] = bc;
			this.num_Elems++;
		}
	}
	
	public ByteCode getInstruction() {
		return this.programa[this.num_Elems];
	}
	
	public String runProgram(CPU cpu) {
		
		String mensaje = " ";
		for(int i = 0; i < this.num_Elems; i++) { //Ejecutar las instrucciones que tenga el programa
			if(!cpu.isHalt() && cpu.execute(this.programa[i])) {
				//texto de la maquina virtual
				
			}else if(!cpu.isHalt()){
				//texto de la maquina virtual
			}
		}
		cpu.erase();
		cpu.runCPU();
		return mensaje;
	}

}
