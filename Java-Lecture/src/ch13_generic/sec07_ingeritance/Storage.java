package src.ch13_generic.sec07_ingeritance;

public interface Storage<T> {
	public abstract void add(T item, int index);
	public abstract T get(int index);
}