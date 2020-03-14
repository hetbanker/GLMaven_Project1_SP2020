/*
 * Het Banker
 * hbanke2@uic.edu
 * hbanke2
 * Project 1: Generic Stack and Queue
*/

import java.util.ArrayList; // import the ArrayList class
import java.util.Iterator;	// library for iterator to work

//Creating a generic class called GenericList
public abstract class GenericList<I> implements CreateIterator<I>
{
	private Node<I> head;
	private int length;
	
	//inner class for Node<T>
	public class Node<T>
	{
		T data;			//where our data will be stored
		Node<T> next;	//next field
		
		Node(T data)	
		{
			this.data = data;
			this.next = null;
		}
	}
	
	/***********************************************************/
	
	//getters and setters for head
	public void setHead(Node<I> hd)		//method setHead()
	{
		this.head = hd;
	}
	
	public Node<I> getHead()			//method getHead()
	{
		return this.head;
	}
	
	/***********************************************************/
	
	//getters and setters for length
	public void setLength(int len)	   //method setLength()
	{
		this.length = len;
	}
	
	public int getLength()			    //method getLength()
	{
		return this.length;
	}
	
	/***********************************************************/
	
	//method print()
	public void print()
	{
		Node<I> tempNode = head;
		if (head == null)
		{
			System.out.println("Empty List");	//if the head is null then print the following message
		}
		
		else if (head != null)
		{
			while (tempNode != null)
			{
				System.out.println(tempNode.data);	//print the data
				tempNode = tempNode.next;			//go to the next node in the list
			}
		}
	}
	
	/***********************************************************/
	
	//method add(), to add the values in the list
	public abstract void add(I data);
	
	/***********************************************************/
	
	//method delete()
	public I delete()
	{
		if (head == null) return null; 	//returning null if the head is empty
		else 
		{
			Node<I> tempNode = head;	//create a temp node
			head = head.next;			//go to the next node in the list
			length--;					//decrement the length
			return tempNode.data;		//return the data of that node
		}
	}
	
	/***********************************************************/
	
	//method arrayList
	public ArrayList<I> dumpList()
	{
		ArrayList<I> array = new ArrayList<I>();	//new generic ArrayList
		
		while (head != null)		//go until the vale isnt null
		{
			array.add(head.data);	//copy the list to ArrayList
			length--;				//decrement the length
			head = head.next;	    //go to next node   
		}
		return array;			    //return the array list
	}
	/***********************************************************/
	
	@Override
	public Iterator<I> createIterator() {
		Iterator<I> it = new GLIterator<I>(head);	
		return it;
	}
	/***********************************************************/
	
}
