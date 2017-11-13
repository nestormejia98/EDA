package testdata.uneatlantico.es;

import org.junit.Assert;
import org.junit.Test;

import estructuradedatos.Stack;



public class StackTest {
	
	@Test //Prueba si una pila esta vacia 
	public void EmptyTest() {
		Stack<Integer> s = new Stack<Integer>();
		Assert.assertTrue("Test failed for no empty",s.IsEmpty());
	}
	
	@Test //Prueba si una pila no esta vacia
	public void NoEmptyTest() {
		Stack<Integer> s = new Stack<Integer>();							
		s.Push(1);
		Assert.assertFalse("Test failed for no empty list",s.IsEmpty());
	}
	
	@Test //Prueba el correcto tamano de una lista
	public void SizeTest() {
		Stack<Integer> s = new Stack<Integer>();
		Assert.assertEquals(s.Size(),0);
		
		s.Push(1);
		s.Push(2);		
		Assert.assertEquals(s.Size(),2);
	}
	
	@Test //El primer dato es vacio
	public void GetFirstEmptyTest() {
		Stack<Integer> s = new Stack<Integer>();
		Assert.assertNull(s.Top());
	}
	
	@Test //Obtine el primer dato de la lista
	public void GetFirstTest() {
		Stack<Integer> s = new Stack<Integer>();
		s.Push(1);
		s.Push(2);
		Assert.assertEquals(s.Top(),new Integer(2));
	}
	
	@Test //Lista los datos correctamente
	public void ListAllTest() {
		Stack<Integer> s = new Stack<Integer>();		
		s.Push(1);
		s.Push(2);
		s.Push(5);
		s.Push(2);
		s.Push(0);
		
		Assert.assertEquals(s.Size(),5);
		Object[] larray = s.ListAll();
		Assert.assertEquals((Integer)larray[0],new Integer(0));
		Assert.assertEquals((Integer)larray[1],new Integer(2));
		Assert.assertEquals((Integer)larray[2],new Integer(5));
		Assert.assertEquals((Integer)larray[3],new Integer(2));
		Assert.assertEquals((Integer)larray[4],new Integer(1));
	}
}
