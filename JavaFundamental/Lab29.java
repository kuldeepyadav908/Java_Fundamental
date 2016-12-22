class Lab29
{
	public static void main(String[] args)
	{
		char ch = '\u';
		System.out.println(ch);
	}
}

/*
Output
======


E:\JLC Fundamental Lab>javac Lab29.java
Lab29.java:5: error: illegal unicode escape
                char ch = '\u';
                             ^
Lab29.java:5: error: empty character literal
                char ch = '\u';
                          ^
Lab29.java:6: error: ';' expected
                System.out.println(ch);
                      ^
3 errors
*/