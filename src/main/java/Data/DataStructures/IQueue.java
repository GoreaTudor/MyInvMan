package Data.DataStructures;

public interface IQueue {

    String LOG_IN = "log in";
    String NEW_ACCOUNT = "new account";

    void enqueue(String item); // adds a new item to the queue
    String dequeue(); // extracts an item from the queue
    String peek(); // take a look at the node that has to be extracted
    int size(); // returns the size of the queue (number of elements)
    boolean isEmpty(); // verifies if the queue is empty
}
