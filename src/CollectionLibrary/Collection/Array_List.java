package CollectionLibrary.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
	public static void main(String[] args) {

		ArrayList<String> aryList = new ArrayList<String>();
		aryList.add("Dipak ");
		aryList.add("Priti ");
		aryList.add("Dipak ");
		System.out.println(aryList.get(0));

		aryList.add(2, "Gadekar ");
		Collections.addAll(aryList, "1 ", "2 ", "5 ", "9 ");
		System.out.println(aryList.size());

		aryList.remove(0);
		// aryList.clear();

		for (String i : aryList) {
			System.out.print(i);
		}
		System.out.println(aryList.size());
		System.out.println(aryList.isEmpty());
		System.out.println(aryList.contains("Priti "));

	}
}
