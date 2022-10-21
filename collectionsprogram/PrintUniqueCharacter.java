package collectionsprogram;


import java.util.HashSet;

import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String input = "babu";
		char[] name = input.toCharArray();
		char dup = 0;
		Set <Character> s = new HashSet<Character>();
		for(int a=0;a<name.length;a++) {
			if(!s.add(name[a])) {
				dup=name[a];
				s.remove(dup);
			}
		}


		System.out.println("The final characters of the string without duplicates : "+s);

	}

}
