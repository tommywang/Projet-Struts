package mvcmetamodel.tools;

public class UsefulFunctions {
	
	/**
	 * set the first char of a string to upper case
	 * @param s
	 * @return
	 */
	public static String setFirstCharToUpper(String s){
		char c = Character.toUpperCase(s.charAt(0));
		return Character.toString(c)+s.substring(1);
	}
	
}
