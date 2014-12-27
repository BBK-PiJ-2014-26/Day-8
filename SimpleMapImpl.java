public class SimpleMapImpl implements SimpleMap {
	private String[] map;

	public SimpleMapImpl(int size) {
		this.map = new String[size];
	}

	public void put(int key, String name) {
		if (this.map[key] == null) {
			this.map[key] = name;
		} else {
			System.out.println("This position on the map is occupied.");
		}
	}

	public String get(int key) {
		String result = null;
		if (this.map[key] == null) {
			result = "Null.";
		} else {
			result = this.map[key];
		}
		return result;
	}

	public void remove(int key) {
		this.map[key] = null;
	}

	public boolean isEmpty() {
		boolean empty = true;
		for(int i = 0; i < this.map.length; i++) {
			if (this.map[i] != null) {
				empty = false;
			}
		}
		return empty;
	}

	public static void main(String[] args) {
		SimpleMap myMap = new SimpleMapImpl(4);
		if (myMap.isEmpty()) {
			System.out.println("True.");
		} else {
			System.out.println("False.");
		}
		myMap.put(1, "Bob");
		myMap.put(3, "Mary");
		if (myMap.isEmpty()) {
			System.out.println("True.");
		} else {
			System.out.println("False.");
		}
		System.out.println(myMap.get(1));
		myMap.remove(1);
		myMap.remove(3);
		if (myMap.isEmpty()) {
			System.out.println("True.");
		} else {
			System.out.println("False.");
		}


	}
}