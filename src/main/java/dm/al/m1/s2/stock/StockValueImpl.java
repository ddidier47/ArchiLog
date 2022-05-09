package dm.al.m1.s2.stock;

public class StockValueImpl implements StockValue {
	
//	private long _duration;
//	private double _begin;
//	private double _end;
//	private double _low;
//	private double _heigh;
//	private long _volume;
	private double[] _table = new double [6];
	
	

	public StockValueImpl(double duration, double begin, double end, double low, double heigh, double volume) {
		_table[0] = duration;
		_table[1] = begin;
		_table[2] = end;
		_table[3] = low;
		_table[4] = heigh;
		_table[5] = volume;
	}

	@Override
	public double getDuration() {
		return _table[0];
	}

	@Override
	public double begin() {
		return _table[1];
	}

	@Override
	public double end() {
		return _table[2];
	}

	@Override
	public double low() {
		return _table[3];
	}

	@Override
	public double high() {
		return _table[4];
	}

	@Override
	public double volume() {
		return _table[5];
	}

	public double[] get_table() {
		return _table;
	}

}
