import java.util.List;

interface IMetier<T> {
    public void add(T o);
    public List<T> getAll();
    public T findById(long id);
    public void delete(long id);
}
