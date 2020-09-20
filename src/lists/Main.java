
package lists;

public class Main 
{
    public static void main(String args[])   
    {
        // Create a new linked list
        ScoreList highScores = new ScoreList();

        highScores.appendNode(32);
        highScores.appendNode(54);
        highScores.appendNode(88);
        highScores.appendNode(200);
        highScores.appendNode(78800);
        highScores.appendNode(87);
        highScores.print();
    }
}
