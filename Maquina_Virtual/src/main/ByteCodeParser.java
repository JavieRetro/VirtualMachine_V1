package main;

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
		
			switch(arrayBc.length) {
			case 2:
                if (arrayBc[0].equalsIgnoreCase("push")) {
                    return new ByteCode(ENUM_BYTECODE.PUSH, Integer.parseInt(arrayBc[1]));
                } else if (arrayBc[0].equalsIgnoreCase("load")) {
                    return new ByteCode(ENUM_BYTECODE.LOAD, Integer.parseInt(arrayBc[1]));
                } else if (arrayBc[0].equalsIgnoreCase("store")) {
                    return new ByteCode(ENUM_BYTECODE.STORE, Integer.parseInt(arrayBc[1]));
                }
            case 1:
                if (arrayBc[0].equalsIgnoreCase("add")) {
                    return new ByteCode(ENUM_BYTECODE.ADD);
                } else if (arrayBc[0].equalsIgnoreCase("div")) {
                    return new ByteCode(ENUM_BYTECODE.DIV);
                } else if (arrayBc[0].equalsIgnoreCase("mul")) {
                    return new ByteCode(ENUM_BYTECODE.MUL);
                } else if (arrayBc[0].equalsIgnoreCase("sub")) {
                    return new ByteCode(ENUM_BYTECODE.SUB);
                } else if (arrayBc[0].equalsIgnoreCase("out")) {
                    return new ByteCode(ENUM_BYTECODE.OUT);
                } else if (arrayBc[0].equalsIgnoreCase("halt")) {
                    return new ByteCode(ENUM_BYTECODE.HALT);
                }
            default:
                return null;
        }
    }
}
