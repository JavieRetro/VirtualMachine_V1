package main;

import java.util.Scanner;
/**
 * Clase Engine
 * 
 * @author javie
 */
public class Engine {   
	/**
	 * Atributos
	 */
	private ByteCodeProgram program;
	private boolean end;
	private Scanner scanner;
	private CPU cpu;
   
	/**
	 * Constructora
	 */
       public Engine() {
    	   this.end = false;
    	   this.program = new ByteCodeProgram();
    	   this.scanner = new Scanner(System.in);
    	   this.cpu = new CPU();
    	   
       }
       
       /**
        * Incializar el programa
        */
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
	/**
	 * Muestra como funciona el programa
	 * 
	 * @return true si la podemos ejecutar, sino false
	 */
	public boolean HELP(){
		System.out.println("HELP - Muestra esta ayuda ");
		System.out.println(" QUIT - Cierra la aplicación ");
		System.out.println(" RUN - Ejecuta el programa ");
		System.out.println(" NEWINST BYTECODE - Introduce una nueva instrucción al programa ");
		System.out.println(" RESET - Vacía el programa ");
		System.out.println(" REPLACE N - Reemplaza la n instrucción solicitada por el usuario");
		return true;
		
	}
	
	/**
	 * Finalizar el programa
	 * 
	 * @return true si se puede ejecutar, sino devolver false
	 */
	public boolean QUIT(){
		System.out.println(this.program.toString());
		System.out.println("Saliendo del programa... ");
		this.end = true;
		return true;
		
	}
	
	/**
	 * Ejecutar las instrucciones introducidas en la consola
	 * 
	 * @return true si se ha ejecutado, sino false
	 */
	public boolean RUN(){
		System.out.println(this.program.runProgram(this.cpu));
		System.out.println(this.program.toString());
		return true;
		
	}
	
	/**
	 * Método para introducir nuevas instr del programa
	 * @param com
	 * 
	 * @return true si se puede ejecutar, sino false
	 */
	public boolean NEWINST(ByteCode bc){
		if(bc.getInstruction() != null) {
			
			this.program.setInstruction(bc);
			System.out.println(this.program.toString());
			return true;
		}else {
		return false;
	}
}
	/**
	 * Vaciar el programa
	 * 
	 * @return true si se ejecuta, sino false
	 */
	public boolean RESET(){
		this.program.reset();
		return true;
		
	}
	
	/**
	 * Reemplazar una instr por otra que nostros introduzcamos
	 * 
	 * @param com
	 * @return true si se ha podido ejecutar, sino false
	 */
	public boolean REPLACE(int parametro){
		if(parametro < this.program.programSize()){
			System.out.println("Nueva instrucción");
			String texto = scanner.nextLine();
			
			ByteCode bc = ByteCodeParser.parse(texto);
			this.program.setInstructionPosition(bc, parametro);
			System.out.println(this.program.toString());
			return true;
		}else {
			System.out.println("No se ha ejecutado el comando replace");
			System.out.println(this.program.toString());
			return false; 
		}
		
	}
	
	
	
  
}
