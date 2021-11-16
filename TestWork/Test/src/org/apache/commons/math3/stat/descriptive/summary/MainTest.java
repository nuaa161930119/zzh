package org.apache.commons.math3.stat.descriptive.summary;

public class MainTest {

	public static void main(String [] args)
	{
		Sum1 s=new Sum1();
		s.increment(1);
		System.out.println(s.getN());
		
		Sum1 a=new Sum1();
		a.increment(2);
		System.out.println(a.getResult());
		
		Sum1 b=new Sum1();
		b.increment(5);
		System.out.println(b.getN());
		System.out.println(b.getResult());
		
	}
}
