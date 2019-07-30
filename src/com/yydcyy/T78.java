package com.yydcyy;

/**
 * Created by Administrator on 2019-04-08.
 */
public class T78 {
    public String leftRotateString(String str,int n) {
        if (str.length() == 0 || str.equals("")) return "";

        //一次翻转
        StringBuffer sb = new StringBuffer(str.substring(0, str.length() -1));
        str = sb.reverse().toString();

        //二次翻转
        if (n != 0){
            StringBuffer l = new StringBuffer(str.substring(0,str.length() - 1 - n) );
            StringBuffer r = new StringBuffer(str.substring(str.length()  - n, str.length() - 1) );
            str = l.reverse().toString() + r.reverse().toString();
        }
        return str;
    }
}
