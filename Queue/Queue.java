class MyQueue{
    List<Integer> queue;
    int front;
  
    public MyQueue(){
        queue = new ArrayList<>();
        front = 0;
    }

    public boolean enQueue(int val){
        queue.add(val);
        return true;
    }

    public int deQueue(){
        if(isEmpty())
            return -1;
        return queue.get(front++);
    }

    public int Front(){
        if(isEmpty())
            return -1;
        return queue.get(front);
    }

    public boolean isEmpty(){
       return front>=queue.size();
    }
}

class Solution {
    public static void main(String[] args) throws IOException {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
    }
