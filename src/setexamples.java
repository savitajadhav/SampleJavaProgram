import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class setexamples {

	public static void main(String[] args) {
		
		Set<Integer> hashset = new HashSet<>();
		hashset.add(20);
		hashset.add(20);
		hashset.add(35);
		hashset.add(20);
		hashset.add(48);
		System.out.println("The Hashset is:");
		for(int i : hashset)
			System.out.println(i);
		System.out.println(hashset.isEmpty());
		System.out.println(	hashset.contains(35));
		System.out.println(hashset.remove(35));
		System.out.println("The Modified Hashset is:");
		for(int i : hashset)
			System.out.println(i);
		Set<Integer> treeset = new TreeSet<>();
		treeset.add(45);
		treeset.add(21);
		treeset.add(87);
		treeset.add(21);
		System.out.println("The Treeset is:");
		for(int i : treeset)
			System.out.println(i);
		
		Map<String,String> hashmap = new HashMap<>();
		hashmap.put("Red", "Apple");
		hashmap.put("Yellow", "Banana");
		hashmap.put("White", "Radish");
		hashmap.put("Orange", "Orange");
		System.out.println("The Hashmap is:");
		for(Map.Entry m:hashmap.entrySet()) {
			System.out.println(m.getKey()+ ": "+m.getValue());
		}
		System.out.println(hashmap.containsKey("Yellow"));
		System.out.println(hashmap.containsValue("Orange"));
		System.out.println(hashmap.size());
		
	}

}
