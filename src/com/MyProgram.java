package com;

public class MyProgram {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		myCar1.a = 100;
		DataCollection ans = myCar1.calAdd(0,1);
		
		System.out.println(ans.x);
		System.out.println(ans.y);

	}

}
