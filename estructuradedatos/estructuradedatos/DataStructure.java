package estructuradedatos;


public abstract class DataStructure<T> implements IDataStructure<T> {
	public NodoG<T> first =null;
	
	@Override
	public abstract boolean IsEmpty();

	@Override
	public abstract int Size(); 

	@Override
	public abstract T[] ListAll(); 
	
}
