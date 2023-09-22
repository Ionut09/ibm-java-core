package com.ibm.java._4_strings;

public class Filesystem {
	
	public static void main(String[] args) {
		String fullPath = "/Users/ionut/workspace/trainings/ibm-java/target/classes/Hello.class";
		
		Filepath filepath = new Filepath(fullPath, "/");
		filepath.filename();
		filepath.extension();
		filepath.depth();
		
		System.out.println(filepath.isFile());
		System.out.println(filepath.isDirectory());
	}
}
