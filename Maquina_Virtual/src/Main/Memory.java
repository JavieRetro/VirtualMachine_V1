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
		
		public void resize(int pos) {
			if(pos >= size) {
				this.empty = false;
				Integer[]Memory2 = new Integer[pos * 2];
				
				for(int i = 0; i < this.max_Memory; i++) {
					
					Memory2[i] = this.Memory[i];
				}
				
				this.Memory = Memory2;
			}
		}
}
