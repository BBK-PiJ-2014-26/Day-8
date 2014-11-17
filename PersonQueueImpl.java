public class PersonQueueImpl implements PersonQueue {

	private Person first = null;
	private Person last = null;

	public void insert(Person person) {
		if (first == null) {
			first = person;
		} else {
			first.setNext(person);
			last = person;
		}
	}

	public Person retrieve() {
		Person result = new Person(first.getName());
		first = first.getNext();
		return result;
	}

}