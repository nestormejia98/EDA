package estructuradedatos;

public class ListG<T>  extends DataStructure<T>{

	
	public ListG(){		
	}
	
	/**
	 * Devuelve el tamaño de la lista
	 * @return int
	 */
	public int Size(){
		if (this.first == null)
			return 0;
		
		int count = 1;
		NodoG<T> iterator = this.first;
		while (iterator.getNext() !=null){
			count++;
			iterator = iterator.getNext();
		}		
		return count;
	}
	
	/**
	 * Devuelve true si esta vacia y false si tiene datos
	 * @return boolean
	 */
	public boolean IsEmpty(){
		if (this.first !=null)
			return false;
		else
			return true;
		//return this.Size() > 0 ? false : true; 
	}
	
	/**
	 * Inserta un nodo al inicio de la lista
	 */
	public void InsertIni(T data){
		 NodoG<T> n = new NodoG<T>(data);		
		 n.setNext(this.first);
		 this.first = n;
	}
	
	/**
	 * Inserta un nodo al final de la lista
	 */
	public void InsertEnd(T data){
		 NodoG<T> n = new NodoG<T>(data);
		 if (this.first == null)
			 this.first = n;
		 else{
			NodoG<T> iterator = this.first; 
			while (iterator.getNext() != null){
				iterator = iterator.getNext();
			}
			iterator.setNext(n);
		 }
	}
	
	/**
	 * Borra un nodo al principio de la lista
	 */
	public void DeleteIni(){
		if (this.first !=null){
			this.first = this.first.getNext();
		}
	}
	
	/**
	 * Obtiene el primer nodo
	 */
	public T GetFirst(){
		if (this.first == null)
			return null;
		return this.first.getData();
	}
		
	
	/**
	 * Devuelve un array con los datos de la lista.
	 * @return T[] 
	 */
	@SuppressWarnings("unchecked")
	public T[] ListAll(){		
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
