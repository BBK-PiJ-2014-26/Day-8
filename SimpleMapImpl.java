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

}