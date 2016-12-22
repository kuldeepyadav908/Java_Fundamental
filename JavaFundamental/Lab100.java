class Lab100
{
	public static void main(String[] args)
	{
		byte b = 90;
		System.out.println(b);
		b = b + 9;
		System.out.println(b);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab100.java
Lab100.java:7: error: incompatible types: possible lossy conversion from int to byte
                b = b + 9;
                      ^
1 error
*/