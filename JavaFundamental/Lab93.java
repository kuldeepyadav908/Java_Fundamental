class Lab93
{
	public static void main(String[] args)
	{
		byte b = 10;
		short s = b;
		int a = s;
		long x = a;
		float f = x;
		double d = f;
		System.out.println(b);
		System.out.println(s);
		System.out.println(a);
		System.out.println(x);
		System.out.println(f);
		System.out.println(d);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab93.java

E:\JLC Fundamental Lab>java Lab93
10
10
10
10
10.0
10.0
*/