package com.si.practice.dbpractice.infrature.mysql.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table demand_order
 */
public class DemandOrder implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demand_order.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demand_order.passenger
     *
     * @mbg.generated
     */
    private String passenger;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demand_order.prod_id
     *
     * @mbg.generated
     */
    private Long prodId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demand_order.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demand_order.dirver_id
     *
     * @mbg.generated
     */
    private Long dirverId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demand_order.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demand_order.created
     *
     * @mbg.generated
     */
    private Date created;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demand_order.updated
     *
     * @mbg.generated
     */
    private Date updated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demand_order.version
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table demand_order
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demand_order.id
     *
     * @return the value of demand_order.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demand_order.id
     *
     * @param id the value for demand_order.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demand_order.passenger
     *
     * @return the value of demand_order.passenger
     *
     * @mbg.generated
     */
    public String getPassenger() {
        return passenger;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demand_order.passenger
     *
     * @param passenger the value for demand_order.passenger
     *
     * @mbg.generated
     */
    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demand_order.prod_id
     *
     * @return the value of demand_order.prod_id
     *
     * @mbg.generated
     */
    public Long getProdId() {
        return prodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demand_order.prod_id
     *
     * @param prodId the value for demand_order.prod_id
     *
     * @mbg.generated
     */
    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demand_order.status
     *
     * @return the value of demand_order.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demand_order.status
     *
     * @param status the value for demand_order.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demand_order.dirver_id
     *
     * @return the value of demand_order.dirver_id
     *
     * @mbg.generated
     */
    public Long getDirverId() {
        return dirverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demand_order.dirver_id
     *
     * @param dirverId the value for demand_order.dirver_id
     *
     * @mbg.generated
     */
    public void setDirverId(Long dirverId) {
        this.dirverId = dirverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demand_order.deleted
     *
     * @return the value of demand_order.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demand_order.deleted
     *
     * @param deleted the value for demand_order.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demand_order.created
     *
     * @return the value of demand_order.created
     *
     * @mbg.generated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demand_order.created
     *
     * @param created the value for demand_order.created
     *
     * @mbg.generated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demand_order.updated
     *
     * @return the value of demand_order.updated
     *
     * @mbg.generated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demand_order.updated
     *
     * @param updated the value for demand_order.updated
     *
     * @mbg.generated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demand_order.version
     *
     * @return the value of demand_order.version
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demand_order.version
     *
     * @param version the value for demand_order.version
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demand_order
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DemandOrder other = (DemandOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPassenger() == null ? other.getPassenger() == null : this.getPassenger().equals(other.getPassenger()))
            && (this.getProdId() == null ? other.getProdId() == null : this.getProdId().equals(other.getProdId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDirverId() == null ? other.getDirverId() == null : this.getDirverId().equals(other.getDirverId()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getUpdated() == null ? other.getUpdated() == null : this.getUpdated().equals(other.getUpdated()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demand_order
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPassenger() == null) ? 0 : getPassenger().hashCode());
        result = prime * result + ((getProdId() == null) ? 0 : getProdId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDirverId() == null) ? 0 : getDirverId().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getUpdated() == null) ? 0 : getUpdated().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return result;
    }
}