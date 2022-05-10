package dm.al.m1.s2.stock;
import java.util.ArrayList;


public interface StockQuotation extends StockValue {
	
	boolean hasNext();
	StockValue next();
	void reset();
	StockQuotation getValues();
	ArrayList<StockValue> getTab();
	// Visitor
	void accept(Visitor v);
}
