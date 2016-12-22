class Lab223
{
	public static void main(String[] args)
	{
		int arr[][] = {{10,23,21},{12},{23,43,12,32},{98,34,32}};
		for(int ar[]:arr)
		{
			for(int a:ar)
				System.out.print("\t"+a);
			System.out.println();
		}
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab223.java

E:\JLC Fundamental Lab>java Lab223
        10      23      21
        12
        23      43      12      32
        98      34      32
*/