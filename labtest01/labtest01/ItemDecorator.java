package labtest01;

public class ItemDecorator implements ItemInterface
{
	private Item aDecorated;
	
	/**
	 * Item constructor
	 */
	public ItemDecorator(Item pItem)
	{
		aDecorated = pItem;
	}
	
	/**
	 * @return item name
	 */
	public String getName()
	{
		return "Item - " + aDecorated.getName();
	}
	
	/**
	 * @return price of item
	 */
	public int getPrice()
	{
		return aDecorated.getPrice();
	}
	
	/**
	 * @return Id of item
	 */
	public int getId()
	{
		return aDecorated.getId();
	}
}
