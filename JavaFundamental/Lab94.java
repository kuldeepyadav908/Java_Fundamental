class Lab94
{
	public static void main(String[] args)
	{
		int a = 65;
		char ch = (char)a;
		byte b = (byte)a;
		System.out.println(a);
		System.out.println(ch);
		System.out.println(b);

		float f = 1234.567F;
		int c = (int)f;
		System.out.println(f);
		System.out.println(c);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab94.java

E:\JLC Fundamental Lab>java Lab94
65
A
65
1234.567
1234
*/