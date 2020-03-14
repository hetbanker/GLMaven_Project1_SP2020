/*
 * Het Banker
 * hbanke2@uic.edu
 * hbanke2
 * Project 1: Generic Stack and Queue
*/

import java.util.Iterator;		//library for iterator

public class GLIterator<I> implements Iterator<I>
{
	public GenericList<I>.Node<I> walk;	
	
	//constructor
	GLIterator(GenericList<I>.Node<I> hd) 	
	{
		walk = hd;	//gets us to the next node
	}
	

	@Override
	public boolean hasNext() 	//checks to see if there is another values in the stack or queue
	{
		if(walk == null) return false; 
		else return true;
	}

	@Override
	public I next() 			//iteretes through the list
	{
		I data;
		data = walk.data; 
		walk = walk.next;
		return data;
	}

}
