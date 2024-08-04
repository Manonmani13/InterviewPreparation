package com.test;

public class TestThrowMEssage {
	public static void main(String[] args) {
		try {
			throw new UserDefinedException("This is user-defined  exception");
		}
		catch(UserDefinedException e)
		{
			System.out.println("Caught Exception");
			System.out.println(e.getMessage());
		}
	}

}
