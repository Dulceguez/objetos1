package ar.edu.unlp.info.oo1.ejercicio12;

public class LifoJobScheduler extends JobScheduler {
	@Override
	public JobDescription next() {
		JobDescription nextJob = jobs.get(jobs.size()-1);
        this.unschedule(nextJob);
        return nextJob;
	}
}
