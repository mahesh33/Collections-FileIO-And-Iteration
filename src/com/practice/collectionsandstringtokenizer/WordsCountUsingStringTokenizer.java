package com.practice.collectionsandstringtokenizer;

import java.io.IOException;
import java.util.StringTokenizer;

public class WordsCountUsingStringTokenizer {

	public static void main(String[] args) throws IOException {

		ReadTextFromAFile rf = new ReadTextFromAFile();

		int count = 0;
		StringTokenizer st = new StringTokenizer(rf.readFile());
		while (st.hasMoreTokens()) {
			count++;
			System.out.println(st.nextToken() + " --> " + count);
		}
		System.out.println("\nThe total number of words in the given file is: --> " + count);
	}

}
