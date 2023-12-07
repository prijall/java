class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }
/*  public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    } 
 */
   
    public double calculateBonus() {
        
        return salary * 0.2; 
    }

    public void generatePerformanceReport() {
        System.out.println("Generating performance report for " + name + "...");
       
    }

    public void manageProject() {
        System.out.println(jobTitle + " " + name + " is managing the project...");
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }
 // Manager-specific methods or override

    @Override
    public double calculateBonus() {
        // Override to calculate manager's bonus differently, for example:
        return getSalary() * 0.15; // 15% of salary for managers
    }

    // Additional methods or overrides specific to Manager
}

class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    // Developer-specific methods or overrides
    // Additional methods or overrides specific to Developer
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    // Programmer-specific methods or overrides
    // Additional methods or overrides specific to Programmer
}


