package garage;

import actors.Garage_Owner;
import java.util.Vector;
import garage.Place;

public class Garage {
	private Object _address;
	public Garage_Owner _owner;
	public Vector<Place> _places = new Vector<Place>();

	public void open() {
		throw new UnsupportedOperationException();
	}

	public void close() {
		throw new UnsupportedOperationException();
	}
}