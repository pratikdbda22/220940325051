import java.util.ArrayList;
//public class Main
//{
//    public static void main(String[] args) {
//        ArrayList<String> ls = new ArrayList<String>();
//        ls.add("java");
//        ls.add("python");
//        ls.add("big data");
//        ls.add("linux");
//        ls.add("cloud");
//
//        ls.forEach((ele) -> System.out.println("Collection of elements:"+ele));

//    }
//
//
//


import java.util.Scanner;

//class Account
//{
//    int account;
//    double balence;
//
//    Scanner sc = new Scanner(System.in);
//    public Account() {
//
//    }
//    public Account(int account, double balence) {
//        this.account = account;
//        this.balence = balence;
//    }
//
//    public void withdrawBalence()
//    {
//        System.out.print("Enter the amount to be Withdraw:");
//        int withdraw = sc.nextInt();
//        if(withdraw <= balence)
//        {
//            balence = balence - withdraw;
//            System.out.println("You Withdraw Amount..");
//        }
//        else
//        {
//            System.out.println("Unsufficient Balence..");
//        }
//
//    }
//    public void depositBalence()
//    {
//        System.out.println("Enter the amount to be Diposit:");
//        int diposit = sc.nextInt();
//        balence = balence + diposit;
//        System.out.println("Amount Diposited..");
//    }
//    public void showBalence()
//    {
//        System.out.println("Total net Balence :"+balence);
//    }
//}
//
//public class Main
//{
//    public static void main(String[] args) {
//        Account account = new Account(300000954,8000);
//        account.showBalence();
//        account.depositBalence();
//        account.showBalence();
//        account.withdrawBalence();
//        account.showBalence();
//
//    }
//
//}

//class Main
//{
//    void draw()
//    {
//        System.out.println("Shape Draw....");
//    }
//    void erase()
//    {
//        System.out.println("Shape Erase....");
//    }
//
//}
//class Circle extends Main
//{
//    void draw()
//    {
//        System.out.println("Circle Draw....");
//    }
//    void erase()
//    {
//        System.out.println("Circle Erase....");
//    }
//
//}
//class Tringle extends Main
//{
//    void draw()
//    {
//        System.out.println("Tringle Draw....");
//    }
//    void erase()
//    {
//        System.out.println("Tringle Erase....");
//    }
//}
//class Square extends Main
//{
//    void draw()
//    {
//        System.out.println("Square Draw....");
//    }
//    void erase()
//    {
//        System.out.println("Square Erase....");
//    }
//
//}
//public class Shape
//{
//    public static Main shapesInfo()
//    {
//        switch ((int)(Math.random() * 3))
//        {
//            case 0 :
//                return new Circle();
//            case 1:
//                return new Tringle();
//            case 2:
//                return new Square();
//            default:
//                System.out.println("Default");
//        }
//        return new Main();
//    }
//
//
//
//    public static void main(String[] args) {
//        Main shapes[] = new Main[9];
//        for(int i = 0 ; i < shapes.length ; i++)
//            shapes[i] = shapesInfo();
//        for(int i = 0 ; i < shapes.length ; i++)
//            shapes[i].draw();
//    }
//}
//class GrandParents
//{
//    String
//            GrandFatherName;
//    String GrandMotherName;
//
//    public GrandParents(String grandFatherName, String grandMotherName) {
//        GrandFatherName = grandFatherName;
//        GrandMotherName = grandMotherName;
//        System.out.println("GrandFatherName: "+grandFatherName);
//        System.out.println("GrandMotherName: "+grandMotherName);
//    }
//}
//public class Q4_1_GrandParents
//{
//    public static void main(String[] args) {
//        GrandParents gp = new GrandParents("Uttreshwar","Ganga");
//    }
//}
