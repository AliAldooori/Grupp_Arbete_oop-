package Grupp_inlämning_oop;

public class Time {
	
	double start_time ;
	double final_time ;

	
	
	


	@Override
	public String toString() {
		return "Time [start_time=" + start_time + ", final_time=" + final_time + "]";
	}

	public Time(double start_time, double final_time) {
	
		this.start_time = start_time;
		this.final_time = final_time;
		
	}
	
	public double Total_Time () {
		
		return (this.getfinal_time() - this.getstart_time()   ) ;
		
	}


	public double getstart_time() {
		return start_time;
	}


	public void setstart_time(double start_time) {
		this.start_time = start_time;
	}


	public double getfinal_time() {
		return final_time;
	}


	public void setfinal_time(double final_time) {
		this.final_time = final_time;
	}


	

}
