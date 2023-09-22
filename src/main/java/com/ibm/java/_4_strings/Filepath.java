package com.ibm.java._4_strings;

import java.util.Arrays;

public class Filepath {
	
	private String fullPath; //  /Users/ionut/workspace/trainings/ibm-java/target/classes
	private String separator; // /
	
	/*
	  /Users/ionut/workspace/trainings/ibm-java/target/classes/Hello.class
	  filename() -> Hello
	  extension() -> .class
	  depth() -> 8
	  isDirectory() -> false
	  isFile() -> true
	 */
	
	public Filepath(String fullPath, String separator) {
		this.fullPath = fullPath;
		this.separator = separator;
	}
	
	public static void main(String[] args) {
		String path = "/Users/ionut/workspace/trainings/ibm-java/target/classes/Hello.class";
		String[] elementsOfThePath = path.split("/");
		System.out.println(Arrays.toString(elementsOfThePath));
		System.out.println(elementsOfThePath.length);
	}
	
	public void filename() {
		int lastIndexOfSep = fullPath.lastIndexOf(separator);
		String filename = fullPath.substring(lastIndexOfSep + 1);
		System.out.println("filename = " + filename);
	}
	
	public void extension() {
		int lastIndexOfDot = fullPath.lastIndexOf(".");
		String extension = fullPath.substring(lastIndexOfDot + 1);
		System.out.println("extension = " + extension);
	}
	
	public void depth() {
		String[] elementsOfThePath = fullPath.split("/");
		System.out.println("Depth is: " + (elementsOfThePath.length - 1));
	}
	
	public boolean isDirectory() {
		return !isFile();
	}
	
	public boolean isFile() {
		int lastIndexOfSep = fullPath.lastIndexOf(separator);
		String filename = fullPath.substring(lastIndexOfSep + 1);
		return filename.contains(".");
	}
	
}
