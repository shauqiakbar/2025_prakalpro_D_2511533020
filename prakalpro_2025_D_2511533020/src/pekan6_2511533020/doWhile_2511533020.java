package pekan6_2511533020;

import java.util.*;

public class doWhile_2511533020 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String phrase; 
		do {
			System.out.print("Input Password");
			phrase = console.next();
		} while (!phrase.equals("abcd"));
		}

	}


