class Employee {

    private double basicSalary;
	
    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
	
    private double computeTax() {
        return 0.10 * basicSalary;
    }

    
    private double computeBonus() {
        return 0.02 * basicSalary;
    }

    
    private double computeTravellingAllowance() {
        return 0.015 * basicSalary;
    }

    
    public double computeAnnualSalary() {
        double monthlySalary = basicSalary + computeBonus() + computeTravellingAllowance();
        double annualSalary = (monthlySalary * 12) - computeTax();
        return annualSalary;
    }

   
    public void showSalaryDetails() {
        System.out.println("Basic Salary: " + getBasicSalary());
        System.out.println("The annual salary of the employee is: " + computeAnnualSalary());
    }

    public static void main(String[] args) {
        Employee emp = new Employee();  
        
        emp.setBasicSalary(50000);
        emp.showSalaryDetails();
    }
}