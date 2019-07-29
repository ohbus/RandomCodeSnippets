public class Hi {
    public void show()  {
        for(int i = 0 ; i < 5 ; i++)    {
            System.out.println("Hi");
        
            try {
                Thread.sleep(500);
            }
            catch(Exception e)  {

            }
        }
    }
}