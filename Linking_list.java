/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linking_list;

/**
 *
 * @author dsu13
 */

    
class Node{
int data;
Node address;
public  Node(int data){
this.data = data;
this.address= null;
}
}

public class Linking_list{
       Node head,tail;
       int size;
     public  Linking_list()
     {
         head=tail=null;
         size=0;
     }
     
     public void printlist(){
         Node current =head;
         
         while(current!=null){
             System.out.println(current.data +" ");
             current = current.address;
             
         }
     }
     
      public void add(int d)
      {
        Node n=new Node(d) ;
        if(head==null)
        {head=tail=n;
        }
        else{
            tail.address=n;
            tail=n;
        }
        size++;
      }
      public int getsize(){
          return size;
      }
      
      public static void main(String[] args) {
        
    
      {
          Linking_list list =new Linking_list();
          
          list.add(1);
          list.add(2);
          list.add(3);
          list.add(4);
          list.printlist();
          System.out.println("The size of list: "+list.getsize());
      }
}
    }   

       
             
//    public static void main(String[] args) {

             
//        Node node = new Node(1);
//       Node node1=new Node(2);
//       Node node2=new Node(3);
//       Node node3=new Node(4);
//      
////       node.address = node1 ;
//        node1.address=node2;
//        node2.address=node3;
//        node3.address= null;
//          
//        System.out.println(node.data);
//        System.out.println(node1.data);
//        System.out.println(node2.data);
//        System.out.println(node3.data);
// 
//    }
    
