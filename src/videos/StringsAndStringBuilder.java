package videos;

public class StringsAndStringBuilder {

	public static void main(String[] args) {
		
		String firstName = "Sally";
		String lastName =  "Smith";
		System.out.println(firstName + " " + lastName);
		
		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);
		
		//Strings are immutable
		System.out.println(firstName.concat(lastName));
		System.out.println(firstName);
		
		//A StringBuilder is mutable
		StringBuilder fullName = new StringBuilder("Sam");
		fullName.append(" Smith");
		System.out.println(fullName.toString());
		
		System.out.println(fullName.charAt(5));
//		System.out.println(fullName.deleteCharAt(5));
//		System.out.println(fullName.delete(1, 3));
		System.out.println(fullName.indexOf("it"));
		System.out.println(fullName.replace(4, 9, "Thompson"));
		System.out.println(fullName.reverse());
	}
	
//	public static String multiplyString(String str, int num) {
//		String result = "";
//		for (int i = 0; i < num; i++) {
//			result += str;
//		}
//		return result;
//	}
	public static String multiplyString(String str, int num) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < num; i++) {
			result.append(str);
		}
		return result.toString();
	}
}
