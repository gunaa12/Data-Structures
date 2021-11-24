package lists.nodes;

public class Node<DataType> {
    //attributes
    private DataType data;
    private Node nextLink;

    //constructor
    public Node (DataType data) {
        this.data = data;
        this.nextLink = null;
    }

    //setters and getters
    public Node getNextLink() {
        return this.nextLink;
    }

    public void setNextLink(Node node) {
        this.nextLink = node;
    }

    public DataType getData() {
        return this.data;
    }

    public void setData(DataType data) {
        this.data = data;
    }
}