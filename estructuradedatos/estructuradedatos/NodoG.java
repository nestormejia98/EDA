package estructuradedatos;

public class NodoG<T> {
	
	private T data;
	private NodoG<T> next;
		
	
	public NodoG(T i){
		this.data = i;		
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public NodoG<T> getNext() {
		return next;
	}

	public void setNext(NodoG<T> next) {
		this.next = next;
	}	
}
