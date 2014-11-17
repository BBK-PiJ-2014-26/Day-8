public class Person {

	private String name;
	private Person next;

	public Person(String name) {
		this.name = name;
		this.next = null;
	}

	public String getName() {
		return name;
	}

	public Person getNext() {
		return next;
	}
	public void setNext(Person person) {
		if (this.next == null) {
			this.next = person;
		} else {
			this.next.setNext(person);
		}
	}
}