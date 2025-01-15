import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
class Address{
	private String street;
	private String city;
	private String pinCode;
}
@Getter
@Setter
@AllArgsConstructor
@ToString
class Person{
	private String name;
	private int age;
	private Address address; 
}
class Detail{
	public static void main(String[]args){
		Address address= new Address("Shaymnagar","Kolkata","700055");
		Person person= new Person("Tamoghno",21,address);
	System.out.println(person);
	}
}
		
	