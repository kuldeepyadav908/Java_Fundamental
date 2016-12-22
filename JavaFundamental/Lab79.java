class Lab79
{
	public static void main(String[] args)
	{
		System.out.println(0 / 0.0);
		System.out.println(0.0 / 0);
		System.out.println(-0.0 / 0.0);
		System.out.println(0.0 / 0.0);

		double d1 = 0/0.0;
		System.out.println(d1);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab79.java

E:\JLC Fundamental Lab>java Lab79
NaN //Not a Number
NaN
NaN
NaN
NaN
*/