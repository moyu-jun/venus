package com.junmoyu.venus.example.single.boot.service;

import com.junmoyu.venus.example.single.boot.model.entity.SingleBootTable;
import lombok.NonNull;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author moyu.jun
 * @date 2022/3/17
 */
public interface SingleBootTableService {

    /**
     * 获取单个数据
     *
     * @param id 主键
     * @return {@link SingleBootTable}
     */
    SingleBootTable getObject(@NonNull Long id);

    /**
     * 添加数据
     *
     * @param singleBootTable 数据对象
     */
    void addObject(@NonNull SingleBootTable singleBootTable);

    /**
     * 删除数据
     *
     * @param id 主键
     */
    void delete(@NonNull Long id);

    /**
     * 更新数据
     *
     * @param singleBootTable 数据对象
     */
    void update(@NonNull SingleBootTable singleBootTable);
}
