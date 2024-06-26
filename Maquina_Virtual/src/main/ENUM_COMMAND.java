package main;
/**
 * Clase ENUM_COMMAND
 * 
 * @author javie
 */
public enum ENUM_COMMAND {
	HELP, QUIT, NEWINST(1), RUN, RESET, REPLACE(1);
	private int valueArg;
	
	/**
	 * Constructora
	 */
	ENUM_COMMAND() {
		this.valueArg = 0;
	}
	/**
	 * Constructora
	 * @param n
	 */
	ENUM_COMMAND(int n) {
		this.valueArg = n;
	}
	/**
	 * Devuelve el número de parámetros que tiene un comando
	 * @return el num de parametros
	 */
	public int getValueArg(){
		return this.valueArg;
	}
}