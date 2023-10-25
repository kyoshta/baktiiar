package oop.inheritance.relationship;

public class Person {
    private Job job;
    public Person(){
        this.job = new Job();
        job.setName("Google");
        job.setSalary(8000);

    }
    public String toDisplayTheName(){
        return job.getName();
    }
    public double toDisplayTheSalary(){
        return job.getSalary();
    }
    public void toTest(){
        System.out.println(job.toWork());
    }

    @Override
    public String toString() {
        return "Person{" +
                "job=" + job +
                '}';
    }
}
