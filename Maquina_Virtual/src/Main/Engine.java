package Main;

import java.util.Scanner;

public class Engine {   
	private ByteCodeProgram program;
	private boolean end;
	private Scanner scanner;
	private CPU cpu;
   
	
       public Engine() {
    	   this.end = false;
    	   this.program = new ByteCodeProgram();
    	   this.scanner = new Scanner(System.in);
    	   this.cpu = new CPU();
    	   
       }
	public void start(){
		// TODO Auto-generated method stub
		while(!this.end){
			String texto = this.scanner.nextLine();
			Command com = CommandParser.parse(texto);
			
			if(com != null) {
				System.out.println("Comienza la ejecución de " + texto.toUpperCase() + "\n");
				
				if(com.execute(this)) {
					
				}else {
					System.out.println("Error: Ejecución incorrecta del comando");
				      }
				}else {
					System.out.println("Error: Comando incorrecto");
				}
			}
		}
	
	public boolean CommandHELP(){
		System.out.println("HELP - Muestra esta ayuda ");
		System.out.println(" QUIT - Cierra la aplicación ");
		System.out.println(" RUN - Ejecuta el programa ");
		System.out.println(" NEWINST BYTECODE - Introduce una nueva instrucción al programa ");
		System.out.println(" RESET - Vacía el programa ");
		System.out.println(" REPLACE N - Reemplaza la n instrucción solicitada por el usuario");
		return true;
		
	}
	
	public boolean CommandQUIT(){
		System.out.println(this.program.toString());
		System.out.println("Saliendo del programa: ");
		this.end = true;
		return true;
		
	}
	
	public boolean CommandRUN(){
		System.out.println(this.program.runProgram(this.cpu));
		System.out.println(this.program.toString());
		return true;
		
	}
	
	public boolean CommandNEWINST(Command com){
		if(com.getInstruction() != null) {
			
			this.program.setInstruction(com.getInstruction());
			System.out.println(this.program.toString());
			return true;
		}else {
		return false;
	}
}
	
	public boolean CommandRESET(){
		this.program.reset();
		return true;
		
	}
	
	public boolean CommandREPLACE(Command com){
		if(com.getReplace() < this.program.programsize()){
			System.out.println("Nueva instrucción");
			String texto = scanner.nextLine();
			
			ByteCode bc = ByteCodeParser.parse(texto);
			this.program.setInstructionPosition(bc, com.getReplace());
			System.out.println(this.program.toString());
			return true;
		}else {
			System.out.println(this.program.toString());
			return false; 
		}
		
	}
	
	
	
  
}
