package com.leetcode.ex7;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-14 16:23
 **/

public class Solution142 {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        MedianFinder m = new MedianFinder();
        m.addNum(-1);
        System.out.println(m.findMedian());
        m.addNum(-2);
        System.out.println(m.findMedian());
        m.addNum(-3);
        System.out.println(m.findMedian());
    }
}

class MedianFinderSort implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}

class MedianFinder {

    PriorityQueue<Integer> l;
    PriorityQueue<Integer> r;
    /** initialize your data structure here. */
    public MedianFinder() {
        //this.l = new PriorityQueue(10000,new MedianFinderSort());
        this.l = new PriorityQueue(idComparator);
        //this.l = new PriorityQueue<>((a, b) -> b - a);
        this.r = new PriorityQueue<>();
    }

    //此处实现了一个匿名内部类
    public static Comparator<Integer> idComparator = new Comparator<Integer>(){

        @Override
        public int compare(Integer c1, Integer c2) {
            return c2-c1;
        }
    };

    public void addNum(int num) {
        if(this.l.size()<this.r.size()){
            if(num<=r.peek()){
                l.add(num);
            }else{
                l.add(r.poll());
                r.add(num);
            }
        }else{
            if(l.peek()==null||num>=l.peek()){
                r.add(num);
            }else{
                r.add(l.poll());
                l.add(num);
            }
        }
    }

    public double findMedian() {
        if(this.l.size()<this.r.size()){
            return r.peek();
        }else{
            return (l.peek()+r.peek())/2.0;
        }
    }
}
