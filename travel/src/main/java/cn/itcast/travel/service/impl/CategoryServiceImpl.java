package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.impl.CategoryDaoImpl;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.Category;
import cn.itcast.travel.service.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    private CategoryDaoImpl categoryDaoImpl = new CategoryDaoImpl();

    @Override
    public List<Category> findAll() {
        List<Category> findAll = categoryDaoImpl.findAll();
        return findAll;
    }
}
