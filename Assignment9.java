package practice;

import java.util.HashSet;

public class Assignment9 {

	public static void main(String[] args) {
		String[] words = {"Hi","Hello","World","Hello","Good"};
		
		HashSet<String> removeDuplicate = new HashSet<>();
		
		for(String rd:words) {
			removeDuplicate.add(rd);
		}
		for(String w:removeDuplicate) {
			System.out.println(w);
		}
	}

}
