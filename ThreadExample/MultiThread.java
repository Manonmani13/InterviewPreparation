package com.practices;

public class MultiThread {
public static void main(String[] args) {
	Thread t=new Thread();
	Runnable r=new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=1;i<=10;i++)
			{
				if(i%2==0)
				System.out.println(i);
			}
			
		}
	};
	r.run();
	Thread t2=new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=1;i<=10;i++)
			{
				if(i%2!=0)
				System.out.println(i);
			}
		}
	});

t2.start();
}

}
