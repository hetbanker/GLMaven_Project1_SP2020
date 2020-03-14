/*
 * Het Banker
 * hbanke2@uic.edu
 * hbanke2
 * Project 1: Generic Stack and Queue
*/

public class GenericStack<I> extends GenericList<I> 
{
	/***********************************************************/
	//constructor
	public GenericStack(I data) 
	{
		setHead(new Node<I>(data));		//Create new node. Set data field to data passed in
		setLength(1);					//Useing setLength to change the length of the queue to a 1
	}

	/***********************************************************/
	@Override
	public void add(I data) 			//add method
	{
		Node<I> newNode = new Node<I>(data);	//new Node
		
		if (getHead() == null) 		//if the head is null then set the head to new node
		{
			setHead(newNode);
			return;
		}
		newNode.next = getHead();	
		setHead(newNode) ;
		setLength(getLength()+1);	//increment the length
	}
	
	/***********************************************************/
	void push(I data)	//method to push the data in the stack
	{
		add(data);			//calling the add method
	}
	
	/***********************************************************/
	public I pop()	//method to pop the elements from the stack
	{
		return delete();	//calling the delete method
	}	

	/***********************************************************/
}
