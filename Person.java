public class Person implements PersonQueue {

	private String name;
	private Person next;
	public static Person first = null;
	public static Person last = null;

	public Person(String name) {
		this.name = name;
		this.next = null;
	}

	public String getName() {
		return name;
	}

	public void launch(Person person) {
		if (this.next == null) {
			this.next = person;
			first = this;
			last = person;
		} else {
			System.out.println("Invalid entry.");
		}
	}

	public void insert(Person person) {
		if (this.next == null) {
			this.next = person;
			last = person;
		} else {
			this.next.insert(person);
		}
	}

	public Person retrieve() {
		Person result = new Person(first.getName());
		first = first.next;
		return result;
	}


}