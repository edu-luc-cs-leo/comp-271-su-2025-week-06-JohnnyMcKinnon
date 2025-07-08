public class Queue extends DynamicArray implements Comparable<Queue>, Xifo<String>, Fifo<String> {
private static final int FRONT_INDEX = 0;

    public void add(String e){
        super.add(e);
    }

    public int compareTo(Queue other) {
        return Integer.compare(this.getOccupancy(), other.getOccupancy());
    } // method compareTo

    public String peek() {
        if(this.getOccupancy() == 0){
        return null;
        }
        return this.get(FRONT_INDEX);
    } // method peek

    public String pop() {
        if(this.getOccupancy() == 0){
        return null;
        }
        return this.remove(FRONT_INDEX);
    } // method pop

    public String toString() {
        return super.toString();
    } // method toString

} // class Queue

//Review for Queue:
//add(String e): Adds element at the end by calling superclass add.
//peek(): Returns front element (index 0), or null if empty.
//pop(): Removes and returns front element (index 0), or null if empty.
//compareTo: Compares based on occupancy.
//toString: Delegates to DynamicArray’s toString.