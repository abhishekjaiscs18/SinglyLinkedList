/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 29-Jan-20
 *  Time: 4:12 AM
 */
package singlylinkedlist.implmentation;

import singlylinkedlist.linkedlist.MyLinkedList;
import singlylinkedlist.node.Node;

import java.util.Scanner;

public class MyLinkedListImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyLinkedList linkedList = new MyLinkedList();

        // a loop to add data in the lst
        System.out.println("enter 5 integers");
        for (int i = 0; i < 5; i++) {
            int data = sc.nextInt();
            // calling insert function to insert data
            linkedList.insert(data);
        }
        // calling printList method to print list
        linkedList.printList();
        //deleting the last node
        System.out.println("deleting last node");
        Node deletedNode = linkedList.delete();
        if(deletedNode!=null){
            System.out.println(deletedNode.getData());
        }else{
            System.out.println("List is empty.");
        }
        //printing the list
        linkedList.printList();
        linkedList.sort();
        linkedList.printList();

    }
}
