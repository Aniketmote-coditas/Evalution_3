package Evalution_3;
interface test {
    public void square();

}
class arithmetic implements test{
    @Override
    public void square() {
        int a = 8;
        int b = 8;
        System.out.println("Square has length "+a+ " Square has breadth "+b);
    }
}
public class ToTestInt_Q_3 {
    public static void main(String[] args) {
        arithmetic ar = new arithmetic();
        ar.square();
    }
}
/* Square has length 8 Square has breadth 8 */