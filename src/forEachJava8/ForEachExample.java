package forEachJava8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExample {

	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<>();
		items.put("java", 1);
		items.put("phyton", 2);
		items.put("ruby", 3);
		items.put("perl", 4);
		items.put("go", 5);
		items.put("c++", 6);

		System.out.println("Map values");
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}

		System.out.println("Map values with Lambda forEach");
		items.forEach((key, value) -> System.out.println("Item : " + key + " Count : " + value));

		System.out.println("Map values with another Lambda forEach");
		items.forEach((key, value) -> {
			System.out.println("Item : " + key + " Count : " + value);
			if ("java".equals(key)) {
				System.out.println("Hello Java");
			}
		});

		List<String> itemList = new ArrayList<String>();
		itemList.add("java");
		itemList.add("phyton");
		itemList.add("ruby");
		itemList.add("perl");
		itemList.add("go");
		itemList.add("c++");

		System.out.println("List values with Lambda forEach");
		// method reference
		// Output : A,B,C,D,E
		itemList.forEach(System.out::println);

		System.out.println("List values with filtered Lambda forEach");
		// Stream and filter
		// Output : B
		itemList.stream().filter(value -> value.contains("java")).forEach(System.out::println);
	}
}
