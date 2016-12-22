class Lab178
{
	public static void main(String[] args)
	{
		int a = 10;
		if(a == 10)
			break;
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab178.java
Lab178.java:7: error: break outside switch or loop
                        break;
                        ^
1 error
*/