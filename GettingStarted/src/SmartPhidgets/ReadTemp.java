package SmartPhidgets;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class ReadTemp {
    public static void main(String[] args) throws Exception{

        //Create 
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Use your Phidgets 
        while(true){
            System.out.println("Humidity: " + humiditySensor.getHumidity() +" %RH, Temperature: " + temperatureSensor.getTemperature() + " °C" );
            Thread.sleep(150);
        
        
       
        
        if (humiditySensor.getHumidity() < 30) 
        {
        	System.out.println("Humidity is too low");
        }
        
        else 
        {
        	System.out.println("Humidity: " + humiditySensor.getHumidity() +" %RH ");
        }
        
        
        
        
        if(temperatureSensor.getTemperature() < 21) 
        {
        	System.out.println("Room is too cold");
        }
        
        
        else 
        {
        	System.out.println(temperatureSensor.getTemperature() + " °C" );
        }
        
        
        }
    }
}