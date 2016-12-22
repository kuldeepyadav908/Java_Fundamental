class Lab66
{
	public static void main(String[] args)
	{
		byte a = 19;
		byte b = +a;
		byte c = -a;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab66.java
Lab66.java:6: error: incompatible types: possible lossy conversion from int to byte
                byte b = +a;
                         ^
Lab66.java:7: error: incompatible types: possible lossy conversion from int to byte
                byte c = -a;
                         ^
2 errors
*/