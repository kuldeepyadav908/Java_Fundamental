class Lab86
{
	public static void main(String[] args)
	{
		int a = 90;
		int b = 9;
		//System.out.println("Result is "+a-b);

		System.out.println("Result is "+(a-b));
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab86.java
Lab86.java:8: error: bad operand types for binary operator '-'
                System.out.println("Result is "+a-b);
                                                 ^
  first type:  String
  second type: int
1 error
*/

/*
Output
======

E:\JLC Fundamental Lab>javac Lab86.java

E:\JLC Fundamental Lab>java Lab86
Result is 81
*/