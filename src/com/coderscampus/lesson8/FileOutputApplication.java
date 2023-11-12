package com.coderscampus.lesson8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputApplication {

	public static void main(String[] args) throws IOException {
		BufferedWriter write = new BufferedWriter(new FileWriter("data.txt"));
		
		
		BufferedReader reader = new BufferedReader(new FileReader("data.txt"));

	}

}
