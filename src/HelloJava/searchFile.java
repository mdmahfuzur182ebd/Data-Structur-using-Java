package HelloJava;

class Search{
    int[] arr={1,3,4,88,98};
    void search(int key){
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(i);

            }
        }
    }
}
public class searchFile {
    public static void main(String[] args) {
        Search sc=new Search();
        sc.search(88);
    }

}
