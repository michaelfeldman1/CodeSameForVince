package edu.ycp.cs201.palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckPalindrome {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		System.out.println("Enter a word to see if it is a palindrome:");
		
		
		// This loop reads all of the lines of input from System.in
		while (true) {
			// Read a line
			String line = reader.readLine();
			
			// Time to quit?
			if (line.toLowerCase().equals("quit")) {
				break;
			}
			
			// TODO: Check to see if line is a palindrome
			// and print "Palindrome" or "Not a palindrome"
			// to System.out.  Use a stack.
			
			// Hints:
			//  - Ignore characters that aren't letters:
			//    use the Character.isLetter(char) method to
			//    determine which characters are letters
			//  - The Character.toLowerCase(char) method converts
			//    a letter to lower case
			
			// Create stack and queue
			Stack<Character> stack = new Stack<Character>();
			Queue<Character> queue = new LinkedList<Character>();
			
			int count = 0;
			
			for (int i = 0; i < line.length(); i++) 
			{
			    char c = line.charAt(i);

			    // Do something with c
			    if (Character.isLetter(c))
			    {
			        // c is a letter
			    	c = Character.toLowerCase(c);
			    	
			    	
			    	// Filling the stack and queue with our valid letter
			    	stack.push(c);
			    	queue.add(c);
			    	count = count + 1;
			    	
			    }
			    
			    else
			    {
			    	
			    }
			}
			
			
			// This checks to see if an element from the stack and an element from the queue are the same
			// and adding 1 to the tracking if it is.
			int tracker = 0;
			
			for (int i = 0; i < count; i++)
			{
				if (stack.pop() == queue.remove())
				{
					tracker = tracker + 1;
				}
				
				else
				{
					
				}
			}
			
			
			System.out.println("");
			
			// This checks to see if all of the elements compared from the stack and queue are the same or not
			if (tracker == count)
			{
				System.out.println(line + " is a palindrome");
			}
			
			else
			{
				System.out.println(line + " is not a palindrome");
			}
			
			System.out.println("Enter a word to see if it is a palindrome:");

			
		}
	}
}