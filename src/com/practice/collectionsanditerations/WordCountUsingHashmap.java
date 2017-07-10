package com.practice.collectionsanditerations;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCountUsingHashmap {

	public static void main(String[] args) throws IOException {

		ReadTextFromFile rt = new ReadTextFromFile();
		Map<String, Integer> wordCount = new HashMap<>();
		String c = rt.readFile();

		while (c != null) {

			String[] words = c.toLowerCase().split("\\W");

			for (String wr : words) {
				// System.out.println(wr);
				// System.out.println(wordCount.get(wr)); -> gives the ocurrance
				// of one word
				if (wordCount.containsKey(wr)) {
					wordCount.put(wr, wordCount.get(wr) + 1);
				} else {
					wordCount.put(wr, 1);
				}
			}
			c = rt.readFile();
		}

		System.out.println("------- ------- \n" + "Words:" + "\tCount:\n" + "------- ------- ");
		for (Map.Entry entry : wordCount.entrySet()) {
			System.out.println(entry.getKey() + "--> " + entry.getValue());
		}
	}

}
