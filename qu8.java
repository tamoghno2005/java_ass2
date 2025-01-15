import java.util.Scanner;
class Student {
    private int age;

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

 
    public boolean isEligibleToVote() {
        return age >= 18;  
    }
}

class VotingEligibility {
	public static void evaluateVotingEligibility() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student's age: ");
        int age = scanner.nextInt();

        Student student = new Student();
        student.setAge(age);

       
        if (student.isEligibleToVote()) {
            System.out.println("The student is eligible to vote.");
        } else {
            System.out.println("The student is not eligible to vote.");
        }

        scanner.close(); 
    }

    public static void main(String[] args) {
        evaluateVotingEligibility();
    }
}