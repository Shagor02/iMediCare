package kucse.project.imedicare;

import java.util.Random;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;
import android.content.Context;

public class MuscleExercise extends Activity implements SensorEventListener{
	
	SensorManager sm;
	  TextView tv;
	  int i=0;
	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	   super.onCreate(savedInstanceState);
	   setContentView(R.layout.muscle_exercise);
	   tv=(TextView)findViewById(R.id.textView1);
	  
	   sm=(SensorManager)this.getSystemService(Context.SENSOR_SERVICE);

	 sm.registerListener(this,sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
	SensorManager.SENSOR_DELAY_NORMAL);
	  }

	  @Override
	  public void onAccuracyChanged(Sensor sensor, int accuracy)
	  {
	   
	  }
	 
	  @Override
	  public void onSensorChanged(SensorEvent event)
	  {
	   if(event.sensor.getType()==Sensor.TYPE_ACCELEROMETER)
	   {
	    //get x, y, z values
	    float value[]=event.values;
	    float x=value[0];
	    float y=value[1];
	    float z=value[2];
	    
	   float asr=(x*x+y*y+z*z)/(SensorManager.GRAVITY_EARTH*
	SensorManager.GRAVITY_EARTH);
	 
	   if(asr>=2)
	     {
	     
	      
	      ++i;
	      tv.setText(""+i);
	     }
	    }
	  } 
	

}
