import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Person {
    int NID;
    double salary;
    int age;
    String name;
    public Person(int NID, double salary,int age,String name){
        this.NID = NID;
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        HashMap<Integer, Person> map = new HashMap<>();
        try{
            File fp = new File("input.txt");
            Scanner sc = new Scanner(fp);
            int i = 0;
            while(sc.hasNext()) {
                if (i == 0) {
                    String a = sc.nextLine();
                    i = 1;
                } else {
                    String S[] = sc.nextLine().split(" ");
                    int id = Integer.parseInt(S[0]);
                    Person p = new Person(Integer.parseInt(S[0]), Double.parseDouble(S[1]), Integer.parseInt(S[2]), S[3]);
                    map.put(id, p);
                }
            }
            System.out.println(map);
            System.out.print("Enter a persons ID:");
            Scanner sc2 = new Scanner(System.in);
            int a = sc2.nextInt();
            if(map.containsKey(a)){
                Person p = map.get(a);
                System.out.println("Person's Name: "+p.name);
                System.out.println("NID: "+p.NID);
                System.out.println("Salary: "+p.salary);
                System.out.println("Age: "+p.age);
            }
            else{
                System.out.println("Person not Found");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}