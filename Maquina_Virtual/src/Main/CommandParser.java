package Main;

public class CommandParser {
	
	public static Command parse(String line) {
		
		String[]cadena = line.split(" ");
		if(cadena.length == 0) {
			return null;
		} else if(cadena[0].equalsIgnoreCase("HELP")) {
			return new Command(ENUM_COMMAND.HELP);
		
		}else if (cadena[0].equalsIgnoreCase("QUIT")) {
			return new Command(ENUM_COMMAND.QUIT);
			
		}else if(cadena[0].equalsIgnoreCase("RUN")) {
			return new Command(ENUM_COMMAND.RUN);
			
		}else if(cadena[0].equalsIgnoreCase("NEWINST")) {
			return new Command(ENUM_COMMAND.NEWINST);
		
		}else if(cadena[0].equalsIgnoreCase("RESET")) {
			return new Command(ENUM_COMMAND.RESET);
			
		}else if(cadena[0].equalsIgnoreCase("REPLACE")) {
			return new Command(ENUM_COMMAND.REPLACE);
			
		}else {
		return null;
		
	}

  }
}	
