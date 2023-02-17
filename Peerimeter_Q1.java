package Evalution_3;
class rectangle{
    int length=0;
    int breadth=0;
    rectangle(){

    }
    rectangle(int l,int b){
        length = l;
        breadth = b;
    }
    public void displayArea(){
        int result = length*breadth;
        System.out.println("Area of rectangle is "+ result);
    }
}
class Perimeter extends rectangle{
    Perimeter(int l,int b){
        super.breadth=b;
        super.length=l;
    }
    public void diplay(){
        super.displayArea();
        int result = 2*(super.breadth+super.length);
        System.out.println("perimeter of rectangle is "+result);
    }
}
public class Peerimeter_Q1 {
    public static void main(String[] args) {
        Perimeter perimeter = new Perimeter(4,7);
        perimeter.diplay();
    }
}
/*
Area of rectangle is 28
perimeter of rectangle is 22

 */