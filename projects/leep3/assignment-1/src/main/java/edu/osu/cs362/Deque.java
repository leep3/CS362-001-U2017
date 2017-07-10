package edu.osu.cs362;

public class Deque {
    DequeNode front;
    DequeNode rear;    
    public Deque() {
        front = null;
        rear = null;
    }    
    public boolean isEmpty(){
        return (front==null);
    }    
    public void insertFront(int item){
        DequeNode node = new DequeNode(item);
        if(isEmpty()){
            front = node;
            rear = node;
            node.rlink = null;
            node.llink = null;
        }else{
            node.rlink = front;
            node.llink = null;
            front.llink = node;
            front = node;
        }
    }    
    public int deleteFront(){
        if(isEmpty()){
            System.out.println("It is empty.");
            return 0;
        }else{
            int data = front.data;
            if(front.rlink==null){
                front = null;
                rear = null;
            }else{
                front = front.rlink;
                front.llink = null;
            }
            return data;
        }
    }    
    public void insertRear(int item){
        DequeNode node =  new DequeNode(item);
        if(isEmpty()){
            front = node;
            rear = node;
            node.rlink = null;
            node.llink = null;
        }else{
            node.llink = rear;
            node.rlink = null;
            rear.rlink = node;
            rear = node;
        }
    }    
    public int deleteRear(){
        if(isEmpty()){
            System.out.println("It is empty.");
            return 0;
        }else{
            int data = rear.data;
            if(rear.llink==null){
                front = null;
                rear = null;
            }else{
                rear = rear.llink;
                rear.rlink = null;
            }
            return data;
        }
    }    
    public void removeFront(){
        if(isEmpty()){
            System.out.println("It is empty.");
        }else{
            if(front.rlink==null){
                front = null;
                rear = null;
            }else{
                front = front.rlink;
                front.llink = null;
            }
        }
    }    
    public void removeRear(){
        if(isEmpty()){
            System.out.println("It is empty.");
        }else{
            if(rear.llink==null){
                front = null;
                rear = null;
            }else{
                rear = rear.llink;
                rear.rlink = null;
            }
        }
    }    
    public int peekRear(){
        if(isEmpty()){
            System.out.println("It is empty.");
            return 0;
        }else{
            return rear.rlink.data;
        }
    }   
    public int peekFront(){
        if(isEmpty()){
            System.out.println("It is empty.");
            return 0;
        }else{
            return front.rlink.data;
        }
    } 
    public void print(){
        if(isEmpty()){
            System.out.println("It is empty.");
        }else{
            DequeNode node = front;
            while(node!=null){
                System.out.print(node.data + " ");
                node = node.rlink.rlink;
            }
            System.out.println();
        }
    }
}