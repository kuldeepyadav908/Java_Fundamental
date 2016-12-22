class Lab5
{
	int a;
	public static void main(String[] args)
	{
		System.out.println(a);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab5.java
Lab5.java:6: error: non-static variable a cannot be referenced from a static context
                System.out.println(a);
                                   ^
1 error
*/