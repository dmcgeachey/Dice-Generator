import java.io.*;
import java.util.Random;


public class dice {
    
    	public int randomInt;
        public int diceRequired;


    public void D20()
    throws IOException{
         int option;
        
        BufferedReader input;input = new BufferedReader
                      (new InputStreamReader(System.in));
                   
             Random randomGenerator = new Random();
             randomInt = randomGenerator.nextInt(20) + 1;
              System.out.println("You Rolled: " + randomInt);
              System.out.println("");
    }
    
    public void D12()
    throws IOException{
         int option;
        
        BufferedReader input;input = new BufferedReader
                              (new InputStreamReader(System.in));

            
             Random randomGenerator = new Random();
              randomInt = randomGenerator.nextInt(12) + 1;
              System.out.println("You Rolled: " + randomInt);
              System.out.println("");
    }
    
    public void D100()
    throws IOException{
         int option;
        
        BufferedReader input;input = new BufferedReader
                              (new InputStreamReader(System.in));

             Random randomGenerator = new Random();
	    
	      randomInt = randomGenerator.nextInt(100) + 1;
              System.out.println("You Rolled: " + randomInt);
              System.out.println("");
    }
    
    public void D10()
    throws IOException{
         int option;
        
        BufferedReader input;input = new BufferedReader
                              (new InputStreamReader(System.in));

             Random randomGenerator = new Random();
	   
	      randomInt = randomGenerator.nextInt(10) + 1;
              System.out.println("You Rolled: " + randomInt);
              System.out.println("");
    }
    
    public void D8()
    throws IOException{
         int option;
        
        BufferedReader input;input = new BufferedReader
                              (new InputStreamReader(System.in));

             Random randomGenerator = new Random();
	      randomInt = randomGenerator.nextInt(8) + 1;
              System.out.println("You Rolled: " + randomInt);
              System.out.println("");
    }
    
    public void D6()
    throws IOException{
         int option;
        
        BufferedReader input;input = new BufferedReader
                              (new InputStreamReader(System.in));
        
             Random randomGenerator = new Random();
	      randomInt = randomGenerator.nextInt(6) + 1;
              System.out.println("You Rolled: " + randomInt);
              System.out.println("");
    }
    
    public void D4()
    throws IOException{
         int option;
        
        BufferedReader input;input = new BufferedReader
                              (new InputStreamReader(System.in));

             Random randomGenerator = new Random();
	      randomInt = randomGenerator.nextInt(4) + 1;
              System.out.println("You Rolled: " + randomInt);
              System.out.println("");
    }
    
    public void D3()
    throws IOException{
         int option;
        
        BufferedReader input;input = new BufferedReader
                              (new InputStreamReader(System.in));
             Random randomGenerator = new Random();
	      randomInt = randomGenerator.nextInt(3) + 1;
              System.out.println("You Rolled: " + randomInt);
              System.out.println("");
    }
}
