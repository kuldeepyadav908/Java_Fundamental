class Hello{}

class Lab124
{
	public static void main(String[] args)
	{
		Hello h1 = new Hello();

		System.out.println(h1 instanceof Hello);
		System.out.println(h1 instanceof Object);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab124.java

E:\JLC Fundamental Lab>java Lab124
true
true
*/