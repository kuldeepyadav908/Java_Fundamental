class Lab34
{
	public static void main(String[] args)
	{
		char ch1 = -1;
		char ch2 = 65536;

		System.out.println(ch1);
		System.out.println(ch2);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab34.java
Lab34.java:5: error: incompatible types: possible lossy conversion from int to char
                char ch1 = -1;
                           ^
Lab34.java:6: error: incompatible types: possible lossy conversion from int to char
                char ch2 = 65536;
                           ^
2 errors
*/