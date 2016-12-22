class Lab106
{
	public static void main(String[] args)
	{
		byte b = 127;
		b = b + 1;
		System.out.println(b);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab106.java
Lab106.java:6: error: incompatible types: possible lossy conversion from int to byte
                b = b + 1;
                      ^
1 error
*/