package lists.nodes;

public class BNode<DataType> extends Node{
    //attributes
    private BNode left, right;

    //contructor
    public BNode(DataType data) {
        super(data);
        this.left = null;
        this.right = null;
    }

    //getters & setters
    public BNode getLeft() {
        return this.left;
    }

    public BNode getRight() {
        return this.right;
    }

    public void setLeft(BNode left) {
        this.left = left;
    }

    public void setRight(BNode right) {
        this.right = right;
    }
}
