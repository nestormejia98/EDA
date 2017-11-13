package estructuradedatos;



public class Stack<T> extends DataStructure<T> {
	NodoG<T> first = null;
	
	/**
	 * Apila un nuevo elemento en la parte superior de la pila
	 */
	public void  Push(T data) {
		NodoG<T> n = new NodoG<T>(data);
		n.setNext(this.first);
		this.first =n;
	}
	
	/**
	 * Recupera el elemento superior de la pila
	 * @return T
	 */
	public T Pop() {
		if (this.first == null)
			return null;
		T data = this.first.getData();
		this.first = this.first.getNext();
		
		return data;
	}
	
	/**
	 * Devuelve el dato superior de la pila sin cambiar nada	
	 * @return
	 */
	public T Top() {
		if (this.first == null)
			return null;
		return this.first.getData();
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
		 
		 int count =0;
		 while (iterator != null){
			list[count] = iterator.getData();
			count++;
			iterator = iterator.getNext();
		 }		 
		 
		 return list;
	}
	
	
}
