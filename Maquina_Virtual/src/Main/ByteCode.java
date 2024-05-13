package Main;

public class ByteCode {

	private ENUM_BYTECODE name;
	private int valor;
	
	public ByteCode(ENUM_BYTECODE name) {
		this.name = name;
	}
	
	public ByteCode(ENUM_BYTECODE name, int valor){
		this.name = name;
		this.valor = valor;
	}
	
	public String toString() {
		String cadena = this.name.toString().toUpperCase() + this.valor;
		
		return cadena;
	}
	
	public ENUM_BYTECODE getInstruction() {
		return this.name;
	}
	

    public int getParam() {
    	return this.valor;
    }
    
    public int getValor() {
    	return this.valor;
    }
    
}
