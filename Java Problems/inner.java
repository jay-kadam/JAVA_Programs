class inner 
{
    class Animal
    {
        void Eating()
        {
            System.out.println("Eating Habits");
        }

    }
    public static void main(String args[]) 
    {
        inner ob= new inner();
        inner.Animal an= ob.new Animal();
        an.Eating();   
    }
}