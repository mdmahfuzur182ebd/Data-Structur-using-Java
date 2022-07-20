//1 number
public class Leon {

    void parent(){
        System.out.println("This is parent class");
    }
}
class child extends Leon {
    public void chile() {
        System.out.println("This is child class");
    }
}
class dispaly {
    public static void main(String[] args) {
       Leon l=new Leon();
       l.parent();

       child c=new child();
       c.chile();
       c.parent();
    }

}
