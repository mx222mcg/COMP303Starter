package labtest01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;

/**
 * Represents a company that owns and operates
 * one or more grocery stores, each with its own inventory.
 */
public class Corporation extends Observable
{
	private Map<String, Inventory> aInventories = new HashMap<String, Inventory>();
//	private Corporation INSTANCE = new Corporation();
	private final List<AbstractCorporationLogger> aObservers = new ArrayList<>();
	private Corporation(){}
	
//	public Corporation getInstance()
//	{
//		return INSTANCE;
//	}
	
	/**
	 * @param pInventory An inventory to add to the corporation.
	 */
	public void addInventory(Inventory pInventory)
	{
		aInventories.put(pInventory.getName(), pInventory);
		this.setChanged();
		notifyObservers(pInventory);
	}
	
	public void notifyObservers(Object pInventory)
	{
		for (AbstractCorporationLogger obs : aObservers)
		{
			obs.update(pInventory);
		}
	}
	
	public void addObserver(AbstractCorporationLogger pObserver)
	{
		aObservers.add(pObserver);
	}
	
	public void removeObserver(AbstractCorporationLogger pObserver)
	{
		aObservers.remove(pObserver);
	}
	
	public static void main(String[] args)
	{
		Corporation aCorporation = new Corporation();
		EnglishLogger aEnglishLogger = new EnglishLogger();
		FrenchLogger aFrenchLogger = new FrenchLogger();
		aCorporation.addObserver(aEnglishLogger);
		aCorporation.addObserver(aFrenchLogger);
		Inventory aInventory = new Inventory("Test");
		aCorporation.addInventory(aInventory);
	}
}
