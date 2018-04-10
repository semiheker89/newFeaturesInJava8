package stringJoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {

	public static void main(String[] args) {
		/**
		 * StringJoiner
		 */
		StringJoiner sj = new StringJoiner(",");
		sj.add("aaa");
		sj.add("bbb");
		sj.add("ccc");
		String result = sj.toString();

		System.out.println("result : " + result);

		/**
		 * StringJoiner with delimeter, prefix and suffix
		 * 
		 * D delimeter
		 * P Prefix
		 * S Suffix
		 */
		sj = new StringJoiner("D", "P", "S");
		sj.add("2016");
		sj.add("02");
		sj.add("26");
		result = sj.toString(); 
		
		System.out.println("result with prefix and suffix : " + result);
		
		/**
		 * StringJoiner with join
		 */
		 result = String.join("-", "2015", "10", "31" );
		 System.out.println("result with join : " + result);
		 
		 /**
			 * StringJoiner with Collectors.joining
			 */
		 List<String> languages = Arrays.asList("java", "python", "nodejs", "ruby");
		 result = languages.stream().map(x -> x).collect(Collectors.joining(" | "));
		 System.out.println("result with Collectors.joining : " + result);
		 
		  List<Language> languageList = Arrays.asList(
	                new Language("java", 1),
	                new Language("python", 2),
	                new Language("nodejs", 3),
	                new Language("ruby", 4)
	        );
		 result = languageList.stream().map(x -> x.getName())
					.collect(Collectors.joining(", ", "{", "}"));
		 
		 System.out.println("result with another Collectors.joining" + result);
	}
}
