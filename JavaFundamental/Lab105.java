class Lab105
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		int x = 10;
		int y = ++x;
		System.out.println(x);
		System.out.println(y);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab105.java

E:\JLC Fundamental Lab>java Lab105
11
10

11
11
*/