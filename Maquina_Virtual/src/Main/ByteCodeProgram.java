package Main;

public class ByteCodeProgram {
	private int num_elems;
	private int size;
	private ByteCode[]program;
	
	
	public ByteCodeProgram() {
		this.size = 10;
		this.num_elems = 0;
		this.program = new ByteCode[this.size];
	}
	public String runProgram(CPU cpu) {
		
		String mensaje = " ";
		for(int i = 0; i < this.num_elems; i++) { //Ejecutar las instrucciones que tenga el programa
			if(!cpu.isHalt() && cpu.execute(this.program[i])) {
				//texto de la maquina virtual
				System.out.println ("El estado de la máquina tras la ejecución de: " + this.program[i].getInstruction() + " " 
				+ this.program[i].getparam() + " es: " + " \n " + cpu.toString() + "\n");
				
			}else if(!cpu.isHalt()){
				//texto de la maquina virtual
				System.out.println (" Error: Ejecución incorrecta del comando");
			}
		}
		cpu.erase();
		cpu.runCPU();
		return mensaje;
	}
	
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
	
	public boolean setInstructionPosition(ByteCode bc, int position) {
		// TODO Auto-generated method stub
		if(position >= 0){
			if(position >= this.program.length) {
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
	
	public ByteCode getInstruction() {
		return this.program[this.num_elems];
	}
	
	public ByteCode getInstructionPosition(int position){
		return this.program[position];
	}
	
	public void resize() {
		ByteCode[] program2 = new ByteCode[this.size * 2];
		for(int i = 0; i < this.program.length; i++) {
			program2[i] = this.program[i];
		}
		this.program = program2;
	}
	
	public String toString() {
		String cadena = "Programa almacenado: \n";
		for(int i = 0; i < this.num_elems; i++) {
			System.out.println (i + " : " + this.program[i].getInstruction() + " " + this.program[i].getparam() + "\n");
		}
		return cadena;
		
	}

	/**
	 * Metodo para resetear el programa,  pone a 0 los elementos
	 */
	public void reset(){
		// TODO Auto-generated method stub
		this.program = new ByteCode[this.size];
		this.num_elems = 0;
	}


	public int programsize() {
		// TODO Auto-generated method stub
		return this.program.length;
	}


	
	
	
}
