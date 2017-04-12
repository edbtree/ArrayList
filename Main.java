import java.util.ArrayList;

public class Main {
	
	
	public static boolean  isSpace(ArrayList<Item> inv, Item newItem)  {
		
		int wTrack = 0;
		
		for (int i = 0; i < inv.size(); i ++)  {
			wTrack += inv.get(i).getWeight();
		
		}
		
		if (wTrack + newItem.getWeight() <= 10)  {
			return true;
		}
		System.out.println("Inventory is too full");
		return false;
		
	}
	public static void main(String[] args) {
		
		ArrayList <Item> inv = new ArrayList<Item>();
		
		Item i1 = new Item ("Sword", 5, 1);
		
			if (isSpace(inv, i1))  {
			inv.add(i1);
		}
		
		Item i2 = new Item ("Potion", 1, 3);
		
			if (isSpace(inv, i2))  {
			inv.add(i2);
		}
			
		Item i3 = new Item ("Bow", 3, 1);
			
			if (isSpace(inv, i3))  {
				inv.add(i3);
			}
		
		Item i4 = new Item ("Knife", 2, 1);
			
			if (isSpace(inv, i4))  {
				inv.add(i4);
			}
		
		
		

	}

}
