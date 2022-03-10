package com.loadapi.laodapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="loading")
public class loads {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long shipid;
	@Column(name="date")
	private long date;
	@Column(name="comments")
	private String comment;
	@Column(name="weight")
	private float weight;
	@Column(name="No of Trucks")
	private int nooftrucks;
	@Column(name="Product Type")
	private String producttype;
	@Column(name="Unloading Point")
	private String unloadingPoint;
	@Column(name="Loading Point")
	private String loadingPoint;
	public loads(long shipid, long date, String comment, float weight, int nooftrucks, String producttype,
			String unloadingPoint, String loadingPoint) {
		super();
		this.shipid = shipid;
		this.date = date;
		this.comment = comment;
		this.weight = weight;
		this.nooftrucks = nooftrucks;
		this.producttype = producttype;
		this.unloadingPoint = unloadingPoint;
		this.loadingPoint = loadingPoint;
	}
	public loads(String string, int i, String string2, int j, int k, String string3, String string4, String string5, String string6) {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getShipid() {
		return shipid;
	}
	public void setShipid(Long shipid) {
		this.shipid = shipid;
	}
	public long getDate() {
		return date;
	}
	public void setDate(long date) {
		this.date = date;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getNooftrucks() {
		return nooftrucks;
	}
	public void setNooftrucks(int nooftrucks) {
		this.nooftrucks = nooftrucks;
	}
	public String getProducttype() {
		return producttype;
	}
	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	@Override
	public String toString() {
		return "loads [shipid=" + shipid + ", date=" + date + ", comment=" + comment + ", weight=" + weight
				+ ", nooftrucks=" + nooftrucks + ", producttype=" + producttype + ", unloadingPoint=" + unloadingPoint
				+ ", loadingPoint=" + loadingPoint + "]";
	}
	
}
