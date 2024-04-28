package Main;

public class Memory {
	private Integer[] Memory;
	private int size = 10; // Igual a numElems en OperandStack
	private boolean empty;
	private int max_Memory;
	
	//Constructora
		public Memory() {
			this.Memory = new Integer[size];
			this.empty = true;
		}
		
		private void resize(int pos) {
			if(pos >= size) {
				this.empty = false;
				Integer[]Memory2 = new Integer[pos * 2];
				
				for(int i = 0; i < this.max_Memory; i++) {
					
					Memory2[i] = this.Memory[i];
				}
				
				this.Memory = Memory2;
			}
		}
		
		public boolean write(int posicion, int valor) {
			if(posicion >= 0) {
				this.resize(posicion);
				this.Memory[posicion] = valor;
				return true;
			}else {
				return false;
			}
		}
		
		public Integer read (int posicion) {
			if(this.Memory[posicion] == null) {
				
			return -1;
			}else {
				return this.Memory[posicion] = posicion;
			}
			
		}
}

