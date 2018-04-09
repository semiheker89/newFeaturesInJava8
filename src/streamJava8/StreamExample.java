package streamJava8;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		Stream<String> languages = Stream.of("java", "ruby", "go", null, "phyton", null,"c++", "php");

//		List<String> result = language.collect(Collectors.toList());

//		List<String> result = language.filter(x -> x != null).collect(Collectors.toList());
		
//		List<String> result = language.filter(x -> x != null && x.startsWith("j")).collect(Collectors.toList());

		List<String> result = languages.filter(Objects::nonNull).collect(Collectors.toList());

		result.forEach(System.out::println);

	}
}
