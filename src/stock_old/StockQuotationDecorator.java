package stock;

public abstract class StockQuotationDecorator implements StockQuotation {

	@Override
	public long getDuration() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double begin() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double end() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double low() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double high() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long volume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public StockValue next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StockQuotation getValues() {
		// TODO Auto-generated method stub
		return null;
	}

}
