package Main;

import java.util.Iterator;

public class ByteCodeProgram {
	private int num_Elems;
	private final int size = 10;
	private ByteCode[]programa;
	
	
	public ByteCodeProgram() {
		this.num_Elems = 0;
		this.programa = new ByteCode[size];
	}
	
	
	public void resize() {
		if(this.num_Elems >= this.size) {
			Bytecode[]bc = new Bytecode[size * 2];
			
			for(int i = 0; i < this.programa.length; i++) {
				bc[i] = this.programa[i];
			}
			this.programa = bc;
		}
	}
	
	public void setInstruction(ByteCode bc) {
		
		this.resize();
		this.programa[this.num_Elems] = bc;
		this.num_Elems++;
	}
	
	public String toString() {
		String cadena = "";
		for(int i = 0; i < this.programa.length; i++) {
			cadena += this.programa[i];
		}
		return cadena;
		
	}

}
