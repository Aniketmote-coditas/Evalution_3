package Evalution_3;

import javafx.scene.transform.Scale;

import java.sql.SQLOutput;
import java.util.Scanner;

class Vehicle{
    String company;
    int price;
}
class LightMoterVehicle extends Vehicle{
    int mileage;
    LightMoterVehicle(int price,String com, int mil){
        super.company=com;
        super.price=price;
        mileage = mil;
        System.out.println("company is "+ com +" price is "+price+ "mileage is" +mil);
    }
}

class HeavyMotorVehicle extends Vehicle{
    int capacity_in_tons;
    HeavyMotorVehicle(int price, String com, int cap){
        super.company=com;
        super.price=price;
        capacity_in_tons=cap;
        System.out.println("company is "+ com +" price is "+price+ "capacity is " +capacity_in_tons);
    }
}
public class Vehicle_Q4 {
    public static void main(String[] args) {
        Vehicle vehicle[]=new Vehicle[10];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<10;i++){
            System.out.println("Enter the 1 for LMV and 2 for HMV");
            int a = sc.nextInt();
            if(a==1){
                vehicle[i]=new LightMoterVehicle(50000,"maruthi",15);
            }else if(a==2){
                vehicle[i]=new HeavyMotorVehicle(700000, "honda", 10);
            }
        }
    }
}
/*
Enter the 1 for LMV and 2 for HMV
1
company is maruthi price is 50000mileage is15
Enter the 1 for LMV and 2 for HMV
2
company is honda price is 700000capacity is 10
Enter the 1 for LMV and 2 for HMV
4
Enter the 1 for LMV and 2 for HMV
2
company is honda price is 700000capacity is 10
Enter the 1 for LMV and 2 for HMV
2
company is honda price is 700000capacity is 10
Enter the 1 for LMV and 2 for HMV
1
company is maruthi price is 50000mileage is15
Enter the 1 for LMV and 2 for HMV
2
company is honda price is 700000capacity is 10
Enter the 1 for LMV and 2 for HMV
1
company is maruthi price is 50000mileage is15
Enter the 1 for LMV and 2 for HMV
2
company is honda price is 700000capacity is 10
Enter the 1 for LMV and 2 for HMV
1
company is maruthi price is 50000mileage is15
 */