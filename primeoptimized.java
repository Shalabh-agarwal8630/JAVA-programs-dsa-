class op
{
    static boolean isprime(int n)
{
    if(n<2)
    return false;
    if(n==2)
    return true;
    
    for(int i=2;i*i<=n;i++)
    {
    if(n%i==0)
    return false;
    }
    return true;

}
}

class primeoptimized {
    public static void main(String args[])
    {
        System.out.println(op.isprime(19));
    }
}
