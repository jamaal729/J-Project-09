package com.teamtreehouse.techdegrees.dao;

import com.teamtreehouse.techdegrees.exc.DaoException;
import com.teamtreehouse.techdegrees.model.Todo;

import java.util.List;

public interface TodoDao {

    List<Todo> findAll();
    Todo findById(int id);

    void add(Todo todo) throws DaoException;
    void save(Todo todo) throws DaoException;
    void delete(int id) throws DaoException;

}
