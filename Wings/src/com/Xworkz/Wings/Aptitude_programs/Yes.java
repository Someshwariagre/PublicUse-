package com.Xworkz.Wings.Aptitude_programs;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Yes {
	    public static void main(String[] args) {
	        String word = "Level";
	        if (isValidWord(word)) {
	            System.out.println("YES");
	        } else {
	            System.out.println("NO");
	        }
	    }

	    private static boolean isValidWord(String word) {
	        if (word == null || word.length() < 2 || word.contains(" ")) {
	            return false;
	        }

	        int half = word.length() / 2;
	        String firstHalf = word.substring(0, half);
	        String secondHalf = word.substring(half + (word.length() % 2));

	        String firstHalfSorted = sortChars(firstHalf);
	        String secondHalfSorted = sortChars(secondHalf);

	        return firstHalfSorted.equals(secondHalfSorted);
	    }

	    private static String sortChars(String str) {
	        return Arrays.stream(str.split(""))
	                .sorted()
	                .collect(Collectors.joining());
	    }
	}


