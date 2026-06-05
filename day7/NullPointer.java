package day7;

public class NullPointer {
    public static void main(String[] args){
        String s = null;
        String s1 = "Bittu";
        try{
        if(s.equals(s1))
        {
            System.out.println("Equal");
        }
    }catch(Exception e){
        System.out.println(e);
    }
    }
}
