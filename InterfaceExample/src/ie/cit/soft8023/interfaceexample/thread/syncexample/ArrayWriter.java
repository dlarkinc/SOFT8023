package ie.cit.soft8023.interfaceexample.thread.syncexample;

import java.lang.Runnable;

// Adds integers to an array shared with other Runnables
public class ArrayWriter implements Runnable
{
   private final SimpleArray sharedSimpleArray;
   private final int startValue;

   public ArrayWriter( int value, SimpleArray array )
   {
      startValue = value;
      sharedSimpleArray= array;
   } // end constructor

   public void run() 
   {
      for ( int i = startValue; i < startValue + 3; i++ )
      {
         sharedSimpleArray.add( i ); // add an element to the shared array
		 try{
		 Thread.sleep(2000);
		 }catch (InterruptedException e) {e.printStackTrace();}
      } // end for
   } // end method run
} // end class ArrayWriter
