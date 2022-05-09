package dm.al.m1.s2;

import dm.al.m1.s2.stock.StockQuotation;
import dm.al.m1.s2.stock.StockQuotationImpl1j;
import dm.al.m1.s2.stock.StockQuotationImpl5j;
import dm.al.m1.s2.stock.StockValue;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */

    public static void main(String[] args) {
        StockQuotation microsoft  = new StockQuotationImpl1j("MICROSOFT.csv");

        StockQuotation it = microsoft.getValues();

        int time = 0;

        while (it.hasNext()) {

            StockValue stockv = it.next();

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
