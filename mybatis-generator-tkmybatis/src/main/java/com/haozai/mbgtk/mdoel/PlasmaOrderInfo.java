package com.haozai.mbgtk.mdoel;

import java.util.Date;
import javax.persistence.*;

@Table(name = "plasma_order_info")
public class PlasmaOrderInfo {
    /**
     * 订单编号
     */
    @Id
    @Column(name = "uk_order_id")
    private String ukOrderId;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 更新时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 创建人
     */
    @Column(name = "gmt_creator_id")
    private String gmtCreatorId;

    /**
     * 更新人
     */
    @Column(name = "gmt_modified_id")
    private String gmtModifiedId;

    /**
     * 订单信息
     */
    @Column(name = "order_info")
    private String orderInfo;

    /**
     * 获取订单编号
     *
     * @return uk_order_id - 订单编号
     */
    public String getUkOrderId() {
        return ukOrderId;
    }

    /**
     * 设置订单编号
     *
     * @param ukOrderId 订单编号
     */
    public void setUkOrderId(String ukOrderId) {
        this.ukOrderId = ukOrderId == null ? null : ukOrderId.trim();
    }

    /**
     * 获取创建时间
     *
     * @return gmt_create - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取更新时间
     *
     * @return gmt_modified - 更新时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置更新时间
     *
     * @param gmtModified 更新时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 获取创建人
     *
     * @return gmt_creator_id - 创建人
     */
    public String getGmtCreatorId() {
        return gmtCreatorId;
    }

    /**
     * 设置创建人
     *
     * @param gmtCreatorId 创建人
     */
    public void setGmtCreatorId(String gmtCreatorId) {
        this.gmtCreatorId = gmtCreatorId == null ? null : gmtCreatorId.trim();
    }

    /**
     * 获取更新人
     *
     * @return gmt_modified_id - 更新人
     */
    public String getGmtModifiedId() {
        return gmtModifiedId;
    }

    /**
     * 设置更新人
     *
     * @param gmtModifiedId 更新人
     */
    public void setGmtModifiedId(String gmtModifiedId) {
        this.gmtModifiedId = gmtModifiedId == null ? null : gmtModifiedId.trim();
    }

    /**
     * 获取订单信息
     *
     * @return order_info - 订单信息
     */
    public String getOrderInfo() {
        return orderInfo;
    }

    /**
     * 设置订单信息
     *
     * @param orderInfo 订单信息
     */
    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo == null ? null : orderInfo.trim();
    }
}