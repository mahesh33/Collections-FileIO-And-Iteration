package com.practice.multithreadingandfileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFromANewFile {

	FileReader fr;
	BufferedReader bReader;

	ReadTextFromANewFile() throws FileNotFoundException {
		bReader = new BufferedReader(new FileReader("D:\\java IO\\readForThreads.txt"));
	}

	public String readFile() throws IOException {
		String currentLine = bReader.readLine();
		return currentLine;
	}
}
