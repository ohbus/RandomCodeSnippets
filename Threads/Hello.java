public class Hello {
    public void show()  {
        for(int i = 0 ; i < 5 ; i++)    {
            System.out.println("Hello");
        
            try {
                Thread.sleep(500);
            }
            catch(Exception e)  {

            }
        }
    }
}