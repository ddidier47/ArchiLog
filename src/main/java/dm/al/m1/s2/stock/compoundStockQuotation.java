package dm.al.m1.s2.stock;

import java.util.ArrayList;

public class compoundStockQuotation implements StockQuotation {

    private ArrayList<StockQuotation> _group = new ArrayList<>();


    public StockQuotation add(StockQuotation s) {
        if (_group.contains(s)) return this;
        _group.add(s);
        return this;
    }

    public StockQuotation remove(StockQuotation s) {
        _group.remove(s);
        return this;
    }

    public StockQuotation getChild(int n) {
        return _group.get(n);
    }

    @Override
    public double getDuration() {
        for(StockQuotation sQ: _group) 
            for(StockValue sV : sQ.getTab())
                return sV.getDuration();
                
        return 0;
    }

    @Override
    public double begin() {
        double result = 0;
        for(StockQuotation sQ: _group) {
            for(StockValue sV : sQ.getTab())
                result += sV.begin();
        }
        return result;
    }

    @Override
    public double end() {
        double result = 0;
        for(StockQuotation sQ: _group) {
            for(StockValue stock : sQ.getTab()){
                result+=stock.end();
            }
        }
        return result;
    }

    @Override
    public double low() {
        double result = 0;
        for(StockQuotation sQ: _group) {
            for(StockValue sV : sQ.getTab())
                result += sV.low();
        }
        return result;
    }

    @Override
    public double high() {
        double result = 0;
        for(StockQuotation sQ: _group) {
            for(StockValue sV : sQ.getTab())
                result += sV.high();
        }
        return result;
    }

    @Override
    public double volume() {
        double result = 0;
        for(StockQuotation sQ: _group) {
            for(StockValue sV : sQ.getTab())
                result += sV.volume();
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        return ((StockQuotation) _group).hasNext();
    }

    @Override
    public StockValue next() {
        return ((StockQuotation) _group).next();
    }

    @Override
    public void reset() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public StockQuotation getValues() {
        // TODO Auto-generated method stub
        return this;
    }

    @Override
    public ArrayList<StockValue> getTab() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void accept(Visitor v) {
        // TODO Auto-generated method stub
        
    }
    
}
