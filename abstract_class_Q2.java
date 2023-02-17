package Evalution_3;
abstract class order{
    int memberid;
    String description;
    order(){

    }
    order(int id, String desc){
        memberid=id;
        description = desc;
    }

    public abstract void display();

}
class PurchaseOrder extends order{
    String memberCustomeName;
    String VendorName;
    PurchaseOrder(String mem, String ven){
        memberCustomeName=mem;
        VendorName=ven;
    }

    @Override
    public void display() {
        System.out.println("member name is "+memberCustomeName);
        System.out.println("Vendor name is "+VendorName);
        System.out.println();
    }
}
class SalesOrder extends order{
    String memberCustomeName;
    String VendorName;
    SalesOrder(String mem, String ven){
        memberCustomeName = mem;
        VendorName =ven;
    }
    @Override
    public void display() {
        System.out.println("member name is "+memberCustomeName);
        System.out.println("Vendor name is "+VendorName);
        System.out.println();
    }
}
public class abstract_class_Q2 {
    public static void main(String[] args) {
        PurchaseOrder purchaseOrder1 = new PurchaseOrder("ani","amazon");
        PurchaseOrder purchaseOrder2 = new PurchaseOrder("mukesh","flip");
        PurchaseOrder purchaseOrder3 = new PurchaseOrder("aniket","myn");
        purchaseOrder1.display();
        purchaseOrder2.display();
        purchaseOrder3.display();
        SalesOrder salesOrder1 = new SalesOrder("akash","ama");
        SalesOrder salesOrder2= new SalesOrder("nitin","flip");
        SalesOrder salesOrder3 = new SalesOrder("ysh","myn");

        salesOrder1.display();
        salesOrder2.display();
        salesOrder3.display();


    }
}
