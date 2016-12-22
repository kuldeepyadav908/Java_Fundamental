class Lab149
{
	public static void main(String[] args)
	{
		int a = 98;
		int x = 96;
		switch(a)
		{
			case 98:System.out.println("Val - 98");
			case x: System.out.println("Val - 96");
		}
	}
}

/*
Output
======

E:\>cd jlc fundamental lab

E:\JLC Fundamental Lab>javac Lab149.java
Lab149.java:10: error: constant expression required
                        case x: System.out.println("Val - 96");
                             ^
1 error
*/