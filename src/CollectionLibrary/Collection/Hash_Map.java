package CollectionLibrary.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hash_Map {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap();
		h.put(1, "First");
		h.put(2, "Second");
		h.put(3, "Third");
		System.out.println(h);
		h.put(4, "Five");
		System.out.println(h.containsKey(2));
		System.out.println(h.containsValue("Third"));
		System.out.println("Size of Has map is: " + h.size());
		System.out.println(h.get(3));
		h.remove(4);
		System.out.println(h);

		System.out.println("--- Iterator concept in Hash map ---");
		Set s = h.entrySet();
		Iterator sb = s.iterator();

		while (sb.hasNext()) {
			Map.Entry mp = (Map.Entry) sb.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}
}
