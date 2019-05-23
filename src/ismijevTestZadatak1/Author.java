package ismijevTestZadatak1;

public class Author {
	
	// stanje objekta
	private String name;
	private String email;
	private char gender;
	
	// konstruktori
	
	Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	// gettri, setteri i toString
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "[Name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
}
