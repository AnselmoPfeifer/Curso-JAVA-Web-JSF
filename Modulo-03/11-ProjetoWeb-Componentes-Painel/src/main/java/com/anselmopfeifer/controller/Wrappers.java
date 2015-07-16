package com.anselmopfeifer.controller;

public class Wrappers {
	public static void main(String[] args) {
		Integer i = 0;

		Double x = i.doubleValue();
		
		System.out.println(x);
		
		System.out.println(x.equals(0));
		
	}

}
