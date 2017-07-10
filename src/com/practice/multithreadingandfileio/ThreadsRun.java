package com.practice.multithreadingandfileio;

import java.io.IOException;

public class ThreadsRun {
	public static void main(String[] args) {

		CountAndCalculateWords ccw = new CountAndCalculateWords();

		Thread thread1 = new Thread() {
			public void run() {
				try {
					ccw.countWord();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		thread1.start();

		Thread thread2 = new Thread() {
			public void run() {

				try {
					ccw.calculateNumberOfWords();

				} catch (IOException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		thread2.start();

	}
}
