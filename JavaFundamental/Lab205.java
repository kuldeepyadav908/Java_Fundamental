class Lab205
{
	public static void main(String[] args)
	{
		byte brr[] = new byte[3];
		int arr[] = brr;
		System.out.println("Hello Guys");
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab205.java
Lab205.java:6: error: incompatible types: byte[] cannot be converted to int[]
                int arr[] = brr;
                            ^
1 error
*/