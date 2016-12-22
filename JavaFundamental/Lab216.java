class Lab216
{
	public static void main(String[] args)
	{
		System.out.println("Len: "+args.length);
		System.out.println();
		for(int i=0;i<args.length;i++)
			System.out.println(i+"\t"+args[i]);
	}
}


/*
Output
======

E:\JLC Fundamental Lab>javac Lab216.java

E:\JLC Fundamental Lab>java Lab216
Len: 0

E:\JLC Fundamental Lab>java Lab216 0
Len: 1

0       0

E:\JLC Fundamental Lab>java Lab216 123
Len: 1

0       123

E:\JLC Fundamental Lab>
E:\JLC Fundamental Lab>java Lab216 123 A true 12.32 sri
Len: 5

0       123
1       A
2       true
3       12.32
4       sri

E:\JLC Fundamental Lab>java Lab216 Java Learning center Sri
Len: 5

0       Java
1       Learning
2       center
3       Sri
4       Nivas

E:\JLC Fundamental Lab>java Lab216 "Java Learning center" "
Len: 2

0       Java Learning center
1       Sri Nivas

E:\JLC Fundamental Lab>java Lab216 *.java
Len: 13

0       Lab1.java
1       Lab10.java
2       Lab100.java
3       Lab101.java
4       Lab102.java
5       Lab103.java
6       Lab104.java
7       Lab105.java
8       Lab106.java
9       Lab107.java
10      Lab108.java
11      Lab109.java
12      Lab11.java

E:\JLC Fundamental Lab>java Lab216 "*.java"
Len: 1

0       *.java
*/