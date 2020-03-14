/*
 * Het Banker
 * hbanke2@uic.edu
 * hbanke2
 * Project 1: Generic Stack and Queue
*/

import java.util.Iterator;


public class GLProject {

	public static void main(String[ ] args) 
	{
		GenericQueue<Integer> queuee = new GenericQueue<Integer>(2);
		GenericStack<Integer> stackk = new GenericStack<Integer>(3);
		
		System.out.println("********GenericQueue******");
		
		System.out.println("After Enqueue");
		queuee.enqueue(5);
		queuee.enqueue(6);
		queuee.enqueue(7);
		queuee.enqueue(2);
		queuee.enqueue(1);
		queuee.print( );
		System.out.print( "\n" );
		System.out.println("After Dequeue");
	
		System.out.println("First Dequeue "+ queuee.dequeue());
		System.out.println("Second Dequeue "+ queuee.dequeue());
		System.out.println("Third Dequeue "+ queuee.dequeue());
		System.out.println("Fourth Dequeue "+ queuee.dequeue());
		
		System.out.print( "\n" );
		
		queuee.enqueue(10);
		queuee.enqueue(11);
		queuee.dequeue( );
		
		queuee.print( );
		queuee.dequeue( );
		queuee.dequeue( );
		//queuee.dequeue( );
		System.out.print( "\n" );
		System.out.println("Length of original list = " + queuee.getLength());
		System.out.println("After calling dumpList() ");

		System.out.println("Dump List: " + queuee.dumpList());
		System.out.println("Length of original list = " + queuee.getLength());
		
		queuee.print();
		System.out.print( "\n" );
		System.out.print( "\n" );
		
		System.out.println("*******GenericStack*******");
		
		System.out.println("After Push");
		stackk.push(5);
		stackk.push(6);
		stackk.push(7);
		stackk.push(2);
		stackk.push(1);
		stackk.print( );
		System.out.println("Length of original list = " + stackk.getLength());
		
		System.out.print( "\n" );
		System.out.println("After Pop");
	
		stackk.pop( );
		stackk.pop( );
		stackk.pop( );
		
		stackk.print( );
		
		
		System.out.println("Length of original list = " + stackk.getLength());
		
		System.out.print( "\n" );
		
		System.out.print("Checking the iterator:    ");
		
		Iterator<Integer> itStack = stackk.createIterator();
		
		while(itStack.hasNext())
		{
			System.out.print(itStack.hasNext() + "  "); //returns true or false
			System.out.print(itStack.next() + "  ");	//print the stack
		}
		
		System.out.println( "\n" );
		System.out.println("Length of original list = " + stackk.getLength());
		System.out.println("After calling dumpList");
		
		System.out.println("Dump List: " + stackk.dumpList());
		System.out.println("Length of original list = " + stackk.getLength());
		
		stackk.print( );
		
	}

}