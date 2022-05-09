package dm.al.m1.s2.stock;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StockQuotationImpl1j implements StockQuotation {
	
	private int currentIt = 0;
	private ArrayList<StockValue> tab = new ArrayList<StockValue>();
	

	public StockQuotationImpl1j(String file) {
		
		try {
			File f = new File(file);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			br.readLine();
			double duration = 0;
	        for (String line = br.readLine(); line != null; line = br.readLine()) {
	            String[] oneData = new String[6]; 
				oneData = line.split(";");
	            tab.add(new StockValueImpl( duration, 
											Double.parseDouble(oneData[1].replace("\"", "").replace(",", ".")), 
											Double.parseDouble(oneData[2].replace("\"", "").replace(",", ".")),
	            							Double.parseDouble(oneData[3].replace("\"", "").replace(",", ".")), 
											Double.parseDouble(oneData[4].replace("\"", "").replace(",", ".")), 
											Double.parseDouble(oneData[5].replace("\"", "")) )
										);
										duration += 1;
					
	        }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public double getDuration() {
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
	public double volume() {
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
