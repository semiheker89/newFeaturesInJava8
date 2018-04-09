package streamFilterJava8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import model.City;

public class StreamFilterExample {

	public static void main(String[] args) {

		List<String> languages = Arrays.asList("Java", "Ruby", "Phyton", "Go");

		List<String> result = languages.stream().filter(line -> !"Phyton".equals(line)).collect(Collectors.toList());

		result.forEach(System.out::println);

		citiesWithLambda();
	}

	private static void citiesWithLambda() {
		System.out.println("citiesWithLambda starts...");

		// initialize cit list
		List<City> cityList = new ArrayList<City>();
		cityList.add(new City(34, "Istanbul", new BigDecimal(7500000)));
		cityList.add(new City(35, "Izmir", new BigDecimal(3500000)));
		cityList.add(new City(10, "Balikesir", new BigDecimal(1500000)));

		City izmir = cityList.stream().filter(city -> "Izmir".equals(city.getCityName())).findAny().orElse(null);

		System.out.println(izmir);

		City istanbul = cityList.stream().filter(city -> "Manisa".equals(city.getCityName())).findAny().orElse(null);

		System.out.println(istanbul);

		/**
		 * 
		 * multiple condition example
		 * 
		 */
		System.out.println("citiesWithLambda with multiple conditions starts...");

		City conditionedIzmir = cityList.stream()
				.filter(city -> "Izmir".equals(city.getCityName()) && 34 == city.getCityCode()).findAny().orElse(null);

		System.out.println("Izmir :" + conditionedIzmir);

		// or like this
		City conditionedIstanbul = cityList.stream().filter(city -> {
			if ("Istanbul".equals(city.getCityName()) && 34 == city.getCityCode()) {
				return true;
			}
			return false;
		}).findAny().orElse(null);

		System.out.println("Istanbul :" + conditionedIstanbul);

		/**
		 * 
		 * filter() and map() example
		 * 
		 */

		System.out.println("filter() and map() example");
		Integer cityCode = cityList.stream().filter(city -> "Istanbul".equals(city.getCityName()))
				.map(City::getCityCode).findAny().orElse(null);

		System.out.println("City Code : " + cityCode);

		System.out.println("City Names:");
		List<String> cityNameList = cityList.stream().map(City::getCityName).collect(Collectors.toList());

		cityNameList.forEach(System.out::println);

		System.out.println("City Codes:");
		List<Integer> cityCodeList = cityList.stream().map(City::getCityCode).collect(Collectors.toList());

		cityCodeList.forEach(System.out::println);

	}
}
