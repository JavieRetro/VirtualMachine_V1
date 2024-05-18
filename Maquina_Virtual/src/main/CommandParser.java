package main;

public class CommandParser {
	
	public static Command parse(String s) {
		
		String[]cadena = s.toLowerCase().split(" ");
		
		switch(cadena.length) {
		case 1:
			switch(cadena[0]) {
			case "help":
			return new Command(ENUM_COMMAND.HELP);
		
			case "quit":
			return new Command(ENUM_COMMAND.QUIT);
			
			case "run":
			return new Command(ENUM_COMMAND.RUN);
			
			case "reset":
			return new Command(ENUM_COMMAND.RESET);
			
			default:
				return null;
			
			}	
		case 2:
			if(cadena[1] != null) {
				switch(cadena[0]) {
				case "replace": 
				return new Command(ENUM_COMMAND.REPLACE, Integer.parseInt(cadena[1]));
				
				case "newinst":
				return new Command(ENUM_COMMAND.NEWINST, ByteCodeParser.parse(cadena[1]));
				
				default:
					return null;
				}
				}else {
					return null;
			}
		case 3:
			switch(cadena[0]) {
			case "newinst":
				if(cadena[1] != null) {
					return new Command(ENUM_COMMAND.NEWINST, ByteCodeParser.parse(cadena[1] + " " + cadena[2]));
				}else {
			   return null;
				}
			default:
				return null;
			}
			default:
			return null;
		}
		
	}
}	
