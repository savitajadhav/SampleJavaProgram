import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Test1");
		hm.put(200, "Test2");
		hm.put(300, "Test3");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		hm.putIfAbsent(400, "Test4");
		System.out.println("After invoking putIfAbsent method:");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Test11");
		map.put(102, "Test12");
		map.put(103, "Test13");
		map.putAll(hm);
		System.out.println("After invoking putAll method:");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		//Remove the element
		hm.remove(200);
		System.out.println("After invoking remove method:");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		//Replace the element
		hm.replace(100, "Testing");
		System.out.println("After invoking replace method:");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}

}
