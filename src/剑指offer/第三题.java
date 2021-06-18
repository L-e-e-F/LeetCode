package 剑指offer;

public class 第三题 {
    /**
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     *
     * 示例 1：
     *
     * 输入：s = "We are happy."
     * 输出："We%20are%20happy."
     */
    class Solution {
        public String replaceSpace(String s) {
            //StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
            //但是StringBuilder的方法不是线程安全的 只是速度比StringBuffer快，多数情况下优先使用StringBuilder
            StringBuilder s1 = new StringBuilder();
            for(char c : s.toCharArray()){
                if(c == ' ')
                    s1.append("%20");
                else
                    s1.append(c);
            }
            return s1.toString();
        }
    }
}
