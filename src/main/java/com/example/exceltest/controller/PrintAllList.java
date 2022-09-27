package com.example.exceltest.controller;

import org.junit.Test;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PrintAllList {
	
	public void PrintAll(List list, String prefix, Integer length) {
		if(prefix.length() == length) {
			System.out.println(prefix);
		}
		for(int i=0; i<list.size(); i++) {
			List temp = new LinkedList<Integer>(list);
//			Object remove = temp.remove(i);
			PrintAll(temp, prefix+temp.remove(i), length);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3));
		PrintAllList all = new PrintAllList();
		all.PrintAll(list, "", list.size());
	}

	@Test
	public void test() {
		/*String str = "2-3-4";
		System.out.println("str.split(\"-\").length = " + str.split("-").length);
		System.out.println("str.length() = " + str.length());*/
		String str1 = "__WITHOUT_MULTI_PLUGINCODE__.wxapkg";
		String str2 = "__WITHOUT_MULTI_PLUGINCODE__.wxapkg";

	}
}
