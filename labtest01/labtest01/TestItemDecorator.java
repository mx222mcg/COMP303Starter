package labtest01;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestItemDecorator
{
	Item aItem;
	ItemDecorator aDecorated;
	
	@Before
	public void setup()
	{
		aItem = new Item("Cereal", 1, 200);
		aDecorated = new ItemDecorator(aItem);
	}
	
	@Test
	public void testGetName()
	{
		assertEquals(aDecorated.getName(), "Item - " + aItem.getName());
		assert(aDecorated.getName() != aItem.getName());
		assert(aDecorated.getName().contains(aItem.getName()));
	}
}
