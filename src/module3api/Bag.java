/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module3api;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Aust1_000
 */
public class Bag  {

private int N; // number of elements in bag
private Node first; // beginning of bag

public Bag()
{
    first = new Node(null);
    N=0;
}

public void add(item i)
{
    Node temp = new Node(i);
    Node current = first;
    while(current.getNext() != null)
    {
        current = current.getNext();
    }
 current.setNext(temp);
 N++;
 
}
 

public item get(int index)
    // returns the element at the specified position in this list.
    {
        // index must be 1 or higher
        if (index <= 0)
            return null;
 
        Node current = first.getNext();
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null)
                return null;
 
            current = current.getNext();
        }
        return current.getData();
    }

public int size()
{
     return N;
}

public boolean isEmpty()
{
    if(first == null || N == 0)
    {
        return true;
    }
    return false;
}

// linked list class
private class Node {

private item item;
private Node next;

public Node(item i)
{
    next=null;
    item = i;
}

public Node(item i, Node nextNode)
{
    next=nextNode;
    item = i;
}

public item getData()
{
    return item;
}

public void setData(item i)
{
    item = i;
    
}

public Node getNext()
{
    return next;
}

public void setNext(Node nextNode)
{
    next = nextNode;
}


}

public void print(Bag b)
{
    for(int i = b.N; i > 0; i--)
    {
    //System.out.println(i);
    System.out.println(b.get(i).letter);
    }
}


}