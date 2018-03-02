package cu.datys.patterns.gof.behavioral.observer.auction;

public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
