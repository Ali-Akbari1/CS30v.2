package SimplePhidgets;

import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class TugOfWar 
{
	public static void main(String[] args) throws Exception
	{
		
        //Create | Create objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
		
        
        boolean buttonState = false;
        int greenCounter = 0;
        int redCounter = 0;
        
        
        while(true){
        	
        	if(greenButton.getState() && !buttonState)
        	{
        		greenCounter +=1;
        		System.out.println(greenCounter);
        	}
        	if(redButton.getState() && !buttonState)
        	{
        		redCounter +=1;
        		System.out.println(redCounter);
        	}
        	
        	
        	
            buttonState = greenButton.getState();
            if (greenCounter >= 10) 
            {
              	 redLED.setState(true);
               	 greenLED.setState(true);
               	 Thread.sleep(500);
               	 redLED.setState(false);
               	 greenLED.setState(false);
               	 Thread.sleep(500);
            	 
            	 
            	 
            	 greenLED.setState(true);
            	 Thread.sleep(500);
            	 greenLED.setState(false);
            	 Thread.sleep(500);
            	 greenLED.setState(true);
            	 Thread.sleep(500);
            	 greenLED.setState(false);
            	 Thread.sleep(500);
            	 greenLED.setState(true);
            	 Thread.sleep(500);
            	 greenLED.setState(false);
            	 Thread.sleep(500);
            	 greenLED.setState(true);
            	 Thread.sleep(500);
            	 greenLED.setState(false);
            	 Thread.sleep(500);
            	 greenLED.setState(true);
            	 Thread.sleep(500);
            	 greenLED.setState(false);
            	 Thread.sleep(500);
                 greenCounter = 0;
                 redCounter = 0;
            	 break;
            	 
            }
            
            if (redCounter >=10) 
            {
           	 redLED.setState(true);
           	 greenLED.setState(true);
           	 Thread.sleep(500);
           	 redLED.setState(false);
           	 greenLED.setState(false);
           	 Thread.sleep(500);
           	 
           	 redLED.setState(true);
           	 Thread.sleep(500);
          	 redLED.setState(false);
           	 Thread.sleep(500);
             redLED.setState(true);
             Thread.sleep(500);
          	 redLED.setState(false);
           	 Thread.sleep(500);
           	 redLED.setState(true);
           	 Thread.sleep(500);
          	 redLED.setState(false);
           	 Thread.sleep(500);
           	 redLED.setState(true);
           	 Thread.sleep(500);
          	 redLED.setState(false);
           	 Thread.sleep(500);
           	 redLED.setState(true);
           	 Thread.sleep(500);
          	 redLED.setState(false);
           	 Thread.sleep(500);
             greenCounter = 0;
             redCounter = 0;
           	 break;
           	 
            
            
            
    		
    	}
            
            
            
        }
        
 
}
}
