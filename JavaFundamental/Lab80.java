class Lab80
{
	public static void main(String[] args)
	{
		System.out.println(12 / 0);
		System.out.println(0 / 0);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab80.java

E:\JLC Fundamental Lab>java Lab80 Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Lab80.main(Lab80.java:5)
*/