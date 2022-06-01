import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(10);
        // əlavə etmə metodları
        arrayDeque.add(14);
        System.out.println("add() metodundan sonra Deque : " + arrayDeque);
        arrayDeque.addLast(15);
        System.out.println("addLast() metodundan sonra Deque : " + arrayDeque);
        arrayDeque.add(16);
        System.out.println("add() metodundan sonra Deque : " + arrayDeque);
        arrayDeque.addFirst(10);
        System.out.println("addFirst() metodundan sonra Deque : " + arrayDeque);
        arrayDeque.add(9);
        System.out.println("add() metodundan sonra Deque : " + arrayDeque);
        arrayDeque.offer(115);
        System.out.println("offer() metodundan sonra Deque : " + arrayDeque);
        arrayDeque.offerLast(140);
        System.out.println("offerLast() metodundan sonra Deque : " + arrayDeque);
        arrayDeque.offer(5);
        System.out.println("offer() metodundan sonra Deque : " + arrayDeque);
        arrayDeque.offerFirst(4);
        System.out.println("offerFirst() metodundan sonra Deque : " + arrayDeque);
        arrayDeque.push(1);
        System.out.println("push() metodundan sonra Deque : " + arrayDeque);
        // silmə metodları
        int silinenElement1 = arrayDeque.poll();
        System.out.println("poll() metodu ile silinen element :" + silinenElement1);
        System.out.println("poll() metodundan sonra Deque : " + arrayDeque);
        int silinenElement2 = arrayDeque.pollLast();
        System.out.println("pollLast() metodu ile silinen element :" + silinenElement2);
        System.out.println("pollLast() metodundan sonra Deque : " + arrayDeque);
        int silinenElement3 = arrayDeque.pollFirst();
        System.out.println("pollFirst() metodu ile silinen element :" + silinenElement3);
        System.out.println("pollFirst() metodundan sonra Deque : " + arrayDeque);
        int silinenElement4 = arrayDeque.remove();
        System.out.println("remove() metodu ile silinen element :" + silinenElement4);
        System.out.println("remove() metodundan sonra Deque : " + arrayDeque);
        int silinenElement5 = arrayDeque.removeLast();
        System.out.println("removeLast() metodu ile silinen element :" + silinenElement5);
        System.out.println("removeLast() metodundan sonra Deque : " + arrayDeque);
        int silinenElement6 = arrayDeque.removeFirst();
        System.out.println("removeFirst() metodu ile silinen element :" + silinenElement6);
        System.out.println("removeFirst() metodundan sonra Deque : " + arrayDeque);
        int silinenElement7 = arrayDeque.pop();
        System.out.println("pop() metodu ile silinen element :" + silinenElement7);
        System.out.println("pop() metodundan sonra Deque : " + arrayDeque);
        // seçmə metodları
        System.out.println("peek() metodu ilə seçilən element : " + arrayDeque.peek());
        System.out.println("peekLast() metodu ilə seçilən element : " + arrayDeque.peekLast());
        System.out.println("getLast() metodu ilə seçilən element : " + arrayDeque.getLast());
        System.out.println("peekFirst() metodu ilə seçilən element : " + arrayDeque.peekFirst());
        System.out.println("getFirst() metodu ilə seçilən element : " + arrayDeque.getFirst());
        // digər metodlar
        System.out.println("Deque-nin ölçüsü : " + arrayDeque.size());
        Object[] massivEdedler = arrayDeque.toArray();
        System.out.println("Massivin elementləri : ");
        for (Object eded : massivEdedler) {
            System.out.print(eded + ", ");
        }
        ArrayDeque arrayDeque1 = arrayDeque.clone();
        System.out.println();
        System.out.println("Klonlanmış Deque-nin elementləri : " + arrayDeque1);
        System.out.println("Deque boşdur mu ? Cavab : " + arrayDeque.isEmpty());
        arrayDeque.clear();
        System.out.println("Deque clear() metodundan sonra : " + arrayDeque);
        System.out.println("Deque boşdur mu ? Cavab : " + arrayDeque.isEmpty());


    }
}
