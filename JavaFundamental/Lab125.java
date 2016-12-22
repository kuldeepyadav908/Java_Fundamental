class Hello{}

class Lab125
{
	public static void main(String[] args)
	{
		Hello h1 = new Hello();

		System.out.println(h1 instanceof String);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab125.java
Lab125.java:9: error: incompatible types: Hello cannot be converted to String
                System.out.println(h1 instanceof String);
                                   ^
1 error
*/