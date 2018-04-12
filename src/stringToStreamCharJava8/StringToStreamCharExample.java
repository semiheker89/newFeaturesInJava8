package stringToStreamCharJava8;

public class StringToStreamCharExample {

	public static void main(String[] args) {

		String password = "SeMihEkEr";

		password.chars() // IntStream
				.mapToObj(x -> (char) x)// Stream<Character>
				.forEach(System.out::println);

	}

}