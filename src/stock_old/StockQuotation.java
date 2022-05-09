package stock;

import java.util.Iterator;

public interface StockQuotation extends StockValue {
	boolean hasNext();
	StockValue next();
	void reset();
	StockQuotation getValues();

}
