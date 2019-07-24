import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("India");
		list.add("China");
		list.add("Japan");
		list.add("Malyasia");
		list.remove(1);
		list.add(1, "North Corea");
		System.out.println("The boolean value is:" +list.contains("Pakistan"));
		list.clear();
		for(String s : list)
			System.out.println(s);
	}

}
