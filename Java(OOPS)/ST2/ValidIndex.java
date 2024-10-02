public class ValidIndex {
    public static void main(String[] args) {
        int []arr=new int [5];
        try {
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
}
