package Main;

public class ByteCodeParser {

	public static ByteCode parse(String s) {
		// TODO Auto-generated method stub
		String[] arrayBc = s.split(" ");
		
		if(s.length() == 0 || s.length() > 2) {
			return null;
			
		} else if(s.length() == 1) {
			
			switch(arrayBc[0]) {
			        case "ADD":
			        	return new ByteCode(ENUM_BYTECODE.ADD);
			        
			        case "SUB":
			        	return new ByteCode(ENUM_BYTECODE.SUB);
			        	
			        case "DIV":
			        	return new ByteCode(ENUM_BYTECODE.DIV);
			        
			        case "MUL":
			        	return new ByteCode(ENUM_BYTECODE.MUL);
			        	
			        case "OUT":
			        	return new ByteCode(ENUM_BYTECODE.OUT);
			        	
			        case "HALT":
			        	return new ByteCode(ENUM_BYTECODE.HALT);
			        	
			        default:
			        	return null;		
			}
		}else {
			switch(arrayBc[0]) {
			case "PUSH":
				return new ByteCode(ENUM_BYTECODE.PUSH, Integer.parseInt(arrayBc[1]));
		        
	        case "LOAD":
	        	return new ByteCode(ENUM_BYTECODE.LOAD, Integer.parseInt(arrayBc[1]));
	        	
	        case "STORE":
	        	return new ByteCode(ENUM_BYTECODE.STORE, Integer.parseInt(arrayBc[1]));
			
	        default:
	        	return null;
			}
		}
		
	}

}
