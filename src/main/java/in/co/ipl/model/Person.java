package in.co.ipl.model;

public class Person
{
	    public enum Gender 
		{
		MALE,
		FEMALE
        }

		private String firstName;
		private String secondName;
		private int Age;
		private String place;
		public Gender gender;


		public Person(String firstName, String secondName, int age, String place, Gender gender) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		Age = age;
		this.place = place;
		this.gender = gender;
		}


		public Person() {
			// TODO Auto-generated constructor stub
		}


		public String getFirstName() {
		return firstName;
		}
		public void setFirstName(String firstName) {
		this.firstName = firstName;
		}
		public String getSecondName() {
		return secondName;
		}
		public void setSecondName(String secondName) {
		this.secondName = secondName;
		}
		public int getAge() {
		return Age;
		}
		public void setAge(int age) {
		Age = age;
		}
		public String getPlace() {
		return place;
		}
		public void setPlace(String place) {
		this.place = place;
		}
		public Gender getGender() {
		return gender;
		}
		public void setGender(Gender gender) {
		this.gender = gender;
		}

		public String getFullName() {
		return getFirstName() + getSecondName();
		}




		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return " Name : " + getFirstName() + " " + getSecondName()
		+ " Age : " + getAge()
		+ " Place : " + getPlace();
		}

}
