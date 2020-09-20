
package lists;

public class NodeClass
{
    private int value;
    private NodeClass next; // 0x413269746123

    public NodeClass()
    {}

    public NodeClass(int value)
    {
        this.value = value;
    }

    public void setNextNode(NodeClass newNode)
    {
        this.next = newNode;
    }

    public NodeClass getNextNode()
    {
        return next;
    }

    public void setNodeValue(int value)
    {
        this.value = value;
    }

    public int getNodeValue()
    {
        return value;
    }

    @Override
    public String toString()
    {
        return "NodeClass {\n" +
                "Value: " + this.value + "\n" +
                "Next: " + this.next + "\n" +
                "}";
    }
}

// NodeClass newNode = new NodeClass();
// NodeClass newNode = new NodeClass(3);

/*
    NodeClass {
        Value: <value>
        Next: NodeClass || Null
    }
*/