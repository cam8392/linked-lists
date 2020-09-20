package lists;

import java.util.ArrayList;
import java.util.List;


public class ScoreList
{
    private NodeClass head;
    private final int limit = 10;
    private int length = 0;

    public ScoreList(){}

    public ScoreList(NodeClass headNode)
    {
        this.length = length+1;
        head = headNode;
    }

    // Add a new to the list
    public void appendNode(int nodeValue)
    {
        if(length < limit)
        {
            // Create A new node
            NodeClass newNode = new NodeClass(nodeValue);

            if (this.head == null)
            {
                this.head = newNode;
                this.length = length+1;
            
            } else {
                // Traverse the list
                NodeClass currNode = this.head;
                while(currNode.getNextNode() != null)
                {   
                    currNode = currNode.getNextNode();
                }
    
                // Add in a new node
                currNode.setNextNode(newNode);
                this.length = length+1;
            }

            // this.length = length++;
        }

    }

    // Print the linked list
    public void print()
    {
        List<Integer> scores = new ArrayList<>();
        NodeClass currNode = this.head;
        while(true)
        {

            scores.add(currNode.getNodeValue());
            currNode = currNode.getNextNode();
            if(currNode.getNextNode() == null)
            {
                scores.add(currNode.getNodeValue());
                break;
            }
            
        }

        if(scores.size() > 1)
        {
            scores.sort((v1, v2) -> v2.compareTo(v1));
            for(int score: scores)
            {
                System.out.println(score);
            }
        } 
    }

    public NodeClass deleteNode(int value)
    {
        if(this.head != null)
        {
            NodeClass currNode = this.head; //0X345127834

            // If the head node has the matching value
            if(currNode.getNodeValue() == value)
            {
                // see if list only has 1 item    
                if(currNode.getNextNode() == null)
                {
                    this.head = null;
                } else { // if not, set the second item in the list to be the head
                    this.head = currNode.getNextNode();
                }

                // Decrement the length
                this.length = length - 1;

                // return the node we "delte" from the list
                return currNode;

            } else {
                // If no match found traverse the list
                NodeClass prevNode = this.head; // first node ref
                currNode = currNode.getNextNode(); // 2nd node ref

                while(true)
                {
                    if(currNode.getNodeValue() == value)
                    {
                        // point prevNode to the next node relative to the current node
                        prevNode.setNextNode(currNode.getNextNode());

                        // Decrement Length
                        this.length = length - 1;

                        // return node we removed from the list
                        return currNode;
                    } else
                    {
                        prevNode = currNode;
                        currNode = currNode.getNextNode();
                        if (currNode == null)
                        {
                            break;
                        }
                    }
                }
            }
            
        } 
        return null;
    }

    public int length()
    {
        return this.length;
    }
}