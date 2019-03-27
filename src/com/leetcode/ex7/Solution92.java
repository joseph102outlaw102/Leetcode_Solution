package com.leetcode.ex7;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-01-17 12:54
 **/

public class Solution92 {
    public int robotSim(int[] commands, int[][] obstacles) {
        int direction = 0;
        int x=0,y=0;
        int ans = 0;
        for(int i=0;i<commands.length;i++){
            int curX = x, curY = y;
            switch(commands[i]){
                case -1:
                    direction = (direction+1)%4;
                    break;
                case -2:
                    direction = (direction+3)%4;
                    break;
                default:
                    if(direction==0){
                        y += commands[i];
                        for(int j=0;j<obstacles.length;j++){
                            if(obstacles[j][0]==x&&obstacles[j][1]>curY){
                                y = Math.min(y,obstacles[j][1]-1);
                            }
                        }
                    }else if(direction==1){
                        x += commands[i];
                        for(int j=0;j<obstacles.length;j++){
                            if(obstacles[j][1]==y&&obstacles[j][0]>curX){
                                x = Math.min(x,obstacles[j][0]-1);
                            }
                        }
                    }else if(direction==2){
                        y -= commands[i];
                        for(int j=0;j<obstacles.length;j++){
                            if(obstacles[j][0]==x&&obstacles[j][1]<curY){
                                y = Math.max(y,obstacles[j][1]+1);
                            }
                        }
                    }else{
                        x -= commands[i];
                        for(int j=0;j<obstacles.length;j++){
                            if(obstacles[j][1]==y&&obstacles[j][0]<curX){
                                x = Math.max(x,obstacles[j][0]+1);
                            }
                        }
                    }
            }
            //System.out.println("当前位置：("+x+","+y+")");
            ans = Math.max(ans,x*x+y*y);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] a = new int[]{2,4};
        int[][] b = new int[1][2];
        b[0] = a;
        new Solution92().robotSim(new int[]{4,-1,4,-2,4},b);
    }
}
