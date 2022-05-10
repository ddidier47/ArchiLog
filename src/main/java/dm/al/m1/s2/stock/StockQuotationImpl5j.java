package dm.al.m1.s2.stock;

import java.util.ArrayList;

public class StockQuotationImpl5j extends StockQuotationDecorator {

	private int currentIt = 0;

	public StockQuotationImpl5j(StockQuotation stockQuotation) {
		super(stockQuotation);	
	}


	@Override
	public StockValue next() {
		if(this.hasNext()) {
			StockValue result = super.getValues().getStockValues().get(currentIt);
			currentIt += 5;
			return result;
		}
		
		return null;
	}


	@Override
	public ArrayList<StockValue> getStockValues() {
		return super.getValues().getStockValues();
	}


	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

}
