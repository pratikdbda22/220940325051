
class GrandParents
{
    String GrandFatherName;
    String GrandMotherName;

    public GrandParents(String grandFatherName, String grandMotherName) {
        GrandFatherName = grandFatherName;
        GrandMotherName = grandMotherName;
        System.out.println("GrandFatherName: "+grandFatherName);
        System.out.println("GrandMotherName: "+grandMotherName);
    }
}
public class Q4_1_GrandParents
{
    public static void main(String[] args) {
        GrandParents gp = new GrandParents("Uttreshwar","Ganga");
    }
}


//Q4.2

class GrandParentss
{
    String grandFatherName;
    String grandMotherName;

    public GrandParentss(String grandFatherName, String grandMotherName)
    {
        this.grandFatherName=grandFatherName;
        this.grandMotherName=grandMotherName;

        System.out.println("Name of Grand Father is : "+grandFatherName);
        System.out.println("Name of Grand Mother is : "+grandMotherName);
    }
}


class Parentss extends GrandParent {
    String FatherName;
    String MotherName;


    public Parentss(String FatherName, String MotherName, String grandFatherName, String grandMotherName) {
        super(grandFatherName, grandMotherName);
        this.FatherName = FatherName;
        this.MotherName = MotherName;

        System.out.println("Name of Father is : " + FatherName);
        System.out.println("Name of Mother is : " + MotherName);
    }
}
public class Family
{
    public static void main(String[] args) {
        Parentss p = new Parentss("Rajendra","Ayodhya","Uttreshwar","Ganga");

    }
}



//        Q4.3

class GrandParent
{
    String grandFatherName;
    String grandMotherName;

    //Constructor of class GrandParent
    public GrandParent(String grandFatherName, String grandMotherName)
    {
        this.grandFatherName=grandFatherName;
        this.grandMotherName=grandMotherName;

        System.out.println("Name of Grand Father is : "+grandFatherName);
        System.out.println("Name of Grand Mother is : "+grandMotherName);
    }
}


class Parent extends GrandParent
{
    String FatherName;
    String MotherName;

    public Parent(String FatherName,String MotherName,String grandFatherName, String grandMotherName)
    {
        super(grandFatherName, grandMotherName);
        this.FatherName=FatherName;
        this.MotherName=MotherName;

        System.out.println("Name of Father is : "+FatherName);
        System.out.println("Name of Mother is : "+MotherName);
    }

    public Parent(String grandFatherName, String grandMotherName) {
        super(grandFatherName, grandMotherName);
    }
}

public class Child extends Parent {
    public Child(String FatherName, String MotherName, String grandFatherName, String grandMotherName) {
        super(FatherName, MotherName, grandFatherName, grandMotherName);
    }

    public static void main(String args[]) {
        Child c = new Child("Sham”,”Neeta”,”Ram”,”Seeta”);

    }
}
