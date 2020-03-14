/*
 * Het Banker
 * hbanke2@uic.edu
 * hbanke2
 * Project 1: Generic Stack and Queue
*/

public class GenericQueue<I> extends GenericList<I> 
{
	/***********************************************************/
	//constructor
	public GenericQueue(I data) 
	{
		setHead(new Node<I>(data));		//Create new node. Set data field to data passed in
		setLength(1);					//Useing setLength to change the length of the queue to a 1
	}

	/***********************************************************/
	@Override
	public void add(I data) 	//add method
	{
		Node<I> tempNode  = getHead();			//point the tempNode to the head
		Node<I> newNode = new Node<I>(data);	//creating a new node
		
		if (getHead() == null)
		{
			tempNode = newNode;
		}
		
		else if (getHead() != null)
		{
			while (tempNode.next != null) //go till the next value isnt null
			{
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
		}
		setLength(getLength()+1);	//increment the length
	}

	/***********************************************************/
	public void enqueue(I data)		//inserting the data with this method
	{
		add(data);	//calling the add method
	}
	
	/***********************************************************/
	public I dequeue()				//deleting the data with this method
	{
		return delete();	//calling the deque method
		
	}
}
