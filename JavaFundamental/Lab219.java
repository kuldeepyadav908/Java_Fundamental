class Lab219
{
	public static void main(String[] args)
	{
		int arr[][] = null;
		arr = new int[3][2];
		arr[0][0] = 10;
		arr[0][1] = 10;
		arr[1][0] = 10;
		arr[1][1] = 10;
		arr[2][0] = 10;
		arr[2][1] = 10;

		System.out.println("Using Normal For loop");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("\nUsing Enhance for loop");
		for(int ar[]:arr)
			for(int a:ar)
				System.out.println("\t"+a);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab219.java

E:\JLC Fundamental Lab>java Lab219
Using Normal For loop
        10      10
        10      10
        10      10

Using Enhance for loop
        10
        10
        10
        10
        10
        10
        */