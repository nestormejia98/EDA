package estructuradedatos;

/**
 * Interface para estructuras de datos
 * @author SMaroto
 * @param <T>
 */
public interface IDataStructure<T> {
	public boolean IsEmpty();
	public int Size();
	public  T[] ListAll();

}
