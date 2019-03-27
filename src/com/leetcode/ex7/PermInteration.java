package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-08 13:47
 **/

public class PermInteration {
    public static void main(String[] args) {
        int count=0;
        String str="abcd";
        char[] c=str.toCharArray();
        sort(c,0);    //先排序
        print(c);
        count++;
        while(getNextPerm(c)){
            count++;
        }
        System.out.println(count);
        System.exit(0);
    }

    //获取下一个字典序列
    private static boolean getNextPerm(char[] c){
        int end=c.length-1;
        int flag=0;
        int min=0;
        int index=end;
        while(index>0&&c[index]<=c[index-1]){
            index--;
        }
        if(index==0)
            return false;

        flag=index-1;
        min=index;
        for(int i=index;i<=end;i++){
            if(c[i]>c[flag]&&c[i]<c[min])
                min=i;
        }
        swap(c,flag,min);
        sort(c,index);

        print(c);
        return true;
    }
    //交换
    private static void swap(char[] c,int index1,int index2){
        char t=c[index1];
        c[index1]=c[index2];
        c[index2]=t;
    }
    //对index及后面的元素排序
    private static void sort(char[]c,int index){
        int min;
        for(int i=index;i<c.length-1;i++){
            min=i;
            for(int j=i;j<c.length;j++){
                if(c[j]<c[min])
                    min=j;
            }
            swap(c,i,min);
        }
    }
    //打印数组
    private static void print(char[] c){
        for(int i=0;i<c.length;i++){
            if(i==c.length-1)
                System.out.print(c[i]+"\n");
            else
                System.out.print(c[i]+" ");
        }
    }
}

