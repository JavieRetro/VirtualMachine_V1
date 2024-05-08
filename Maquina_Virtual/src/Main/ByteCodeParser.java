package Main;

public class ByteCodeParser {

	public static ByteCode parse(String s) {
		// TODO Auto-generated method stub
		String[] cadenaBc = s.split(" ");
		
		if(s.length() == 0 || s.length() > 2) {
			return null;
			
		} else if(s.length() == 1) {
			
			switch(cadenaBc[1]) {
			        case "ADD":
			        
			        case "SUB":
			        	
			        case "DIV":
			        
			        case "MUL":
			        	
			        case "OUT":
			        	
			        case "HALT":
			        	
			        default:
			        	return null;		
			}
		}else {
			switch(cadenaBc[1]) {
			case "PUSH":
		        
	        case "LOAD":
	        	
	        case "STORE":
			
	        default:
	        	return null;
			}
		}
		
	}

}
