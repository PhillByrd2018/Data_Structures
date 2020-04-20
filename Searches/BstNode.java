package Searches;

public class BstNode {

    int data;
    BstNode left; 
    BstNode right;

    public BstNode(int data) {
        this.data = data;
    }
    public BstNode() {

    }

    @Override
    public String toString(){
        return Integer.toString(this.data);
    }
}