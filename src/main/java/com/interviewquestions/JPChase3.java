package com.interviewquestions;

public class JPChase3 {
	public class Instrument{
		String s;
		String ex;
		public Instrument() {
			
		}//If we comment this we will get compilation error
		public Instrument(String s,String ex) {
			this.s=s;
			this.ex=ex;
		}
	}
	public class Future extends Instrument{
		String s;
		String ex;
		int size;
		//public Future(String s,String ex,int size) {
		public Future(String s,String ex) {
			this.s=s;
			this.ex=ex;
		}
	}
	public static void main(String[] args) {
		
	}
}
