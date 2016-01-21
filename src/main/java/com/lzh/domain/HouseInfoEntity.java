package com.lzh.domain;

import java.util.Date;

public class HouseInfoEntity {
    /**
     * <pre>
     * 自增ID
     * 表字段 : house.house_info.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 标题
     * 表字段 : house.house_info.title
     * </pre>
     */
    private String title;

    /**
     * <pre>
     * 类型
     * 表字段 : house.house_info.type
     * </pre>
     */
    private String type;

    /**
     * <pre>
     * 房屋价格
     * 表字段 : house.house_info.price
     * </pre>
     */
    private Integer price;

    /**
     * <pre>
     * 联系电话
     * 表字段 : house.house_info.phone
     * </pre>
     */
    private String phone;

    /**
     * <pre>
     * 发布时间
     * 表字段 : house.house_info.pubtime
     * </pre>
     */
    private Date pubtime;

    /**
     * <pre>
     * 页面地址
     * 表字段 : house.house_info.url
     * </pre>
     */
    private String url;

    /**
     * <pre>
     * 获取：自增ID
     * 表字段：house.house_info.id
     * </pre>
     *
     * @return house.house_info.id：自增ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：自增ID
     * 表字段：house.house_info.id
     * </pre>
     *
     * @param id
     *            house.house_info.id：自增ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：标题
     * 表字段：house.house_info.title
     * </pre>
     *
     * @return house.house_info.title：标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * <pre>
     * 设置：标题
     * 表字段：house.house_info.title
     * </pre>
     *
     * @param title
     *            house.house_info.title：标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * <pre>
     * 获取：类型
     * 表字段：house.house_info.type
     * </pre>
     *
     * @return house.house_info.type：类型
     */
    public String getType() {
        return type;
    }

    /**
     * <pre>
     * 设置：类型
     * 表字段：house.house_info.type
     * </pre>
     *
     * @param type
     *            house.house_info.type：类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * <pre>
     * 获取：房屋价格
     * 表字段：house.house_info.price
     * </pre>
     *
     * @return house.house_info.price：房屋价格
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * <pre>
     * 设置：房屋价格
     * 表字段：house.house_info.price
     * </pre>
     *
     * @param price
     *            house.house_info.price：房屋价格
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * <pre>
     * 获取：联系电话
     * 表字段：house.house_info.phone
     * </pre>
     *
     * @return house.house_info.phone：联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * <pre>
     * 设置：联系电话
     * 表字段：house.house_info.phone
     * </pre>
     *
     * @param phone
     *            house.house_info.phone：联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * <pre>
     * 获取：发布时间
     * 表字段：house.house_info.pubtime
     * </pre>
     *
     * @return house.house_info.pubtime：发布时间
     */
    public Date getPubtime() {
        return pubtime;
    }

    /**
     * <pre>
     * 设置：发布时间
     * 表字段：house.house_info.pubtime
     * </pre>
     *
     * @param pubtime
     *            house.house_info.pubtime：发布时间
     */
    public void setPubtime(Date pubtime) {
        this.pubtime = pubtime;
    }

    /**
     * <pre>
     * 获取：页面地址
     * 表字段：house.house_info.url
     * </pre>
     *
     * @return house.house_info.url：页面地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * <pre>
     * 设置：页面地址
     * 表字段：house.house_info.url
     * </pre>
     *
     * @param url
     *            house.house_info.url：页面地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}