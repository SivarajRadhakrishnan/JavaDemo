/**
 * Created by IntelliJ IDEA.
 * User: sivaraj
 * Date: 30/10/20
 * Time: 11:43 AM
 * To change this template use File | Settings | File and Code Templates.
 */
public class JavaDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 1;

        int[] b = {1,2,3,4,5};
        char[] grades = {'A','B','C','D'};

        Car[] cars = new Car[5];
//        cars[0] = new Car();
//        cars[1] = new Car();
//        cars[2] = new Car();
//        cars[3] = new Car();
//        cars[4] = new Car();

        Car[] cars2 = {new Car("Hyundai", "Santro", "Grey", "Hatchback", "Diesel"), new Car("Maruti Suzuki", "Vitara Brezza", "Purple", "SUV", "Petrol")};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

//        System.out.println("For Loop...");
//        for(int i=0; i<5; i++)
//            System.out.println(arr[i]);
//
//        System.out.println("For Loop2...");
//        for(int i=0; i<5; i++)
//            System.out.println(b[i]);
//
//        float salary = 50000.123456789F;
        Car car = new Car("Hyundai", "Santro", "Grey", "Hatchback", "Diesel");
        car.print();

        cars2[0].print();
        cars2[1].print();

    }
}