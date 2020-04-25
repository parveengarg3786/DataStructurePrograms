package com.java.stack;

public class StackProgram {
	public static void main(String[] args) {
		StackfromQueueFunction st = new StackfromQueueFunction();
		
		st.push(1);;
		st.push(2);
		st.push(3);
		st.display();
		st.pop();
		st.pop();
		st.push(3);
		st.pop();
	}
}
