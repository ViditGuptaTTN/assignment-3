package main;

public class Question2 {
    public static void getSortedString(String str){
        char[] ch=str.toCharArray();
        int len=ch.length;
        char cr;
        for(int i=0;i<len;i++) {
            for (int j = 0; j < len; j++) {
                if (ch[i] <= ch[j]) {
                    cr = ch[j];
                    ch[j] = ch[i];
                    ch[i] = cr;
                }
            }
        }
        String s=new String(ch);
        System.out.println(s);
    }
}
