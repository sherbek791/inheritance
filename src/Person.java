public class Person {
    String name;
    int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public Person() {
    }

    void learn(){
        System.out.println(name+" "+"learn");
    }
    void walk(){
        System.out.println(name+" "+"walk ");
    }
    void eat(){
        System.out.println(name+" "+"eat");
    }
}
