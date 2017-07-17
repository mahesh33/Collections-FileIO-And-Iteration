package com.practice.collectionsanditerations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFromFile {
	FileReader fr;
	BufferedReader bReader;

	ReadTextFromFile() throws FileNotFoundException {
		bReader = new BufferedReader(new FileReader("D:\\java IO\\readFileForHashMap.txt"));
	}

	public String readFile() throws IOException {
		String currentLine1 = bReader.readLine();
		return currentLine1;
	}
}
