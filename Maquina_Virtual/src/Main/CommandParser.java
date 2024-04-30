package Main;

public class CommandParser {
	
	public static Command parse(String line) {
		
		String[] cadena = line.trim().split("\\s+");
		ENUM_COMMAND  commandEnum;
		commandEnum = ENUM_COMMAND.valueOf(cadena[0].toUpperCase());
		if(cadena.length == 1) {
			switch(commandEnum) {
			case HELP:
				return new Command (commandEnum.HELP);
			case QUIT:
				return new Command (commandEnum.QUIT);
			case RUN:
				return new Command (commandEnum.RUN);
			case RESET:
				return new Command (commandEnum.RESET);
			}
		}else if(cadena.length == 2) {
			switch(commandEnum) {
			case NEWINST:
			ByteCode instruction = ByteCodeParser.parse(cadena[1]);
				return new Command (commandEnum.NEWINST, instruction);
			case REPLACE:
				int replace = Integer.parseInt(cadena[2]);
				return new Command (commandEnum.REPLACE, replace);
	
			}
		}else if(cadena.length == 3) {
			ByteCode instruction = ByteCodeParser.parse(cadena[1]);
			int replace = Integer.parseInt(cadena[2]);
			return new Command (commandEnum.NEWINST, instruction, replace);
		}
		
		return null;
		
	}

}
