//2 Number
public abstract class Animal {
    public int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    abstract void eat() ;

    public void walk(){
        System.out.println("Animal run with "+ legs +"legs");
    }
}
class Fish {
    public Fish() {
        super();
    }

    void walk() {
        System.out.println("fish can't walk and don't have legs");
    }
}
