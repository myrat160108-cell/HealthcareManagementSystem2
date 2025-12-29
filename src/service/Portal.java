package service;

import model.Freelancer;
import model.JobListing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Portal {

    private List<JobListing> jobs = new ArrayList<>();
    private List<Freelancer> freelancers = new ArrayList<>();

    public void addJob(JobListing job) {
        jobs.add(job);
    }

    public void addFreelancer(Freelancer freelancer) {
        freelancers.add(freelancer);
    }

    public List<JobListing> findJobsByCategory(String category) {
        return jobs.stream()
                .filter(job -> job.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public List<JobListing> filterJobsByBudget(double minBudget) {
        return jobs.stream()
                .filter(job -> job.getBudget() >= minBudget)
                .collect(Collectors.toList());
    }

    public void sortJobsByBudget() {
        jobs.sort(Comparator.comparing(JobListing::getBudget));
    }

    public void showAllJobs() {
        jobs.forEach(System.out::println);
    }

    public void showAllFreelancers() {
        freelancers.forEach(System.out::println);
    }
}
