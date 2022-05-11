package dm.al.m1.s2.stock;

import java.util.ArrayList;

/**
 * Etudiants
 * * Dimitri DIDIER
 * * Aguibou BARRY
 */

public class StockQuotationImplBadValues extends StockQuotationDecorator {

	public StockQuotationImplBadValues(StockQuotation stockQuotation) {
		super(stockQuotation);
		int i = 0;
		ArrayList<StockValue> tab2 = stockQuotation.getStockValues();
		while(i<tab2.size()){
			
			StockValue stockv = tab2.get(i);

			double newValueLow = stockv.low();
			double newValueHigh = stockv.high();

			

			if(newValueLow<=0){
				if(i!=0 && i!=tab2.size()-1){
					newValueLow = (tab2.get(i-1).low()+tab2.get(i+1).low())/2;

				}else if (i==tab2.size()-1){
					newValueLow = tab2.get(i-1).low();
				}else{
					newValueLow = tab2.get(i+1).low();
				}
			}

			if(newValueHigh<=0){
				if(i!=0 && i!=tab2.size()-1){

					newValueHigh = (tab2.get(i-1).high()+tab2.get(i+1).high())/2;

				}else if (i==tab2.size()-1){
					newValueHigh = tab2.get(i-1).high();
				}else{
					newValueHigh = tab2.get(i+1).high();
				}

			}

			stockValues.add(new StockValueImpl(stockv.getDuration(),
										stockv.begin(),
										stockv.end(),
										newValueLow,
										newValueHigh,
										stockv.volume()));
			
			i++;
			
		}
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
