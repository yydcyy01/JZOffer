package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 */
public class T20 {
    /*
    提示用正则表达式, 但是不会, 匹配好麻烦, 暂时搁浅  这个没跑过
     */
        public boolean isNumber(String s) {
            if(s == null || s.length() ==0) return false;

            return s.matches("[+-]?\\d*(\\.\\d+)?([eE][+-])?\\d+)?"); //使用正则表达式进行匹配

        }

}
