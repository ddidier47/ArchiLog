package dm.al.m1.s2.stock;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StockQuotationImpl1j implements StockQuotation {
	
	private int _currentIndex = 0;
	private ArrayList<StockValue> _stockValues = new ArrayList<StockValue>();
	

	public StockQuotationImpl1j(String file) {
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			br.readLine();
			double duration = 0;
	        for (String line = br.readLine(); line != null; line = br.readLine()) {
	            String[] oneData = line.split(";");
	            _stockValues.add(new StockValueImpl( duration, 
											Double.parseDouble(oneData[1].replace("\"", "").replace(",", ".")), 
											Double.parseDouble(oneData[2].replace("\"", "").replace(",", ".")),
											Double.parseDouble(oneData[3].replace("\"", "").replace(",", ".")), 
											Double.parseDouble(oneData[4].replace("\"", "").replace(",", ".")), 
											Double.parseDouble(oneData[5].replace("\"", "")) )
										  );
				duration += 1;		
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	@Override
	public double getDuration() {
		return 0;
	}

	@Override
	public double begin() {
		return 0;
	}

	@Override
	public double end() {
		return 0;
	}

	@Override
	public double low() {
		return 0;
	}

	@Override
	public double high() {
		return 0;
	}

	@Override
	public double volume() {
		return 0;
	}

	@Override
	public boolean hasNext() {
		return _currentIndex < _stockValues.size();
	}

	@Override
	public StockValue next() {
		if(this.hasNext())
			return _stockValues.get(_currentIndex++);
		
		return null;
	}

	@Override
	public StockQuotation getValues() {
		return this;
	}


	@Override
	public ArrayList<StockValue> getStockValues() {
		return _stockValues;
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub	
	}

}
