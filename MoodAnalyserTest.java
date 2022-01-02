package Moodanalysisalgorithm;

	import org.junit.Assert;
	import org.junit.Test;

	public class MoodAnalyserTest {

		@Test
		public void sadTest() {
			try {
				Moodanalysis ma = new Moodanalysis();
				String sadmsg = ma.analysemood();
				Assert.assertEquals("SAD", sadmsg);
			}catch(Exception e)
			{
				System.out.println("Happy");
			}

		}

		@Test
		public void happyTest() {
			try {
				Moodanalysis ma = new Moodanalysis("This is a Happy message");
			String happymsg = ma.analysemood();
			Assert.assertEquals("HAPPY", happymsg);
			}catch(Exception e)
			{
				System.out.println("Happy");
			}
		}
		
		@Test
		public void Analysemoodexception()
		{
			try {
				Moodanalysis ma = new Moodanalysis();
				String happymsg = ma.analysemoodexception();
				Assert.assertEquals("Sad", happymsg);
				}catch(MoodAnalysisException e)
				{
					System.out.println("The value is : Happy");
				}
		}

}
