public class Account {
    private int id;
    private  String name;
    public  double balanceA;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(int id, double balanceA) {
        this.id = id;
        this.balanceA = balanceA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
