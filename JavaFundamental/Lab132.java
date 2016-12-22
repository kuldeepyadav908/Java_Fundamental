class Lab132
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 23;
		int c = 12;
		int max = (a>b)?((a>c)? a:c):((b>c) ? b:c);
		System.out.println(max);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab132.java

E:\JLC Fundamental Lab>java Lab132
23
*/