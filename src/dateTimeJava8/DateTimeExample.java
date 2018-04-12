package dateTimeJava8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

//java.time.LocalDate – date without time, no time-zone.
//java.time.LocalTime – time without date, no time-zone.
//java.time.LocalDateTime – date and time, no time-zone.
//java.time.ZonedDateTime – date and time, with time-zone.
//java.time.DateTimeFormatter – formatting (date -> text), parsing (text -> date) for java.time
//java.time.Instant – date and time for machine, seconds passed since the Unix epoch time (midnight of January 1, 1970 UTC)
//java.time.Duration – Measures time in seconds and nanoseconds.
//java.time.Period – Measures time in years, months and days.
//java.time.TemporalAdjuster – Adjust date.

public class DateTimeExample {

	public static void main(String[] args) {

		Instant instant = Instant.now();

		System.out.println("Instant : " + instant);

		String date = "2016-08-16";

		// default, ISO_LOCAL_DATE
		LocalDate localDate = LocalDate.parse(date);

		System.out.println("LocalDate : " + localDate);

		LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);

		System.out.println("LocalDateTime : " + ldt);
	}

}
