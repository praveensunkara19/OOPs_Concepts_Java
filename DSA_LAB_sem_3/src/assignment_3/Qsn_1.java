package assignment_3;
//1. Write a Program to implement stack operations using arrays.

import java.util.*;  
class Stack   
{  
    int top;   
    int maxsize = 10;  
    int[] arr = new int[maxsize];  
      
      
    boolean isEmpty()  
    {  
        return (top < 0);  
    }  
    Stack()  
    {  
        top = -1;  
    }  
    boolean push (Scanner sc)  
    {  
        if(top == maxsize-1)  
        {  
            System.out.println("Overflow !!");  
            return false;  
        }  
        else   
        {  
            System.out.println("Enter Value");  
            int val = sc.nextInt();  
            top++;  
            arr[top]=val;  
            System.out.println("Item pushed");  
            return true;  
        }  
    }  
    boolean pop ()  
    {  
        if (top == -1)  
        {  
            System.out.println("Underflow !!");  
            return false;  
        }  
        else   
        {  
            top --;   
            System.out.println("Item popped");  
            return true;  
        }  
    }  
    void display ()  
    {  
        System.out.println("Printing stack elements .....");  
        for(int i = top; i>=0;i--)  
        {  
            System.out.print(arr[i]+" ");  
        }  
    }
    int peek() {
    	if(top==-1)
    		return -1;
    	return(arr[top]);
    	
    }
}  

public class Qsn_1{  
public static void main(String[] args) {  
    int choice=0;  
    Scanner sc = new Scanner(System.in);  
    Stack s = new Stack();  
    System.out.println("***Stack operations using array***\n");  
    while(choice != 6)  
    {  
        System.out.println("\nChose one from the below options...\n");  
        System.out.println("\n1.Push\n2.Pop\n3.peek\n4.isEmpty\n5.display\n6.exit");  
        System.out.println("\n Enter your choice \n");        
        choice = sc.nextInt();  
        switch(choice)  
        {  
            case 1:  
            {   
            	System.out.println("\nenter the value");
                s.push(sc);  
                break;  
            }  
            case 2:  
            {  
            	System.out.println("\npoped element:"+s.pop());
                break;  
            }  
            case 3:  
            {  
            	System.out.println("\ntop element:"+s.peek());  
                break;  
            } 
            case 4:
            {
            	System.out.println("\n is empty:"+ s.isEmpty());
            	break;
            }
            case 5:
            {
            	System.out.println("\n stack elements are:");
            	s.display();
            	break;
            }
            case 6:   
            {  
                System.out.println("Exiting....");  
                System.exit(0);  
                break;   
            }  
            default:  
            {  
                System.out.println("Please Enter valid choice ");  
            }   
        };
    }  
}  
}  
