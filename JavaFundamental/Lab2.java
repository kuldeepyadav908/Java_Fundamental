class Hello2
{
	char ch;
	void show()
	{
		System.out.println(ch == 0);
		System.out.println(ch == '');
		System.out.println(ch == '\u0000');
	}
}

class Lab2
{
	public static void main(String[] args)
	{
		Hello2 h = new Hello2();
		h.show();
	}
}



/*
Output
======

E:\JLC Fundamental Lab>javac lab2.java
lab2.java:7: error: empty character literal
                System.out.println(ch == '');
                                         ^
lab2.java:7: error: unclosed character literal
                System.out.println(ch == '');
                                          ^
2 errors
*/