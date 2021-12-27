package com.dbs.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class SDN {
	
	public static ArrayList<String[]> processSDNData(){
		BufferedReader br;
		String temp,k;
		ArrayList<String[]> l = new ArrayList<>();
		try {
			FileReader fr = new FileReader("C:\\Users\\Administrator\\Downloads\\sdnlist.txt");
			br = new BufferedReader(fr);
			while((k=br.readLine())!=null) {
				k=k.replace("\"", "");
				k=k.replace("(", "");
				k=k.replace("a.k.a.", ";");
				k=k.replace(")", ";");
				l.add(k.split(",")[0].split(";"));
			}
		}
		catch(IOException e) {
			System.out.println("Error in reading SDN file");
		}
		return l;
	}
	
	public boolean checkSDN(String name) {
		boolean result = false;
		ArrayList<String[]> sdn = processSDNData();
		for(String[] element: sdn) {
			for(String names : element) {
				if(name.equalsIgnoreCase(names.trim())){
					result = true;
					return result;
				}
			}
		}
		return result;
	}
}
