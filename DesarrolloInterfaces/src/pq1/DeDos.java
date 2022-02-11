package pq1;

public class DeDos implements Series{
	private int start;
	private int val;

	DeDos() {
		start = 0;
		val = 0;
	}

	public int getNext() {
		val += 1;
		return val;
	}

	public void reset() {
		val = 0;
		start = 0;
	}

	public void setStart(int x) {
		start = x;
		val = start;
	}
}
