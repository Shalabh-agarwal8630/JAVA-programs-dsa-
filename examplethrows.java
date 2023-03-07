public class examplethrows {
    static void div ()throws ArithmeticException
    {
        int x=2;
        int y=0;
        int z=x/y;
    }
    public static void main(String args[]){
        try{
            div();
        }
        catch(ArithmeticException e){
            System.out.println("caught the exception"+e);
        }
    }
}
