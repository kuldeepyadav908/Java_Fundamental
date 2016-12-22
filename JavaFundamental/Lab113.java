class Lab113
{
	public static void main(String[] args)
	{
		int a = 10;
		//System.out.println("Result is: "+a == a);
		System.out.println("Result is: "+(a == a));
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab113.java
Lab113.java:6: error: incomparable types: String and int
                System.out.println("Result is: "+a == a);
                                                   ^
1 error
*/

/*
Output
======

E:\JLC Fundamental Lab>javac Lab113.java

E:\JLC Fundamental Lab>java Lab113
Result is: true
*/