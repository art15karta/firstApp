package com.example.guessnumber;

public class BinarySearch {
    static public int onDivide(int num){
        return num/2;
    }
    static public int onMulty(int num) {
        double var;
        if (num <=666) {
        var = num * 1.5;
        } else {
            var = num+(1000-num)/2;
        }
        int y = (int)Math.round(var);

        return y;
    }

    static public int onRefresh() {
        double num =  Math.random()*1000+1;
        int x = (int)num;
        return x;
    }
}
