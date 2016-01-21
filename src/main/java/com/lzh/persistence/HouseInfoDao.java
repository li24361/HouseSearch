package com.lzh.persistence;

import com.lzh.domain.HouseInfoEntity;

public interface HouseInfoDao {
    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(HouseInfoEntity record);

    /**
     *
     * @param record
     */
    int insertSelective(HouseInfoEntity record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    HouseInfoEntity selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(HouseInfoEntity record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(HouseInfoEntity record);
}