class Lab116
{
	public static void main(String[] args)
	{
		int a = 10;
		//System.out.println(!a == 10);
		System.out.println(!(a == 10));
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab116.java
Lab116.java:6: error: bad operand type int for unary operator '!'
                System.out.println(!a == 10);
                                   ^
1 error
*/


/*
Output
======

E:\JLC Fundamental Lab>javac Lab116.java

E:\JLC Fundamental Lab>java Lab116
false
*/