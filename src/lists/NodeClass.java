//CS 253 PROGRAM ASSIGNMENT #1, part 1
//Single Linked List Node Class
//Sylwia Furdyna
//September 19, 2020

public class NodeClass {
    public class NodeClass{
        private int score;
        private String name;
        private Node next;
        Node();
        {
           score = 0;
           name = "";
           next = null;             
        }
        Node(String n, int s, Node nxt)
        {
            score = s;
            name = n;
            next = nxt;
        }
        public void setScore(int s)
        {
            this.score = s;
        }
        public void setName(String n)
        {
            this.name = n;
        }
        public void setNext(Node nxt)
        {
            this.next = next;
        }
        public int getScore()
        {
            return this.score;
        }
        public String getName()
        {
            return this.name;
        }
        public Node getNext()
        {
            return this.next;
        }
        // step
        public void remove(String name, int score) 
        {
            Node temp = head;
            Node previous = head;
            while (temp != null)
            {
                if (temp.getName().equals(name) && temp.getScore() == score)
                {
                    if (temp == head && temp.getNext() == null)
                    {
                        head = null;
                    }
                    else if (temp == head && temp.getNext() != null)
                    {
                        head = temp.getNext();
                    }
                    else if (temp.getNext() == null)
                }
            }
        }
        // step 
        {
            previous.setNext(null);
        }
        else
        {
            previous.setNext(temp.getNext());
        }
        break;

    }
    // step 6
    public void display(
        {
            int i = 0;
            System.out.println("Top game scores:  ");
            Node temp = head;
            while (temp != null && i++ < 10)
            {
                System.out.println(i + " " + temp.getName() + " " + temp.getScore());
                temp = temp.getNext();
            }
        }
    }
}
