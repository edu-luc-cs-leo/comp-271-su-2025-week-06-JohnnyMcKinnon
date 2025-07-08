public class Stack extends DynamicArray implements Comparable<Stack>, Xifo<String>, Lifo<String> {
private static final int FRONT_INDEX = 0;

    public int compareTo(Stack other) {
        return Integer.compare(this.getOccupancy(), other.getOccupancy());
    } // method compareTo

    public String peek() {
        if (this.getOccupancy() == 0){
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

    public void push(String e) {
        this.add(FRONT_INDEX, e);
    } // method push

} // class Stack

//Review for Stack:
//push(String e): Adds new element at front (index 0).
//peek(): Looks at the top element (index 0).
//pop(): Removes and returns top element (index 0).
//compareTo: Based on occupancy.
//toString: Uses superclass toString.