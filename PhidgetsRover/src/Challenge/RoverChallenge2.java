package Challenge;

import com.phidget22.DCMotor;
import com.phidget22.DistanceSensor;
import com.phidget22.Net;

public class RoverChallenge2 
{
	
	
	
	
	
	
	
	
	 
    public static boolean checkSonar(DistanceSensor sonar, int time) throws Exception // Checks sonar while rover is moving, boolean used to stop rover
	{
		boolean hit = false;
		
		for (int i = time / 5; i != 0; i--)
		{
			if (sonar.getDistance() < 500)
			{
				hit = true;
				break;
			}
			else
			{
				Thread.sleep(5);
			}
		}
		return hit;
	}
    
	
	
	public static void main(String[] args) throws Exception {

        //Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        //Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();
        DistanceSensor sonar = new DistanceSensor();

        //Address
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        //Open
        leftMotors.open(5000);
        rightMotors.open(5000);
        sonar.open(5000);
        sonar.setDataInterval(100);
        
        
        
        
        
        
        
        for (int i = 4; i != 0; i--)
        {
        	//Go forwards
            leftMotors.setTargetVelocity(-1);
            rightMotors.setTargetVelocity(-1);

            if (checkSonar(sonar, 800) == true) //Continue unless/until checkSonar returns true
            {									//Times to turn 90 and 180 degrees are basically approximated from trial and error and usually end up a bit wrong
            	//Stop
            	leftMotors.setTargetVelocity(0);
                rightMotors.setTargetVelocity(0);
            	Thread.sleep(1000);
            	
            	//Turn roughly 180 degrees
            	leftMotors.setTargetVelocity(-1);
                rightMotors.setTargetVelocity(1);
                Thread.sleep(800);
            }

            //Stop motors
            leftMotors.setTargetVelocity(0);
            rightMotors.setTargetVelocity(0);
            
            Thread.sleep(1000);
        
        
        
        
        
        
        
        
        

        while (true) {

            System.out.println("Distance: " + sonar.getDistance() + " mm");
            
            if (sonar.getDistance() < 200) {
            	
                //Object detected! Stop motors
                leftMotors.setTargetVelocity(0);
                rightMotors.setTargetVelocity(0);
                
                //Wait for 2 second
    	        Thread.sleep(1000);
    	        
    	        
    	        //Turn in one direction
    	        leftMotors.setTargetVelocity(-1);
    	        rightMotors.setTargetVelocity(1);

                
                //Wait for 2 second
    	        Thread.sleep(1000);

    	        //Move forward at full speed
    	        leftMotors.setTargetVelocity(1);
    	        rightMotors.setTargetVelocity(1);
    	        
    	        Thread.sleep(2000);
    	        
            }
            
            
            
            else 
            {
            	
            	//Move forward at full speed
                leftMotors.setTargetVelocity(1);
                rightMotors.setTargetVelocity(1);

                //Wait for 1 second
                Thread.sleep(1750);
                
                //Stop motors
                leftMotors.setTargetVelocity(0);
                rightMotors.setTargetVelocity(0);
                
                //Wait for 2 second
                Thread.sleep(2000);
                
                //Turn in one direction
                leftMotors.setTargetVelocity(-1);
                rightMotors.setTargetVelocity(1);

                //Wait for 2 second
                Thread.sleep(615);
                
                //Stop motors
                leftMotors.setTargetVelocity(0);
                rightMotors.setTargetVelocity(0);
                
                //Wait for 2 second
                Thread.sleep(2000);
                
                
                
               
                
                
                
                
                //2nd TURN
                
                
                
                
                //Move forward at full speed
                leftMotors.setTargetVelocity(1);
                rightMotors.setTargetVelocity(1);

                //Wait for 1 second
                Thread.sleep(1750);
                
                //Stop motors
                leftMotors.setTargetVelocity(0);
                rightMotors.setTargetVelocity(0);
                
                //Wait for 2 second
                Thread.sleep(2000);
                
                //Turn in one direction
                leftMotors.setTargetVelocity(-1);
                rightMotors.setTargetVelocity(1);

                //Wait for 2 second
                Thread.sleep(620);
                
                //Stop motors
                leftMotors.setTargetVelocity(0);
                rightMotors.setTargetVelocity(0);
                
                //Wait for 2 second
                Thread.sleep(2000);
                
                
                
                
                
                
                //
                
                //Move forward at full speed
                leftMotors.setTargetVelocity(1);
                rightMotors.setTargetVelocity(1);

                //Wait for 1 second
                Thread.sleep(1700);
                
                //Stop motors
                leftMotors.setTargetVelocity(0);
                rightMotors.setTargetVelocity(0);
                
                //Wait for 2 second
                Thread.sleep(2000);
                
                //Turn in one direction
                leftMotors.setTargetVelocity(-1);
                rightMotors.setTargetVelocity(1);

                //Wait for 2 second
                Thread.sleep(628);
                
                //Stop motors
                leftMotors.setTargetVelocity(0);
                rightMotors.setTargetVelocity(0); 
                
                
                //Wait for 2 second
                Thread.sleep(2000);
                
                
                //Move forward at full speed
                leftMotors.setTargetVelocity(1);
                rightMotors.setTargetVelocity(1);

                //Wait for 1 second
                Thread.sleep(1959);
                
                //Stop motors
                leftMotors.setTargetVelocity(0);
                rightMotors.setTargetVelocity(0);
            	  
            	
            }
            //Wait for 2 second
            Thread.sleep(150);
            }
}

	}
}
