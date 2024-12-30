package Arrays;

public class linearSearch {
    public static int search(int num[], int key){
        for(int i = 0; i<num.length; i++){
            if(num[i]==key){
                return 1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14};
        int key = 14;
        int res = search(num, key);
        if (res == 1){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
            
        }
    }
}
