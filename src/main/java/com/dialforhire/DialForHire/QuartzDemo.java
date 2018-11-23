package com.dialforhire.DialForHire;

import org.quartz.CronScheduleBuilder;
import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzDemo implements Job{
	
	
	
	public static void main(String[] args) throws SchedulerException {
		 String exp = "0 58 14 ? *  MON";

		    SchedulerFactory factory = new StdSchedulerFactory();
		    Scheduler scheduler = factory.getScheduler();
		    scheduler.start();
		    JobDetail job = JobBuilder.newJob(QuartzDemo.class).build();
		    Trigger trigger = TriggerBuilder.newTrigger()
		                                    .startNow()
		                                    .withSchedule(
		                                         CronScheduleBuilder.cronSchedule(exp))
		                                    .build();
		    scheduler.scheduleJob(job, trigger);
	}

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		 System.out.println("Hello World");
		
	}

}
