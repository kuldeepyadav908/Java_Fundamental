class Hello{}

class Lab127
{
	public static void main(String[] args)
	{
		Hello h1 = null;
		String str = null;

		System.out.println(str instanceof String);
		System.out.println(h1 instanceof Hello);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab127.java

E:\JLC Fundamental Lab>java Lab127
false
false
*/