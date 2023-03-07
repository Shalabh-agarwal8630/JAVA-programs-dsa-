import java.util.ArrayList;
class arraylistremove {
    public static void main(String args[])
    {
        int n=5;
        ArrayList<Integer>arr=new ArrayList<Integer>(n);
        for(int i=0;i<n;i++)
        {
            arr.add(i);
        }
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+ " ");
        }
    }
}
