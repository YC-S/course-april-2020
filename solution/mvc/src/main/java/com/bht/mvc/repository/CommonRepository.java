package com.bht.mvc.repository;

/**
 * @author shiyuanchen
 * @created 2020/05/11
 * @project mvc
 */
public interface CommonRepository<T> {

    /**
     * save the object
     *
     * @param dao Employee or Department
     * @return the saved Employee or Department
     */
    T save(T dao);

    /**
     * delete the object
     *
     * @param dao Employee or Department
     */

    void delete(T dao);

    /**
     * find the object by id
     *
     * @param id the empid or deptid
     * @return the employee or department
     */
    T findById(String id);


    /**
     * find the collections of the employee or department
     *
     * @return the collections of the employee or department
     */
    Iterable<T> findAll();

    /**
     * delete all the info in the repository
     */
    void deleteAll();
}
