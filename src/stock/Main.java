package stock;

public class Main {

	public static void main(String[] args) {
		StockQuotation microsoft  = new StockQuotationImpl1j("microsoft.csv"); 
		 
        StockQuotation it = microsoft.getValues(); 
 
        int time = 0; 
 
        while(it.hasNext()) { 
 
            StockValue stockv = it.next() ; 
 
            StringBuilder st = new StringBuilder(); 
            st.append(time); 
            st.append(" , "); 
            st.append(stockv.begin()); 
            st.append(" , "); 
            st.append(stockv.end()); 
            st.append(" , "); 
            st.append(stockv.low()); 
            st.append(" , "); 
            st.append(stockv.high()); 
            System.out.println(st.toString());  
            time += stockv.getDuration(); 
        } 
    }

}
