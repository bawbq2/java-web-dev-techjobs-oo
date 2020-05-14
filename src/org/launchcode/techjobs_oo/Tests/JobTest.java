package org.launchcode.techjobs_oo.Tests;

import jdk.jfr.StackTrace;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job test_job;
    Job test_job_2;
    Job test_job_3;
    Job test_job_4;
    @Before
    public void createJobObjects(){
        test_job = new Job();
        test_job_2 = new Job();
        test_job_3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        test_job_4 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

    }
    @Test
    public void emptyTest(){
        assertEquals(10,10,0.001);
    }

    @Test
    public void testSettingJobId(){
        assertFalse(test_job.getId() == test_job_2.getId());
        assertTrue(test_job.getId() - test_job_2.getId() == -1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(test_job_3.getEmployer() instanceof Employer);
        assertTrue(test_job_3.getPositionType() instanceof PositionType);
        assertTrue(test_job_3.getLocation() instanceof Location);
        assertTrue(test_job_3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(test_job_3.getName(),"Product Tester");
        assertEquals(test_job_3.getEmployer().getValue(), "ACME");
        assertEquals(test_job_3.getLocation().getValue(),"Desert");
        assertEquals(test_job_3.getPositionType().getValue(), "Quality Control");
        assertEquals(test_job_3.getCoreCompetency().getValue(), "Persistence");

    }

    @Test
    public void testJobsForEquality(){
        assertFalse(test_job_3.equals(test_job_4));
    }
}
