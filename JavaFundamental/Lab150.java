class Lab150
{
	public static void main(String[] args)
	{
		byte b = 20;
		switch(b)
		{
			case 10:
			System.out.println("TEN");

			case 128:
			System.out.println("TWENTY");
		}
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab150.java
Lab150.java:11: error: incompatible types: possible lossy conversion from int to byte
                        case 128:
                             ^
1 error
*/