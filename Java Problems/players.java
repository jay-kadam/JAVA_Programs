interface Player 
{
    void play();
}
  
class Child implements Player 
{
    @Override
    public void play() 
    {
      System.out.println("Child plays with Lego.");
    }
}

class Musician implements Player 
{
    @Override
    public void play() 
    {
      System.out.println("Musician plays a piano.");
    }
}

class Actor implements Player 
{ 
    @Override
    public void play() 
    {
      System.out.println("Actor plays in a film.");
    }
}

public class players 
{
    public static void main(String[] args) 
    {
        Child c = new Child();
        c.play();
  
        Musician m = new Musician();
        m.play();
  
        Actor a = new Actor();
        a.play();
    }
  }  