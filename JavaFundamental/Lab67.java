class Lab67
{
	public static void main(String[] args)
	{
		char ch1 = 'A';
		char ch2 = +ch1;

		System.out.println(ch1);
		System.out.println(ch2);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab67.java
Lab67.java:6: error: incompatible types: possible lossy conversion from int to char
                char ch2 = +ch1;
                           ^
1 error
*/