package estructuradedatos;


public class Queue<T> extends DataStructure<T> {
	NodoG<T> first = null;
	
	/**
	 * Apila un nuevo elemento en la parte superior de la cola (FIFO)
	 */
	public void  Push(T data) {
		NodoG<T> n = new NodoG<T>(data);
		n.setNext(this.first);
		this.first =n;
	}
	
	/**
	 * Recupera el elemento de la cola Basado en FIFO (first in first out)
	 * @return T
	 */
	public T Pop() {
		 NodoG<T> iterator = this.first;
		 NodoG<T> iteratorAnt = iterator;
		 
		 if (iterator == null)
			 return null;
		 
		 while (iterator.getNext() != null){//Stop at the last Node
			iteratorAnt = iterator;
			iterator = iterator.getNext();			
		 }		 
		 
		 if (this.Size() == 1 )
			 this.first =null;
		 else
			 iteratorAnt.setNext(null);
		 
		 return iterator.getData();
	}
	
	@Override
	public boolean IsEmpty() {		
		return this.Size() > 0 ? false : true;
	}

	@Override
	public int Size() {
		if (this.first == null)
			return 0;
		
		int count = 1;
		NodoG<T> iterator = first;
		while (iterator.getNext() !=null){
			count++;
			iterator = iterator.getNext();
		}		
		return count;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T[] ListAll() {
		 T[] list = (T[])new Object[this.Size()];
		 NodoG<T> iterator = this.first;
		 
		 if (iterator == null)
			 return list;
		 
		 int count = this.Size() -1;
		 while (iterator != null){
			list[count] = iterator.getData();
			count--;
			iterator = iterator.getNext();
		 }		 
		 
		 return list;
	}
	
}
