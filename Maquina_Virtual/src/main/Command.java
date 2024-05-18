package main;

public class Command {
	private ENUM_COMMAND command;
	private ByteCode instruction;
	private int replace;
	
	public Command(ENUM_COMMAND com, ByteCode bc) {
		this.command = com;
		this.instruction = bc;
	}
	
	public Command(ENUM_COMMAND com) {
		this.command = com;
	}
	
	public Command(ENUM_COMMAND com, int elem) {
		this.command = com;
		this.replace = elem;
	}
	
	
	
	public boolean execute(Engine engine) {
		
		       switch(this.command) {
		       case HELP:
		    	   return engine.HELP();
		       
		       case RUN:
		    	   return engine.RUN();
		    	   
		       case QUIT:
		    	   return engine.QUIT();
		    	   
		       case NEWINST:
		    	   return engine.NEWINST(this);
		    	   
		       case RESET:
		    	   return engine.RESET();
		    	   
		       case REPLACE:
		    	   return engine.REPLACE(this);
		    	   
		    	   default:
		    		   return false;
	    }	
	}
	
	public ENUM_COMMAND getCommand() {
		return this.command;
	}
	
	public ByteCode getInstruction() {
		return this.instruction;
	}
	
	public int getReplace() {
		return this.replace;
		
	}
}

