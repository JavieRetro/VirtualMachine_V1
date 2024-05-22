package main;
/**
 * Class ByteCode
 * 
 * @author javie
 */

public class ByteCode {
	/**
	 * Atributos
	 */
	private ENUM_BYTECODE name;
	private int parametro;
	
	/**
	 * Constructora
	 * 
	 * @param bc Bytecode
	 */
	public ByteCode(ENUM_BYTECODE bc) {
		this.name = bc;
	}
	
	/**
	 * Constructora 2
	 * 
	 * @param bc Bytecode
	 * @param valor parametro
	 */
	
	public ByteCode(ENUM_BYTECODE bc, int param){
		this.name = bc;
		this.parametro = param;
	}
	
	/**
	 * Transformo Bytecode en tipo String
	 * 
	 * @return devolver Bytecode en tipo String
	 */
	
	public String toString() {
		String cadena = this.name.toString().toUpperCase() + this.parametro;
		return cadena;
	}
	
	/**
	 * Metodo para devolver el nombre del Bytecode
	 * 
	 * @return nombre del ByteCode
	 */
	public ENUM_BYTECODE getInstruction() {
		return this.name;
	}
	
    /**
     * Metodo que devuelve el parametro del Bytecode
     * 
     * @return parametro del bytecode
     */
    public int getParam() {
    	return this.parametro;
    }
}
