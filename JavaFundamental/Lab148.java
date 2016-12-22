class Lab148
{
	public static void main(String[] args)
	{
		int a = 98;
		switch(a)
		{
			case 98:
			System.out.println("Val - 98");
			case 98: 
			System.out.println("Val - 98");
		}
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab148.java
Lab148.java:10: error: duplicate case label
                        case 98:
                        ^
1 error
*/