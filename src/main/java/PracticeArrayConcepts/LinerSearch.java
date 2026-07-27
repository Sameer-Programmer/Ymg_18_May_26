package PracticeArrayConcepts;

public class LinerSearch {
    public static void main(String[] args) {
        int arr [] = {1,2,3,2,4,5,6,2};
        boolean flag = false;
        int count = 0;
        int find = 2;

        for(int x :arr){
            if (x==find){
                flag = true;
                count++;
            }
        }
        if(flag){
            System.out.println(find+"  ItemFound");
        }
        System.out.println(count+"     count");
    }
}
