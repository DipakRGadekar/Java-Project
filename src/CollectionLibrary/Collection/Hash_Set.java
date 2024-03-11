package CollectionLibrary.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	// Does not accept duplicate value
	public static void main(String[] args) {

		HashSet<String> s = new HashSet<String>();
		s.add("US");
		s.add("India");
		s.add("USA");
		s.add("India");
		s.add("Canada");
		s.add("NZ");
		s.add("Eng");
		System.out.println(s);

		System.out.println(s.contains("US"));
		System.out.println(s.isEmpty());
		System.out.println(s.remove("USA"));
		System.out.println(s.size());
	//	s.clear();
		System.out.println(s);

		System.out.println("Iterator concept");
		Iterator<String> i = s.iterator();
		System.out.println(i.next() + " : First element ");
	     while(i.hasNext()) {
		System.out.println(i.next());
	}
	}
}
