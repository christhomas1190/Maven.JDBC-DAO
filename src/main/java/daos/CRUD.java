package daos;

import java.util.List;

public interface CRUD<T> {
    void create(T entity);
    T read(int id);
    void update(T Entity);
    void delete(int id);
    List<T> findAll();

}
