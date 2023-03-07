import java.util.ArrayList; 
class Arraylist1 {
    public static void main(String args[])
    {
        ArrayList<String>Animals=new ArrayList();
        Animals.add("happy");
        Animals.add("sad");
        Animals.add("best");
        System.out.println(Animals);
        System.out.println("next ");
        for(String s:Animals)
        {
            System.out.println(s);
        } 
    
   
}
