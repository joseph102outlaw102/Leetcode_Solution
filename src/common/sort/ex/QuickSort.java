package common.sort.ex;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-19 15:16
 **/

public class QuickSort {
    public void quicksort(int[] a, int l, int r){
        if(r<=l){
            return ;
        }
        int i=l,j=r;
        int target = a[l];
        while(i<j){
            while(i<j&&a[j]>=target){
                j--;
            }
            while(i<j&&a[i]<=target){
                i++;
            }
            if(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[l] = a[i];
        a[i] = target;
        quicksort(a,l,i-1);
        quicksort(a,i+1,r);
    }

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        int[] a = new int[]{3,6,-2,-1,20,4};
        new QuickSort().quicksort(a,0,5);
        for(int i:a)
            System.out.println(i);
    }
}
