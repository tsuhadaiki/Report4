package jp.ac.uryukyu.ie.e175730;

public class Exhandling {
    public static void main(String[] args){
        try {
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("NullPointerExceptionが発生している");
            System.out.println("エラー"+e.getMessage());
        }
    }
}