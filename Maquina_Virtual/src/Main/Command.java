package Main;

import java.util.Scanner;

public class Command {
	public static int valor = 0;
	private ENUM_COMMAND command;
	private ByteCode instruction;
	private int replace;
	
	public Command(ENUM_COMMAND command, ByteCode instruction) {
		this.command = command;
		this.instruction = instruction;
	}
	
	public Command(ENUM_COMMAND command) {
		this.command = command;
	}
	
	public Command(ENUM_COMMAND command, int replace) {
		this.command = command;
		this.replace = replace;
	}

	
	public boolean execute(Engine engine) {
		Engine Bc = new Engine();
		
		       switch(command) {
		       case HELP:
		    	   Bc.CommandHELP();
		    	   valor = 1;
		       break;
		       
		       case RUN:
		    	   Bc.CommandRUN();
		    	   valor = 1;
		    	   break;
		    	   
		       case QUIT:
		    	   Bc.CommandQUIT();
		    	   valor = 1;
		    	   break;
		    	   
		       case NEWINST:
		    	   Bc.CommandNEWINST_BYTECODE();
		    	   valor = 1;
		    	   break;
		    	   
		       case RESET:
		    	   Bc.CommandRESET();
		    	   valor = 1;
		    	   break;
		    	   
		       case REPLACE:
		    	   valor = 1;
		    	   Bc.CommandREPLACE();
		    	   break;
		       }
		    while(valor == 0);
		
		return true;
		
	}
}
