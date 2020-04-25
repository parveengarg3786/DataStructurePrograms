package com.java.Voting;

import java.io.IOException;

public class DriverProgram {
	public static void main(String[] args) throws IOException {
		Function fn = new Function();
		String array[] = fn.vote();
		fn.countVoting(array);
	}
}
