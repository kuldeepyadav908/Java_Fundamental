class Lab38
{
	public static void main(String[] args)
	{
		char ch1 = 101;
		char ch2 = '\420';

		System.out.println(ch1);
		System.out.println(ch2);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab38.java
Lab38.java:6: error: unclosed character literal
                char ch2 = '\420';
                           ^
Lab38.java:6: error: unclosed character literal
                char ch2 = '\420';
                                ^
Lab38.java:6: error: not a statement
                char ch2 = '\420';
                               ^
3 errors
*/