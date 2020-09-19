//CS 253 PROGRAM ASSIGNMENT #1, part 3
//Single Linked List Main Method
//Sylwia Furdyna
//September 19, 2020

import java.util.Scanner;

public class Main 
{
    public static void main(String args[])   
    {
        Scanner in = new Scanner(System.in)'
        System.out.println ("Enter the input string: ");
        String input = in.nextLine();
        ScoreList head = new ScoreList();
        String scores[] = inpute.split("");
        for (String s: scores)
        {
            int start = s.indexOf('(');
            int end = s.indexOf('(');
            s = s.subsring(star+1, end);
        }
        String subScores[] = s.Split(",");
    if(subScores[0].equsals("A"))
    {
        Node score = new Node(subScores[1].trim(),Integer.parseInt(subScores[2].trimp()),null,null);
    }

System.out.println();
head.display();
    }
}
