package com.nekomajinj;

public class GameMain {
	//https://github.com/maoxiaoluGIT/NekoMajinJ.git
	public static void main(String[] args) {
		System.out.println("hello world !");
		GameTest test = new GameTest();
		
		test.test();
		
		test.addEventListener(GameTest.TestEvent, test);
		test.test();
		
		test.removeEventListener(GameTest.TestEvent, test);
		test.test();
	}
	

}
