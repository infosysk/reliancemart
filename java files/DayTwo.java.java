package w1;

 

import java.util.Scanner;

 

public class DayTwo

{

          

           

           

           public static void main(String[] args)

           {

                     

                      Scanner scan = new Scanner(System.in);

                      System.out.println("Enter the number of todos to be taken");

                      int size = scan.nextInt();

                      String[] todos= new String[size];

                      int index=0;

                     

                      int choice = -1;

                      do

                      {

                                 System.out.println("press 1 to add todo");

                                 System.out.println("press 2 to update todo");

                                 System.out.println("press 3 to delete todo");

                                 System.out.println("press 4 to search todo");

                                 System.out.println("press 5 to display all todos");

                                 System.out.println("press 0 to exit todo application");

                                

                                 choice=scan.nextInt();

                                 scan.nextLine();

                                

                                 switch(choice)

                                 {

                                 case 1:  System.out.println("enter todo to be added");

                                         String todo=scan.nextLine();

                                         todos[index++]=todo;

                                          System.out.println(todo+" todo added successfully ");

                                         

                                            break;

                                 case 2:  System.out.println("updating todo");

                                         System.out.println("Enter index number to update");

                                         int upnum = scan.nextInt();

                                         scan.nextLine();

                                         System.out.println("Enter the name to update");

                                         String update = scan.nextLine();

                                         todos[upnum]= update;

                                               break;

                                 case 3: System.out.println("deleting todo");

                                 int delnum = scan.nextInt();

                                 todos[delnum]="NULL";

                                            break;

                                 case 4: System.out.println("searching todo");

                                 System.out.println("Enter the search string u want search");

                                 String srstr = scan.nextLine();

                                 for(int i=0;i<size;i++) {

                                 if(srstr.equalsIgnoreCase(todos[i]))

                                 {

                                             System.out.println(i +"element got found");

                                             break;

                                  }

                                 else

                                 {

                                             System.out.println("No such element");

                                 break;

                                 }

                                 }

                                            break;

                                 case 5: System.out.println("listing all todos");

                                         for(String td: todos)

                                         {

                                            System.out.println(td);

                                         }

                                            break;

                                 default: System.out.println("please select a valid input");

                                 }

                                

                                 

                      }

                      while(choice!=0);

                     

           }

 

}