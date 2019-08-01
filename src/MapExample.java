import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		//Map map = new HashMap();
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"Pauravi");
		map.put(2,"Bhargavi");
		map.put(3, "Savita");
		//Traversing map
	/*	Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());  */
		   for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
			

	}

}
