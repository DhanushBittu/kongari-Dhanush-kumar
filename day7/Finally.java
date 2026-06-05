package day7;

public class Finally {
    public static void main(String[] args){
        try{
            System.out.println(9/0);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("Error");
        }
    }
    
}
