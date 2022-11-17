package monmouth.edu.inheritanceLessonLab;

public class Quiz implements Measurable
		{
		private double score;
		
		public Quiz(double aScore)
		{
		score = aScore;
		
	
		}
		public double getScore()
		{
		return score;
		}
		@Override
		public double getMeasure() {
			return score;
			// TODO Auto-generated method stub
			
		}	

	}


