package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 * https://www.acwing.com/problem/content/description/17/
 */
public class T5 {
    /**
     * cyc 方法比较巧, 没新new StringBuffer, 难以理解点, 跳过, 用 大雪菜 暴力方法
     */
        public String replaceSpaces(StringBuffer str) {

            if (str == null || str.length() == 0) return "";
            String str1 = str.toString();
            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < str1.length(); i ++){
                if (str1.charAt(i) == ' ')
                    sb.append("%20");

                else sb.append(str1.charAt(i));
            }
            return sb.toString();
        }
}
