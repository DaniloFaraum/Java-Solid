package dip;

import java.util.List;

public interface Repository<T> {
	public T create(T t);
	public void update(T t);
	public List<T> retrieve();
	public void delete(T t);
}
