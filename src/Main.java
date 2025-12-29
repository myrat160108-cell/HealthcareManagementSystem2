import model.Freelancer;
import model.JobListing;
import service.Portal;

public class Main {
    public static void main(String[] args) {

        Portal portal = new Portal();

        portal.addFreelancer(new Freelancer(1, "Alex", "Java", 3));
        portal.addFreelancer(new Freelancer(2, "Maria", "Design", 5));

        portal.addJob(new JobListing(1, "Backend API", "IT", 2000));
        portal.addJob(new JobListing(2, "Logo Design", "Design", 400));
        portal.addJob(new JobListing(3, "Website Development", "IT", 1200));

        portal.showAllJobs();
    }
}
