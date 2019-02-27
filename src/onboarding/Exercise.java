package onboarding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise {

	/*
	 * Write a method that returns a comma separated string based on a given list of
	 * integers. Each element should be preceded by the letter 'e' if the number is
	 * even, and preceded by the letter 'o' if the number is odd. For example, if
	 * the input list is (3,44), the output should be 'o3,e44'.
	 * 
	 */

	public static String firstExercise(List<Integer> list) {

		return list.stream().map(i -> i % 2 == 0 ? "e" + i : "o" + i).collect(Collectors.joining(","));

	}

	/*
	 * Given a list of Strings, write a method that returns a list of all strings
	 * that start with the letter 'a' (lower case) and have exactly 3 letters. TIP:
	 * Use Java 8 Lambdas and Streams API's.
	 * 
	 */

	public static List<String> secondExercise(List<String> list) {

		return list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());

	}

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(345, 579, 600, 1283, 1380, 1393, 1967, 1975, 2715, 2890, 2978, 2995,
				3109, 3299, 3333, 3385, 3418, 3535, 3631, 3674, 3851, 3906, 4107, 4408, 4456, 4556, 5676, 5854, 6236,
				6416, 6683, 6952, 7070, 7131, 7739, 7846, 8135, 8267, 8277, 8333, 8348, 8663, 8917, 9039, 9278, 9500,
				9581, 9654, 9698, 9805);

		List<String> stringList = Arrays.asList("common", "ripe", "charge", "and", "distribution", "parcel",
				"glistening", "bomb", "ban", "substantial", "are", "minor", "impossible", "acceptable", "encouraging",
				"quarter", "vein", "different", "minor", "axe", "bed", "thoughtful", "erratic", "interesting", "name",
				"ant", "fang", "name", "righteous", "Axe", "striped", "Fix", "acrid", "frightening", "edge");

		System.out.println(firstExercise(integerList));

		secondExercise(stringList).forEach(System.out::println);

	}

}
