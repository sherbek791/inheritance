public class Singer extends Person {
    String brandName;

    public Singer(String name, int age, String brandName) {
        super(name, age);
        this.brandName = brandName;
    }
    public void singing(){
        System.out.println(name+" "+"can sing");
    }
    public void playingGuitar(){
        System.out.println(name+" "+"can play a guitar");
    }

    public void show(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Brand Name: "+brandName);
    }
}
