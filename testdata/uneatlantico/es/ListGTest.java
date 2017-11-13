package testdata.uneatlantico.es;

import org.junit.Assert;
import org.junit.Test;
import estructuradedatos.ListG;


public class ListGTest  {
	
	@Test //Prueba si una lista esta vacia 
	public void EmptyTest() {
		ListG<Integer> l = new ListG<Integer>();
		Assert.assertTrue("Test failed for no empty",l.IsEmpty());
	}
	
	@Test //Prueba si una lista no esta vacia
	public void NoEmptyTest() {
		ListG<Integer> l = new ListG<Integer>();							
		l.InsertIni(1);
		Assert.assertFalse("Test failed for no empty list",l.IsEmpty());
	}
	
	@Test //Prueba el correcto tamano de una lista
	public void SizeTest() {
		ListG<Integer> l = new ListG<Integer>();
		Assert.assertEquals(l.Size(),0);
		
		l.InsertIni(1);
		l.InsertEnd(2);		
		Assert.assertEquals(l.Size(),2);
	}
	
	@Test //El primer dato es vacio
	public void GetFirstEmptyTest() {
		ListG<Integer> l = new ListG<Integer>();
		Assert.assertEquals(null,l.GetFirst());
	}
	
	@Test //Obtine el primer dato de la lista
	public void GetFirstTest() {
		ListG<Integer> l = new ListG<Integer>();
		l.InsertIni(1);
		l.InsertIni(2);
		Assert.assertEquals(l.GetFirst(),new Integer(2));
	}
	
	@Test //Lista los datos correctamente
	public void ListAllTest() {
		ListG<Integer> l = new ListG<Integer>();		
		l.InsertIni(1);
		l.InsertEnd(2);
		l.InsertEnd(5);
		l.InsertIni(3);
		
		Assert.assertEquals(l.Size(),4);
		Object[] larray = l.ListAll();
		Assert.assertEquals((Integer)larray[0],new Integer(3));
		Assert.assertEquals((Integer)larray[1],new Integer(1));
		Assert.assertEquals((Integer)larray[2],new Integer(2));
		Assert.assertEquals((Integer)larray[3],new Integer(5));
	}

}
