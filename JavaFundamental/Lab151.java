class Lab151
{
	public static void main(String[] args)
	{
		int a = 10;
		final int x = 20;
		switch(a)
		{
			case 10:
			System.out.println("TEN");
			break;

			case x:
			System.out.println("TWENTY");
			break;

			case 'A':
			System.out.println("CHAR - A");
			break;

			case 10+20+15:
			System.out.println("CONSTANT EXPR");
			break;

			default:
			System.out.println("DEFAULT");
		}
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab151.java

E:\JLC Fundamental Lab>java Lab151
TEN

*/