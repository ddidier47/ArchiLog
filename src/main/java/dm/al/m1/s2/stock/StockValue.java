package dm.al.m1.s2.stock;

/**
 * Etudiants
 * * Dimitri DIDIER
 * * Aguibou BARRY
 */

public interface StockValue extends Cloneable {
	double getDuration();
	double begin();
	double end();
	double low();
	double high();
	double volume();
}
