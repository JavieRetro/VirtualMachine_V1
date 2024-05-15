package Main;

/**
 * Clase ByteCodeParser
 * 
 * @author javie
 */

public class ByteCodeParser {
	
	/**
	 * 
	 * @param s cadena de texto que  contiene un Bytecode
	 * 
	 * n es el tamanio de la cadena String
	 * 
	 * @return devuelve el Bytecode de s o null si no coincide con Bytecode
	 */

	public static ByteCode parse(String s) {
		// TODO Auto-generated method stub
		String[] arrayBc = s.split(" ");
		
		if(arrayBc.length == 2) {
		       if(arrayBc[1] != null) {
			switch(arrayBc[0]) {
			case "push":
				return new ByteCode(ENUM_BYTECODE.PUSH, Integer.parseInt(arrayBc[1]));
		        
	        case "load":
	        	return new ByteCode(ENUM_BYTECODE.LOAD, Integer.parseInt(arrayBc[1]));
	        	
	        case "store":
	        	return new ByteCode(ENUM_BYTECODE.STORE, Integer.parseInt(arrayBc[1]));
			        	
			        default:
			        	return null;
			       } 	
			}else{
				return null;
			}
		}else if(arrayBc.length == 1) {
			switch(arrayBc[0]) {
			
	        case "add":
	        	return new ByteCode(ENUM_BYTECODE.ADD);
	        
	        case "sub":
	        	return new ByteCode(ENUM_BYTECODE.SUB);
	        	
	        case "div":
	        	return new ByteCode(ENUM_BYTECODE.DIV);
	        
	        case "mul":
	        	return new ByteCode(ENUM_BYTECODE.MUL);
	        	
	        case "out":
	        	return new ByteCode(ENUM_BYTECODE.OUT);
	        	
	        case "halt":
	        	return new ByteCode(ENUM_BYTECODE.HALT);
	        default:
	        	return null;
			}
		}else {
			return null;
		}
		
	}

}
