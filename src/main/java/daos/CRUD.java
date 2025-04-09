package daos;

import models.PlayerMethods;

import java.util.List;

public interface CRUD<T> {
    T findById(int id);
    void create(T entity);
    T update(T Entity);
    void delete(int id);
    List<T> findAll();

}
