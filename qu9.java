import java.util.Scanner;
class Person {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public boolean isPalindrome() {
        String cleanedName = cleanName(name);

       
        int left = 0;
        int right = cleanedName.length() - 1;

        while (left < right) {
            if (cleanedName.charAt(left) != cleanedName.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }

        return true; 
    }

    public String cleanName(String name) {
        
        StringBuilder cleanedName = new StringBuilder();

       
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);

            
            if (c != ' ') {
                cleanedName.append(Character.toLowerCase(c)); 
            }
        }

        return cleanedName.toString();
    }
}

class PalindromeChecker {

    
    public static void evaluatePalindrome() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a name to check if it is a palindrome: ");
        String nameInput = scanner.nextLine();

        
        if (nameInput.trim().isEmpty()) {
            System.out.println("No name entered. Exiting program.");
            scanner.close();
            return; 
        }

        
        Person person = new Person();
        person.setName(nameInput); 

       
        if (person.isPalindrome()) {
            System.out.println(person.getName() + " is a palindrome.");
        } else {
            System.out.println(person.getName() + " is not a palindrome.");
        }

        scanner.close(); 
    }

    public static void main(String[] args) {
       
        evaluatePalindrome();
    }
}