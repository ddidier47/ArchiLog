package dm.al.m1.s2.stock;

public interface Visitor {

    StockQuotation visitStockQuotation1j(StockQuotationImpl1j sQ);
    StockQuotation visitStockQuotation5j(StockQuotationImpl5j sQ);
    StockQuotation visitCompoundStockQuotation(compoundStockQuotation sQ);

}
