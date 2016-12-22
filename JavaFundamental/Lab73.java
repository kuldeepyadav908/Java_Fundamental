class Lab73
{
	public static void main(String[] args)
	{
		int a = 123;
		byte b = a;

		System.out.println(a);
		System.out.println(b);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab73.java
Lab73.java:6: error: incompatible types: possible lossy conversion from int to byte
                byte b = a;
                         ^
1 error
*/