package ar.edu.unlp.info.oo1.ejercicio12;

public class FifoJobScheduler extends JobScheduler {

	public JobDescription next() {
		 JobDescription nextJob = jobs.get(0);
         this.unschedule(nextJob);
         return nextJob;
	}

}
