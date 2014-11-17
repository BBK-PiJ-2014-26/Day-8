public class Supermarket {

	private PersonQueue myQueue = new PersonQueueImpl();

	public void addPerson(Person person) {
		myQueue.insert(person);
	}

	public Person servePerson() {
		return myQueue.retrieve();
	}

}