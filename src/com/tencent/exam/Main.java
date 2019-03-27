package com.tencent.exam;

import java.io.*;
import java.util.*;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-26 10:02
 **/

class myEntry implements Comparable<myEntry>{
    //自然顺序比较日志时间
    @Override
    public int compareTo(myEntry o) {
        return this.time.compareTo(o.time);
    }

    private int id;
    private String file_code;
    private String[] labels;
    private String time;

    public myEntry(int id, String file_code, String[] labels, String time) {
        this.id = id;
        this.file_code = file_code;
        this.labels = labels;
        this.time = time;
    }
}

class EntryManage{
    private final static EntryManage instance = new EntryManage();
    Map<myEntry,Integer> map;
    public EntryManage() {
        map = new HashMap<>();
    }

    public static EntryManage getInstance() {
        return instance;
    }

    public void addEntry(){

    }

}
class myFile{
    private int file_id;
    private String file_name;

    public myFile(int file_id, String file_name) {
        this.file_id = file_id;
        this.file_name = file_name;
    }
    public void readfile(){
        try(FileReader reader = new FileReader(file_name);
            BufferedReader br = new BufferedReader(reader)) {
            String line;
            while((line=br.readLine())!=null){

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class FileManage{
    private final static FileManage instance = new FileManage();
    List<myFile> files = new ArrayList<>();
    private int file_number = 0;

    public FileManage() {
    }

    public static FileManage getInstance() {
        return instance;
    }

    public void addFile(String filename){
        myFile newfile = new myFile(file_number,filename);
        newfile.readfile();
        file_number++;
        files.add(newfile);
    }

}
public class Main {
    //基于最短匹配原则，类似于贪心，每次获取已有标签库中的最短label，并非最好的解决办法，时间复杂度为O(n)
    public String[] argsParse(String args){
        EntryManage entry_manage = EntryManage.getInstance();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        int split_number = 0; //新子串的起始位置,以及list的个数减一
        for(int i=0;i<args.length();i++){
            if(entry_manage.map.containsKey(args.substring(list.get(split_number),i))){
                list.add(i);
                split_number++;
            }
        }
        String[] labels = new String[list.size()];
        for(int i=0;i<list.size();i++){
            labels[i] = args.substring(list.get(split_number),i);
        }
        return labels;
    }

    public static void main(String[] args) {
        //TODO Auto-generated method stub

        //全部文件名
        String[] filenameset = new String[]{};

        //录入全部文件
        for(int i=0;i<filenameset.length;i++) {
            FileManage.getInstance().addFile(filenameset[i]);
        }

        //输入搜索命令
        Scanner in = new Scanner(System.in);
        while(true){
            String input_string = in.next();
            //System.out.println(input_string);
            String[] args_list;

        }
    }

}
