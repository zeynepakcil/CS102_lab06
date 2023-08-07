package Part2;

import java.util.LinkedList;
import java.util.Scanner;

public class ToDoListConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList<String>();

        int option = 0; 
        String word = "";
        int index, currentIndex, nextIndex = 0;

        String message = "------------------------------ Menu ------------------------------\n";
        message += "1. Add string items to the list\n";
        message += "2. Remove selected item\n";
        message += "3. Move selected item in a different position\n";
        message += "4. Display the list\n";
        message += "Choose an option: (0 to quit)";

        do{
            System.out.println(message);
            option = scanner.nextInt();

            if(option == 1){
                do{
                    System.out.println("Enter the word you want to add (type quit to quit): ");
                    word = scanner.next();
                    if(!word.equals("quit")) linkedList.add(word);
                }
                while(!word.equals("quit"));
            }
            else if(option == 2){
                System.out.println("Enter the index you want to remove: ");
                index = scanner.nextInt();
                if(index < linkedList.size())
                    linkedList.remove(index);                
            }
            else if(option == 3){
                System.out.println("Enter the word you want to relocate: ");
                word = scanner.next();

                currentIndex = linkedList.indexOf(word);
                System.out.println("Enter index you want to put: ");
                nextIndex = scanner.nextInt();
                if(nextIndex < linkedList.size()){
                    linkedList.remove(currentIndex);
                    linkedList.add(nextIndex, word);     
                }    
                else
                    System.out.println("Invalid index is inputted.");          
            }
            else if(option == 4) System.out.println(linkedList);
            else{
                System.out.println("Invalid choice is selected.");
            }
        }
        while(option != 0);
    }
}
