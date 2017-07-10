package edu.osu.cs362;

public class DequeNode {
    int data;
    DequeNode llink;
    DequeNode rlink;
    
    public DequeNode() {
        this.llink = null;
        this.rlink = null;
    }
    
    public DequeNode(int data) {
        this.data = data;
        this.llink = null;
        this.rlink = null;
    }
}