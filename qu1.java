class Employee {
    private String ename;
    private String designation;
    private String email;
    private double salary;

   
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void EmployeeDetails() {
        System.out.println(ename + " is a " + designation + " has email id " + email + " and gets salary " + salary);
    }

    
    public void setEmployeeDetails(String ename, String designation, String email, double salary) {
        setEname(ename);
        setDesignation(designation);
        setEmail(email);
        setSalary(salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        
        
        emp.setEmployeeDetails("Tamoghno", "Dev", "tom@ibm.com", 2000);
        
       
        emp.EmployeeDetails();
    }
}