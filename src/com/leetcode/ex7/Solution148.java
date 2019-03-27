package com.leetcode.ex7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-18 15:49
 **/

public class Solution148 {
    public static void main(String[] args) {
        //TODO Auto-generated method stub

    }
}

interface NestedInteger {
    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}

class NestedIterator implements Iterator<Integer> {

    private List<Integer> list;
    private int index;

    public NestedIterator(List<NestedInteger> nestedList) {
        list = new ArrayList<>();
        this.index = 0;
        this.add(nestedList);
    }

    private void add(List<NestedInteger> nestedList){

        for(NestedInteger nestedInteger:nestedList){
            if(nestedInteger.isInteger()){
                list.add(nestedInteger.getInteger());
            }else{
                add(nestedInteger.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return list.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index<list.size();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
