/**
 * 
 */
package com.gayle.ch1;

/**
 * @author vinish
 *
 */
public class FindUniqueCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(isUniqueCharacter("Helo"));
	}

	public static boolean isUniqueCharacter(String string) {
		boolean[] charOfArray = new boolean[128];
		for (int i = 0; i < string.length(); i++) {
			int val = string.charAt(i);
			if (charOfArray[val]) {
				return false;
			}
			charOfArray[val] = true;
		}
		return true;

	}
}
