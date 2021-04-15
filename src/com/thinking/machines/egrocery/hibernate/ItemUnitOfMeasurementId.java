package com.thinking.machines.egrocery.hibernate;
// Generated 16 Jan, 2018 9:36:23 PM by Hibernate Tools 4.3.1.Final

/**
 * ItemUnitOfMeasurementId generated by hbm2java
 */
public class ItemUnitOfMeasurementId implements java.io.Serializable {

	private int itemCode;
	private int unitOfMeasurementCode;
	private int brandCode;

	public ItemUnitOfMeasurementId() {
	}

	public ItemUnitOfMeasurementId(int itemCode, int unitOfMeasurementCode, int brandCode) {
		this.itemCode = itemCode;
		this.unitOfMeasurementCode = unitOfMeasurementCode;
		this.brandCode = brandCode;
	}

	public int getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public int getUnitOfMeasurementCode() {
		return this.unitOfMeasurementCode;
	}

	public void setUnitOfMeasurementCode(int unitOfMeasurementCode) {
		this.unitOfMeasurementCode = unitOfMeasurementCode;
	}

	public int getBrandCode() {
		return this.brandCode;
	}

	public void setBrandCode(int brandCode) {
		this.brandCode = brandCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ItemUnitOfMeasurementId))
			return false;
		ItemUnitOfMeasurementId castOther = (ItemUnitOfMeasurementId) other;

		return (this.getItemCode() == castOther.getItemCode())
				&& (this.getUnitOfMeasurementCode() == castOther.getUnitOfMeasurementCode())
				&& (this.getBrandCode() == castOther.getBrandCode());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getItemCode();
		result = 37 * result + this.getUnitOfMeasurementCode();
		result = 37 * result + this.getBrandCode();
		return result;
	}

}
