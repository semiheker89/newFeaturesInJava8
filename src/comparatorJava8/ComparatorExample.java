package comparatorJava8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import model.City;

public class ComparatorExample {
	public static void main(String[] args) {

		List<City> cityList = getCities();

		System.out.println("Before Sort");
		for (City city : cityList) {
			System.out.println(city);
		}

		// sort by population
		Collections.sort(cityList, new Comparator<City>() {
			@Override
			public int compare(City city1, City city2) {
				return city1.getPopulation().compareTo(city2.getPopulation());
			}
		});

		System.out.println("After Sort");
		for (City city : cityList) {
			System.out.println(city.toString());
		}

		System.out.println("And The Lambda Sort..!");
		// lambda sort here!
		cityList.sort((City city1, City city2) -> city1.getPopulation().compareTo(city2.getPopulation()));

		// java 8 only, lambda also, to print the List
		cityList.forEach((city) -> System.out.println(city));

		System.out.println("And The Lambda Sort Reversed..!");
		// lambda sort reversed!
		Comparator<City> cityComparator  = (city1, city2) -> city1.getPopulation().compareTo(city2.getPopulation());
		cityList.sort(cityComparator.reversed());
		
		cityList.forEach(city -> System.out.println(city));

	}

	private static List<City> getCities() {
		Random rand = new Random();
		List<City> result = new ArrayList<City>();
		IntStream.range(0, 3).forEach(
				nbr -> result.add(new City(rand.nextInt(50), "City" + nbr, new BigDecimal(rand.nextInt(500000000)))));

		return result;

	}
}
