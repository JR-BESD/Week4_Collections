package labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringBuilderListSetMap {
	
	public static void main(String[] args) {
		
		//why would we use a StringBuilder instead of a String
			//A String is immutable(cannot be changed), a StringBuilder can be changed. 
		
		//instantiate a new StringBuilder and append the characters 0 through 9 to it separated by dashes
		//make sure no dash appears and the end of the String Builder
		StringBuilder wholeNumbers = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			if (i < 9) {
				wholeNumbers.append(i + "-");
			} else {
				wholeNumbers.append(i);
			}
		}
		
		System.out.println(wholeNumbers.toString());
		
		//create a list of Strings and add 5 Strings to it, each with a different length
		List<String> list = new ArrayList<String>(); //Arrays.asList("Tom" , "Sammy", "Paul", "I", "Me")

		list.add("atomic");
		list.add("automatic");
		list.add("was");
		list.add("good evening");
		list.add("weathered");
						
		System.out.println(list);
				
		//write and test a method that takes a list of strings and returns the shortest string		
		System.out.println(getShortest(list));
		
		//write and test a method that takes a list of strings and returns the list with the first and last element switched
		System.out.println(switchFirstAndLast(list));
		
		//write and test a method that takes a list of strings and returns a string with all the list elements concatenated to each other,
		//separated by a comma
		System.out.println(combineStrings(list));
		
		//write and test a method that takes a list of strings and returns a new list with all strings from the original list
		//containing the second string parameter (i.e. like a serach method)
		System.out.println(searchString(list, "i"));
		
		//write and test a method that takes a list of integers and returns a List<List<Integer>> where the first list in the returned value
		//contains any number from the input list that is divisible by 2, the second list contains values from teh input list that are divisible
		//by 3, the third divisible by 5, and the forth all numbers from the input list not divisible by 2, 3, or 5
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 20, 25, 30);
		
		System.out.println(getDivisions(numbers));
		
		//write and test a method that takes a list of Strings and returns a list of integers that contains the length of each string.
		System.out.println(getStringLengths(list));
		
		// create a set of strings and add 5 values
		Set<String> stringSet = new HashSet<String>();
		stringSet.add("one");
		stringSet.add("two");
		stringSet.add("three");
		stringSet.add("four");
		stringSet.add("five");		
		
		//write and test a method that takes a set of strings and a character and returns a set of strings consisting of all the strings in the
		//input set that start with the character parameter.
		System.out.println(startsWith(stringSet, 'f'));
		
		//write and test a method that takes a set of strings and returns a list of the same strings
		System.out.println(convertToList(stringSet));
		
		//write and test a method that takes a set of integers and returns a new set of integers containing only even numbers from the original set
		Set<Integer> numberSet = new HashSet<Integer>();
		for (int i = 1; i <= 20; i++) {
			numberSet.add(i);
		}
		System.out.println(getEvenNumbers(numberSet));
		
		//create a map of string and string and add 3 items to it where the key of each is a word and the value is the definition of the word
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Integrity", "the quality of being honest and having strong moral principles; moral uprightness.");
		dictionary.put("Hoard", "a stock or store of money or valued objects, typically one that is secret or carefully guarded");
		dictionary.put("Hollow", "having a hole or empty space inside.");
		
		//write and test a method what takes a Map<String, String> and a string and returns the value for the key in the map that matches the
		//string parameter (i.e. like a language dictionary lookup)
		System.out.println(getDefinition(dictionary, "Hollow"));
		
		//write and test a method that takes a List<String> and returns a map<Character, Integer> containing a count of all the strings that start 
		//with a given character
		System.out.println(countStringsBeginningWith(list));
		
	}

	private static Map<Character, Integer> countStringsBeginningWith(List<String> list) {
		Map<Character, Integer> result = new HashMap<Character, Integer>();
		for (String item : list) {
			if (result.containsKey(item.charAt(0))) {
				result.put(item.charAt(0), result.get(item.charAt(0)) + 1);
			}else {
				result.put(item.charAt(0), 1);
			}
		}
		return result;
	}

	private static String getDefinition(Map<String, String> map, String string) {
		return map.get(string);
	}

	private static Set<Integer> getEvenNumbers(Set<Integer> set) {
		Set<Integer> result = new HashSet<Integer>();
		
		for (int num : set) {
			if (num % 2 == 0) {
				result.add(num);
			}
		}
		return result;
	}

	private static List<String> convertToList(Set<String> set) {
		List<String> result = new ArrayList<String>();
		
		for (String item : set) {
			result.add(item);
		}
		return result;
	}

	private static Set<String> startsWith(Set<String> set, char letter) {
		Set<String> result = new HashSet<String>();
		
		for (String item : set) {
			if (item.charAt(0) == letter) {
				result.add(item);
			}
		}
		return result;
	}

	private static List<Integer> getStringLengths(List<String> list) {
		List<Integer> stringLengths = new ArrayList<Integer>();
		for (String str : list) {
			stringLengths.add(str.length());
		}
		return stringLengths;
	}

	private static List<List<Integer>> getDivisions(List<Integer> intList) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		
		
		for (int num : intList) {
			if (num % 2 == 0) {
				results.get(0).add(num);
			} 
			if (num % 3 == 0) {
				results.get(1).add(num);
			} 
			if (num % 5 == 0) {
				results.get(2).add(num);
			} 
			if(num % 2 != 0 && num % 3 != 0 && num %5 != 0) {
				results.get(3).add(num);
			}
		}		
		return results;
	}

	private static List<String> searchString(List<String> list, String query) {
		List<String> result = new ArrayList<String>();
		for (String item : list) {
			if (item.contains(query)) {
				result.add(item);
			}
		}			
		return result;
	}

	private static String combineStrings(List<String> list) {
		StringBuilder result = new StringBuilder();
		for (String item : list) {
			result.append(item);
			if (item != list.get(list.size()-1)) {
				result.append(", ");
			} else {
				result.append(".");
			}
		}
		return result.toString();
	}

	private static List<String> switchFirstAndLast(List<String> list) {
		String first = list.get(0);		
		list.set(0, list.get(list.size() -1));
		list.set(list.size()-1, first);
		
		return list;
	}

	private static String getShortest(List<String> strings) {
		String result = strings.get(0);
		
		for (String string : strings) {
			if (string.length() < result.length()) {
				result = string;
			}			
		}
		return result;		
	}

}
