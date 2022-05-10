package dm.al.m1.s2.stock;

public abstract class StockQuotationDecorator implements StockQuotation {
	
	private StockQuotation _stockQuotation;


	public StockQuotationDecorator(StockQuotation stockQuotation) {
		_stockQuotation = stockQuotation;
	}

	@Override
	public double getDuration() {
		return _stockQuotation.getDuration();
	}

	@Override
	public double begin() {
		return _stockQuotation.begin();
	}

	@Override
	public double end() {
		return _stockQuotation.end();
	}

	@Override
	public double low() {
		return _stockQuotation.low();
	}

	@Override
	public double high() {
		return _stockQuotation.high();
	}

	@Override
	public double volume() {
		return _stockQuotation.volume();
	}

	@Override
	public boolean hasNext() {
		return _stockQuotation.hasNext();
	}

	@Override
	public StockValue next() {
		return _stockQuotation.next();
	}

	@Override
	public StockQuotation getValues() {
		return _stockQuotation.getValues();
	}

}
