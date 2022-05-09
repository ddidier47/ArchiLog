package dm.al.m1.s2.stock;

public interface StockValue extends Cloneable {
	double getDuration();
	double begin();
	double end();
	double low();
	double high();
	double volume();
}
