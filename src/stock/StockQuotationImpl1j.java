package stock;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StockQuotationImpl1j implements StockQuotation {
	
	private int currentIt = 0;
	private ArrayList<StockValue> tab = new ArrayList<StockValue>();
	
	

	public StockQuotationImpl1j(String file) {
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

	        for (String line = br.readLine(); line != null; line = br.readLine()) {
	            String[] oneData = line.split(";");
	         
	            tab.add(new StockValueImpl(Long.parseLong(oneData[0]), Double.parseDouble(oneData[1]), Double.parseDouble(oneData[2]),
	            		Double.parseDouble(oneData[3]), Double.parseDouble(oneData[4]), Long.parseLong(oneData[6]) ));
					
	        }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public long getDuration() {
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
		return currentIt < tab.size();
	}

	@Override
	public StockValue next() {
		if(this.hasNext()) {
			return tab.get(currentIt++);
		}
		
		return null;
	}

	@Override
	public StockQuotation getValues() {
		return this;
	}

	@Override
	public void reset() {
		currentIt = 0;
		
	}
	
	

	

}
