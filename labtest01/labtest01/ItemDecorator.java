package labtest01;

public class ItemDecorator implements ItemInterface
{
	private Item aDecorated;
	
	public ItemDecorator(Item pItem)
	{
		aDecorated = pItem;
	}
	
	public String getName()
	{
		return "Item - " + aDecorated.getName();
	}
	
	/**
	 * 
	 */
	public int getPrice()
	{
		return aDecorated.getPrice();
	}
	
	/**
	 * 
	 */
	public int getId()
	{
		return aDecorated.getId();
	}
}
