package com.practice.multithreadingandfileio;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CountAndCalculateWords {
	private boolean flag = false;

	synchronized public void countWord() throws IOException {
		System.out.println("Going to count the words....");
		System.out.println("* Wait * for calculation of total numbers of words to be completed....\n");
		try {
			if (flag == false) {
				flag = true;
				wait();

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n** After waiting.... **\n");

		ReadTextFromANewFile rt = new ReadTextFromANewFile();

		Map<String, Integer> wordCount = new HashMap<>();
		String c = rt.readFile();

		while (c != null) {

			String[] words = c.toLowerCase().split("\\W");

			for (String wr : words) {

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
		System.out.println("\nCounting of words is completed....");
	}

	synchronized public void calculateNumberOfWords() throws IOException, InterruptedException {

		System.out.println("Going to calculate the total number of words....");

		ReadTextFromANewFile rt = new ReadTextFromANewFile();

		int count = 0;
		String s = rt.readFile();
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			st.nextToken();
			count++;
		}
		System.out.println("\nThe total number of words in the given file is: --> " + count);
		System.out.println("Calculation of total number of words is completed....\n");
		flag = false;
		notify();

	}

}
