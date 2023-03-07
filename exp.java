 class exp
{   int t;
    public static void update(int marks[])
    {   int t=10;
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[ ])
    {
        int marks[]={ 97,98,99};
        exp obj=new exp();
        obj.t=5;
        update (marks);
        System.out.println(marks);
    }
}