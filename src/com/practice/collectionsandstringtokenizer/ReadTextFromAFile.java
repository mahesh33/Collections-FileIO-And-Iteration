package com.practice.collectionsandstringtokenizer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFromAFile {

	FileReader fr;
	BufferedReader br;

	public ReadTextFromAFile() throws FileNotFoundException {
		br = new BufferedReader(new FileReader("D:\\java IO\\readFromFileForStringTokenizer.txt"));
	}

	public String readFile() throws IOException {
		String currentLine = br.readLine();
		return currentLine;
	}
}
