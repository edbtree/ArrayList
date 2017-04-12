
public class Item {

	String name;
	int weight;
	int qnt;
	
	public Item(String Name, int Weight, int Qnt)  {
		name = Name;
		weight = Weight;
		qnt = Qnt;
		print();
	}
	
	public int getWeight()  {
		return weight * qnt;
	}
	
	public void print()  {
		System.out.println(qnt + " " + name + " - total weight " + getWeight());
	}
}
