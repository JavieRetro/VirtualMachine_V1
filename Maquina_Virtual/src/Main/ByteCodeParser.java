package Main;

public class ByteCodeParser {

	public static ByteCode parse(String line) {
		// TODO Auto-generated method stub
		String[] cadena = line.split(" ");
		
		switch(cadena.length) {
		
		case 1:
			
			if(cadena[0].equalsIgnoreCase("newinst") && cadena[1].equalsIgnoreCase("push")) {
				return new ByteCode(ENUM_BYTECODE.PUSH);
			}else if(cadena[0].equalsIgnoreCase("newinst") && cadena[1].equalsIgnoreCase("load")) {
				return new ByteCode(ENUM_BYTECODE.LOAD);
			}else if(cadena[0].equalsIgnoreCase("newinst") && cadena[1].equalsIgnoreCase("store")) {
				return new ByteCode(ENUM_BYTECODE.STORE);
			}
			
		case 2:
			if(cadena[0].equalsIgnoreCase("newinst") && cadena[1].equalsIgnoreCase("add")) {
				return new ByteCode(ENUM_BYTECODE.ADD);
			}else if(cadena[0].equalsIgnoreCase("newinst") && cadena[1].equalsIgnoreCase("sub")) {
				return new ByteCode(ENUM_BYTECODE.SUB);	
			}else if(cadena[0].equalsIgnoreCase("newinst") && cadena[1].equalsIgnoreCase("div")) {
				return new ByteCode(ENUM_BYTECODE.DIV);
			}else if(cadena[0].equalsIgnoreCase("newinst") && cadena[1].equalsIgnoreCase("mul")) {
				return new ByteCode(ENUM_BYTECODE.MUL);
			}else if(cadena[0].equalsIgnoreCase("newinst") && cadena[1].equalsIgnoreCase("out")) {
				return new ByteCode(ENUM_BYTECODE.OUT);
			}else if(cadena[0].equalsIgnoreCase("newinst") && cadena[1].equalsIgnoreCase("halt")) {
				return new ByteCode(ENUM_BYTECODE.HALT);
			}
			default:
			
				return null;
		}
		
	}

}
