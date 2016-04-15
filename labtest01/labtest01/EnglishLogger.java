package labtest01;

public class EnglishLogger extends AbstractCorporationLogger
{
	public void update(Object pInventory)
	{
		Inventory aInventory = (Inventory) pInventory;
		System.out.println("An inventory " + aInventory.getName() + " added");
	}
}
