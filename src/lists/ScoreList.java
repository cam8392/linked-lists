//CS 253 PROGRAM ASSIGNMENT #1, part 2
//Single Linked List - List of Scores class
//Sylwia Furdyna
//September 19, 2020

public class ScoreList
{
    Node head;
    ScoreList()
    {
        head = null;
    }
    public void add (Node newScore)
    {
        if (head == null)
        {
            head = newScore;
            newScore.setNext(null);
        }
        else
        {
            Node temp = head;
            Node previous = head;
            while(temp.getNext() != null && temp.getScore() >= newScore.getScore())
            {
                previous = temp;
                temp = temp.getNext();
            }
            if (temp.getNext() == null)
            {
                if (temp.getScore() < newScore.getScore())
                {
                    if (temp == head)
                    {
                        newScore.setNext(temp);
                        head = newScore;
                    }
                    else
                    {
                        previous.setNext(newScore);
                    }
                }
                else if (temp.getScore())
                {
                    if(temp == head)
                    {
                        newScore.setNext(temp);
                        head = newScore;
                    }
                    else
                    {
                        newScore.setNext(temp);
                        previous.setNext(newScore);
                    }
                }
            }
        }
    }
}

