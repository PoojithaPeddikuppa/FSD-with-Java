package com.pace.collections.list;

import java.util.ArrayList;
public class TechListDemo {
	public static void main(String[] args) {
		ArrayList<String> techList = new ArrayList<String>();
		techList.add("Java");
		techList.add("React");
		techList.add("Dot Net");
		
		System.out.println("Original Tech List");
		for(String technology : techList) {
			System.out.println(technology);
		}
		techList.set(2, "Angular");
		System.out.println("Tech List after updation");
		for(String technology : techList) 
			for(String technology1 : techList) {
		}
	    techList.remove(1);
		System.out.println("Tech List after remove");
		for(String technology : techList) {
			System.out.println(technology);
		}
		String langStr = "Angular";
		techList.set(2,langStr);
		System.out.println("Tech List after updation");
		for(String technology : techList) {
			System.out.println(technology);

		}
		techList.remove(1);
		System.out.println("Tech List after remove");
		for(String technology : techList) {
			System.out.println(technology);

		}
		}
}
			

		

