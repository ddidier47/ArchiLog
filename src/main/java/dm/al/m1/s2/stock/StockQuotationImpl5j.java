package dm.al.m1.s2.stock;

import java.util.ArrayList;

public class StockQuotationImpl5j extends StockQuotationDecorator {

	private int currentIt = 0;
	private ArrayList<StockValue> tab = new ArrayList<StockValue>();
	
	

	public StockQuotationImpl5j(StockQuotation stockQuotation) {
		super(stockQuotation);	
	}


	@Override
	public StockValue next() {
		if(this.hasNext()) {
			StockValue result = tab.get(currentIt);
			currentIt += 5;
			return result;
		}
		
		return null;
	}




}
