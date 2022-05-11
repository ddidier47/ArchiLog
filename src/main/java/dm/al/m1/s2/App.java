package dm.al.m1.s2;

import dm.al.m1.s2.stock.StockQuotation;
import dm.al.m1.s2.stock.StockQuotationImpl1j;
import dm.al.m1.s2.stock.StockQuotationImpl5j;
import dm.al.m1.s2.stock.StockQuotationImplBadValues;
import dm.al.m1.s2.stock.StockValue;
import dm.al.m1.s2.stock.compoundStockQuotation;

/**
 * Etudiants
 * * Dimitri DIDIER
 * * Aguibou BARRY
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        //StockQuotation microsoft  = new StockQuotationImpl1j("MICROSOFT.csv");
        // StockQuotation microsoft = new StockQuotationImpl1j("MICROSOFT.csv");
        // microsoft = new StockQuotationImplBadValues(microsoft);

        // StockQuotation it = microsoft.getValues();

        int time = 0;

        // while (it.hasNext()) {

        //     StockValue stockv = it.next();

        //     StringBuilder st = new StringBuilder();
        //     st.append(time);
        //     st.append(" , ");
        //     st.append(stockv.begin());
        //     st.append(" , ");
        //     st.append(stockv.end());
        //     st.append(" , ");
        //     st.append(stockv.low());
        //     st.append(" , ");
        //     st.append(stockv.high());
        //     System.out.println(st.toString());
        //     time += stockv.getDuration();
        // }

        compoundStockQuotation porteFeuille = new compoundStockQuotation();
        compoundStockQuotation sante = new compoundStockQuotation();
        compoundStockQuotation industrie = new compoundStockQuotation();
        
        StockQuotation sanofi = new StockQuotationImpl1j("SANOFI.csv");
        sanofi = new StockQuotationImplBadValues(sanofi);

        StockQuotation it2 = sanofi.getValues();
        
        time = 0;

        while (it2.hasNext()) {

            StockValue stockv = it2.next();

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
            
        sante.add(sanofi);

        StockQuotation genfit = new StockQuotationImpl1j("GENFIT.csv");
        genfit = new StockQuotationImplBadValues(genfit);

        StockQuotation it3 = genfit.getValues();
        
        time = 0;

        while (it3.hasNext()) {

            StockValue stockv = it3.next();

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

        sante.add(genfit);

        porteFeuille.add(sante);

        StockQuotation airbus = new StockQuotationImpl1j("AIRBUS.csv");
        airbus = new StockQuotationImplBadValues(airbus);

        StockQuotation it4 = airbus.getValues();
        
        time = 0;

        while (it4.hasNext()) {

            StockValue stockv = it4.next();

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

        sante.add(airbus);

        StockQuotation bouygues = new StockQuotationImpl1j("BOUYGUES.csv");
        bouygues = new StockQuotationImplBadValues(bouygues);

        StockQuotation it5 = bouygues.getValues();
        
        time = 0;

        while (it5.hasNext()) {

            StockValue stockv = it5.next();

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

        sante.add(bouygues);

        porteFeuille.add(industrie);

    }

}
