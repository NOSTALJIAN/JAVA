package study.ch05.sec08;

import java.util.TimeZone;

public class PrintTimeZoneID {
	public static void main(String[] args) {
		String[] availavleIDs = TimeZone.getAvailableIDs();
		for(String id : availavleIDs) {
			System.out.println(id);
		}
	}
}