package stopwatch;
public class StopWatch {
	private long st_time = 0;
	public StopWatch(){
		
	}
	public void start(){
		this.st_time = System.currentTimeMillis();
	}
	
	public void stop(){
		System.out.println("Time took : " + (System.currentTimeMillis() - st_time));
	}
}
