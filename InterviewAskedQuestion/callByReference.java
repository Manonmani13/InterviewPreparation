package com.test;

public class Box {
	int length;
	int breath;
	int height;
	public Box(int length, int breath, int height) {
		super();
		this.length = length;
		this.breath = breath;
		this.height = height;
	}
	boolean isEqual(Box b)
	{
		b.length++;
		if(length==b.length&& breath==b.breath && height==b.height)
			return true;
		return false;
	}
	public static void main(String[] args) {
		Box b=new Box(5,4,3);
		Box b2=new Box(5,4,3);

		System.out.println(b.isEqual(b2));
		System.out.println(b2.length);
		
	}

}
