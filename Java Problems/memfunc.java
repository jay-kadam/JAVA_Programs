class memfunc
{
    static int count;
    memfunc()
    {
        count++;
    }
    static int objmemfunc()  
    {
        return count;
    }
    public static void main(String[] args)
    {
        memfunc obj1 = new memfunc();
        memfunc obj2 = new memfunc();
        memfunc obj3 = new memfunc();

        int cnt = objmemfunc();
        System.out.println("Number of Objects is: " +cnt);
    }
}
