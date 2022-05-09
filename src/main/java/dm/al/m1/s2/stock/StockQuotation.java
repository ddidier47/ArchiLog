package dm.al.m1.s2.stock;

public interface StockQuotation extends StockValue {
	boolean hasNext();
	StockValue next();
	void reset();
	StockQuotation getValues();

}
