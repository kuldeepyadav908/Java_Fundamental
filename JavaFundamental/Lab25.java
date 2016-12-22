class Lab25
{
	public static void main(String[] args)
	{
		char ch1 = '\+';
		char ch2 = '\p';
		char ch3 = '\a';

		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
	}
}


/*
Output
======


E:\JLC Fundamental Lab>javac Lab25.java
Lab25.java:5: error: illegal escape character
                char ch1 = '\+';
                             ^
Lab25.java:5: error: unclosed character literal
                char ch1 = '\+';
                           ^
Lab25.java:5: error: unclosed character literal
                char ch1 = '\+';
                              ^
Lab25.java:6: error: illegal escape character
                char ch2 = '\p';
                             ^
Lab25.java:6: error: unclosed character literal
                char ch2 = '\p';
                           ^
Lab25.java:6: error: unclosed character literal
                char ch2 = '\p';
                              ^
Lab25.java:7: error: illegal escape character
                char ch3 = '\a';
                             ^
Lab25.java:7: error: unclosed character literal
                char ch3 = '\a';
                           ^
Lab25.java:7: error: unclosed character literal
                char ch3 = '\a';
                              ^
9 errors
*/