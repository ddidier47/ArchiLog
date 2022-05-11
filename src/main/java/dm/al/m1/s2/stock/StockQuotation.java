package dm.al.m1.s2.stock;
import java.util.ArrayList;

/**
 * Etudiants
 * * Dimitri DIDIER
 * * Aguibou BARRY
 */

public interface StockQuotation extends StockValue {
	// Iterator
	boolean hasNext();
	StockValue next();
	StockQuotation getValues();
	ArrayList<StockValue> getStockValues();
	// Visitor
	void accept(Visitor v);
}
