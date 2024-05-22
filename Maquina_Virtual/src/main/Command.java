package main;
/**
 * Clase Command
 * 
 * @author javie
 */
public class Command {
	/**
	 * Atributos
	 */
	private ENUM_COMMAND command;
	private ByteCode instruction;
	private int replace;
	
	/**
	 * Constructora 1
	 * 
	 * @param com es un comando
	 * @param instruction es un ByteCode
	 */
	public Command(ENUM_COMMAND com, ByteCode bc) {
		this.command = com;
		this.instruction = bc;
	}
	
	/**
	 * Constructora 2
	 * 
	 * @param com es un comando
	 */
	public Command(ENUM_COMMAND com) {
		this.command = com;
	}
	/**
	 * Constructora 3
	 * 
	 * @param com es un comando
	 * @param elem hace referencia al comando REPLACE
	 */
	public Command(ENUM_COMMAND com, int elem) {
		this.command = com;
		this.replace = elem;
	}
	
	/**
	 * Ejecutar del comando introducido por consola
	 * 
	 * @param engine
	 * @return true si el comando es correcto, sino false
	 */
	
	public boolean execute(Engine engine) {
		
		       switch(this.command) {
		       case HELP:
		    	   return engine.HELP();
		       
		       case RUN:
		    	   return engine.RUN();
		    	   
		       case QUIT:
		    	   return engine.QUIT();
		    	   
		       case NEWINST:
		    	   return engine.NEWINST(this.instruction);
		    	   
		       case RESET:
		    	   return engine.RESET();
		    	   
		       case REPLACE:
		    	   return engine.REPLACE(this.replace);
		    	   
		    	   default:
		    		   return false;
	    }	
	}
	/**
	 * Devolver nombre del comando
	 * 
	 * @return nombre del comando
	 */
	public ENUM_COMMAND getCommand() {
		return this.command;
	}
	/**
	 * Devolver nombre del ByteCode
	 * 
	 * @return nombre del ByteCode
	 */
	public ByteCode getInstruction() {
		return this.instruction;
	}
	/**
	 * Devolver elemento que referencia al comando Replace
	 * 
	 * @return elemento que referencia al comando Replace
	 */
	public int getReplace() {
		return this.replace;
		
	}
}

