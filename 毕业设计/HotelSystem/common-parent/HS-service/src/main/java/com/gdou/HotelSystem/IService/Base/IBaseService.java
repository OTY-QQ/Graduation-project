package com.gdou.HotelSystem.IService.Base;

public interface IBaseService<T> {
    public T findById(Integer id);
    public int deleteById(Integer id);
    public int update(T t);
    public int insert(T t);
}
