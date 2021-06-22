public class StopWatch{
	private Long startTime;
	private Long endTime;

	public StopWatch(){
		startTime = System.currentTimeMillis();
	}

	public void stop(){
		endTime = System.currentTimeMillis();
	}
	public Long getElapsedTime(){
		return endTime - startTime;
	}

	public Long getStartTime(){
		return startTime;
	}
	public Long getEndTime(){
		return endTime;
	}
}