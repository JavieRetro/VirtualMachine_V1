package Main;

public class ByteCode {

	private ENUM_BYTECODE name;
	private int valor;
	
	public ByteCode(ENUM_BYTECODE name) {
		this.name = name;
	}
	
	public ByteCode(ENUM_BYTECODE name, Integer valor){
		this.name = name;
		this.valor = valor;
	}

    public ENUM_BYTECODE getByteCode() {
    	return this.name;
    }
    
    public int getValor() {
    	return this.valor;
    }
}
