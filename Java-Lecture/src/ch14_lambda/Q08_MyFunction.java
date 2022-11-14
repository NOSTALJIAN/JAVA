package src.ch14_lambda;

@FunctionalInterface
public interface Q08_MyFunction<T> {
	double apply(T t);
}