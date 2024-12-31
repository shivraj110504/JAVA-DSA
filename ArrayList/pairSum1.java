package ArrayList;

import java.util.ArrayList;

public class pairSum1 {
    //Brute Force

    // public static boolean pairSum(ArrayList<Integer> list, int target){
    //     for(int i = 0; i<list.size(); i++){
    //         for(int j = i+1; j<list.size(); j++){
    //             if(list.get(i) + list.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //2 pointer approach

    public static boolean pairSum(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size() - 1;
        while(lp < rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        int target = 40;
        System.out.println(pairSum(list, target));
    }
}
