package com.lzh.persistence;

import com.lzh.domain.PicInfoEntity;

public interface PicInfoDao {
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
    int insert(PicInfoEntity record);

    /**
     *
     * @param record
     */
    int insertSelective(PicInfoEntity record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    PicInfoEntity selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(PicInfoEntity record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(PicInfoEntity record);
}