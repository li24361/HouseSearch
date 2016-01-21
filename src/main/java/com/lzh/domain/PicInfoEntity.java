package com.lzh.domain;

public class PicInfoEntity {
    /**
     * <pre>
     * 自增
     * 表字段 : house.pic_info.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 信息info
     * 表字段 : house.pic_info.house_id
     * </pre>
     */
    private Integer houseId;

    /**
     * <pre>
     * 图片地址
     * 表字段 : house.pic_info.pic_url
     * </pre>
     */
    private String picUrl;

    /**
     * <pre>
     * 是否有效
     * 表字段 : house.pic_info.is_vaild
     * </pre>
     */
    private Integer isVaild;

    /**
     * <pre>
     * 获取：自增
     * 表字段：house.pic_info.id
     * </pre>
     *
     * @return house.pic_info.id：自增
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：自增
     * 表字段：house.pic_info.id
     * </pre>
     *
     * @param id
     *            house.pic_info.id：自增
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：信息info
     * 表字段：house.pic_info.house_id
     * </pre>
     *
     * @return house.pic_info.house_id：信息info
     */
    public Integer getHouseId() {
        return houseId;
    }

    /**
     * <pre>
     * 设置：信息info
     * 表字段：house.pic_info.house_id
     * </pre>
     *
     * @param houseId
     *            house.pic_info.house_id：信息info
     */
    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    /**
     * <pre>
     * 获取：图片地址
     * 表字段：house.pic_info.pic_url
     * </pre>
     *
     * @return house.pic_info.pic_url：图片地址
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * <pre>
     * 设置：图片地址
     * 表字段：house.pic_info.pic_url
     * </pre>
     *
     * @param picUrl
     *            house.pic_info.pic_url：图片地址
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
     * <pre>
     * 获取：是否有效
     * 表字段：house.pic_info.is_vaild
     * </pre>
     *
     * @return house.pic_info.is_vaild：是否有效
     */
    public Integer getIsVaild() {
        return isVaild;
    }

    /**
     * <pre>
     * 设置：是否有效
     * 表字段：house.pic_info.is_vaild
     * </pre>
     *
     * @param isVaild
     *            house.pic_info.is_vaild：是否有效
     */
    public void setIsVaild(Integer isVaild) {
        this.isVaild = isVaild;
    }
}