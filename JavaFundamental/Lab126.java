class Hello{}

class Lab126
{
	public static void main(String[] args)
	{
		Object obj = new Object();

		System.out.println(obj instanceof String);
		System.out.println(obj instanceof Hello);
		System.out.println(obj instanceof Object);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab126.java

E:\JLC Fundamental Lab>java Lab126
false
false
true
*/