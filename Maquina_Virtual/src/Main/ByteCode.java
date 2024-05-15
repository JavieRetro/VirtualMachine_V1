package Main;

public class ByteCode {

	private ENUM_BYTECODE name;
	private int parametro;
	
	/**
	 * Constructora
	 * 
	 * @param name Bytecode
	 */
	public ByteCode(ENUM_BYTECODE bc) {
		this.name = bc;
	}
	
	/**
	 * Constructora 2
	 * 
	 * @param name Bytecode
	 * @param valor parametro
	 */
	
	public ByteCode(ENUM_BYTECODE bc, int numero){
		this.name = bc;
		this.parametro = numero;
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
	 * @return
	 */
	public ENUM_BYTECODE getInstruction() {
		return this.name;
	}
	
    /**
     * Metodo que devuelve el parametro del Bytecode
     * 
     * @return
     */
    public int getparam() {
    	return this.parametro;
    }
}
