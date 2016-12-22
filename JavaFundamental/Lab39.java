class Lab39
{
	public static void main(String[] args)
	{
		String str1 = null;

		System.out.println(str1);

		int x = str1.length();

		System.out.println(x);
	}
}


/*
Output
======

E:\JLC Fundamental Lab>javac Lab39.java

E:\JLC Fundamental Lab>java Lab39
null
Exception in thread "main" java.lang.NullPointerException
        at Lab39.main(Lab39.java:9)
*/