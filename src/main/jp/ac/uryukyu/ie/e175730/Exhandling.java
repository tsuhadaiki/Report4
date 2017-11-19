package jp.ac.uryukyu.ie.e175730;

public class Exhandling {
    public static void main(String[] args){
        String str = "3．14";
        try {
            double value =Double.parseDouble(str);
        }catch (Exception e){
            System.out.println("エラー"+e.getMessage());
            e.printStackTrace();
        }
    }
}