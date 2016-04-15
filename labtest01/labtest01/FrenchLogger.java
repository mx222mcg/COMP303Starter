package labtest01;

public class FrenchLogger extends AbstractCorporationLogger
{
	public void update(Object pInventory)
	{
		Inventory aInventory = (Inventory) pInventory;
		System.out.println("Un inventaire " + aInventory.getName() + " ajoute");
	}
}
