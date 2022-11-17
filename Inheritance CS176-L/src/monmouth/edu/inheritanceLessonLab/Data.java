package monmouth.edu.inheritanceLessonLab;
public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
	 Measurable[] quizes = new Measurable[5];{
     quizes[0] = new Quiz(95);
     quizes[1] = new Quiz(80);
     quizes[2] = new Quiz(90);
     quizes[3] = new Quiz(50);
     quizes[4] = new Quiz(75);
	 }
     
   public static double average(Measurable[] objects)
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      if (objects.length > 0)
      {
         return sum / objects.length;
      }
      else
      {
         return 0;
      }
      
   }

   /**
      Computes the maximum of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the maximum of the measures, null if array is empty
   */
   public static double max(Measurable[] objects)
   {
      if (objects.length == 0)
      {
         return 0;
      }
      //Measurable max = objects[0];
      double max = 0;
      for (Measurable obj : objects)
      {
         if (obj.getMeasure() > max)
         {
            max = obj.getMeasure();
         }
      }

      return max;
      
      
   }
}
