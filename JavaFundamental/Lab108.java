class Lab108
{
	public static void main(String[] args)
	{
		System.out.println('A' == 65);
		byte b = 65;
		System.out.println('A' == b);
		System.out.println(65 == b);
		System.out.println('A' == 65L);
		System.out.println('A' == 65.0);
		System.out.println('A' == 65.0f);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab108.java

E:\JLC Fundamental Lab>java Lab108
true
true
true
true
true
true
*/