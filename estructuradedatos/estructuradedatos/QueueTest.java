package estructuradedatos;

import org.junit.Assert;
import org.junit.Test;


public class QueueTest {
	
	@Test //Prueba si una cola esta vacia 
	public void EmptyTest() {
	
		Queue<Integer> q = new Queue<Integer>();
		Assert.assertTrue("Test failed for no empty",q.IsEmpty());
	}
	
	@Test //Prueba si una cola no esta vacia
	public void NoEmptyTest() {
		Queue<Integer> q = new Queue<Integer>();							
		q.Push(1);
		Assert.assertFalse("Test failed for no empty list",q.IsEmpty());
	}
	
	@Test //Prueba el correcto tamano de una cola
	public void SizeTest() {
		Queue<Integer> q = new Queue<Integer>();
		Assert.assertEquals(q.Size(),0);		
		q.Push(1);
		q.Push(2);
		q.Push(3);
		Assert.assertEquals(q.Size(),3);
	}
	
	@Test //Prueba si apilando y desapilando tiene el tañano correcto
	public void PushAndPopTestSizeEmpty() {
		Queue<Integer> q = new Queue<Integer>();							
		q.Push(1);
		q.Pop();
		q.Push(5);
		q.Push(8);
		q.Pop();
		q.Pop();
		Assert.assertEquals(q.Size(),0);
	}
	
	@Test //Prueba si apilando y desapilando tiene el tañano correcto
	public void PushAndPopTestSizeNoEmpty() {
		Queue<String> q = new Queue<String>();							
		q.Push("A");
		String val = q.Pop();
		Assert.assertEquals("A",val);
		Assert.assertEquals(0,q.Size());
	}
	
	@Test //Prueba si apilando y desapilando tiene el tañano correcto 
	//y devuelve los valores correctos
	public void PushAndPopExpectedValues() {
		Queue<Integer> q = new Queue<Integer>();							
		q.Push(1);
		Assert.assertEquals(q.Pop(),new Integer(1));
		q.Push(5);
		q.Push(8);
		Assert.assertEquals(q.Pop(),new Integer(5));
		Assert.assertEquals(q.Pop(),new Integer(8));
		q.Push(4);
		q.Push(8);
		Assert.assertEquals(q.Pop(),new Integer(4));
		Assert.assertEquals(q.Pop(),new Integer(8));
		Assert.assertEquals(q.Size(),0);
	}

}
