class Lab71
{
	public static void main(String[] args)
	{
		byte b1 = 12;
		byte b2 = 23;
		byte b3 = b1 + b2;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab71.java
Lab71.java:7: error: incompatible types: possible lossy conversion from int to byte
                byte b3 = b1 + b2;
                             ^
1 error
*/