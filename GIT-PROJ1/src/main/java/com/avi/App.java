package com.avi;




public class App {
	public int sum(int x,int y) {
		return(x+y);
	}
    public static void main(String[] args) {
        App app = new App();
    	System.out.println("sum::"+app.sum(10, 20));
    }
}
