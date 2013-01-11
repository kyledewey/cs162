public class Boilerplate {
    private final int _x;
    public Boilerplate(int _x) {
	this._x = _x;
    }
    public int x() {
	return _x;
    }
    public boolean equals(Object other) {
	return (other instanceof Boilerplate &&
		_x == ((Boilerplate)other)._x);
    }
    public int hashCode() {
	return _x;
    }
    public Boilerplate copy(int x) {
	return new Boilerplate(x);
    }
    // ... plus several more methods I lost the will to write
}

