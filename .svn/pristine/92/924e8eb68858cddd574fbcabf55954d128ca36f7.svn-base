package com.hiyun.tueasy.model;

import java.io.Serializable;

public class Cell implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1024066937958141838L;

	//行坐标
	private Integer rowNum;
	//列坐标
	private Integer columnNum;
	//内容
	private String stringContent;
	
	//double 
	private double doubleContent;
	
	//0:数字,1:字符串
	private int type;
	
	
	public Integer getRowNum() {
		return rowNum;
	}
	public void setRowNum(Integer rowNum) {
		this.rowNum = rowNum;
	}
	public Integer getColumnNum() {
		return columnNum;
	}
	public void setColumnNum(Integer columnNum) {
		this.columnNum = columnNum;
	}
	
	
	
	public String getStringContent() {
		return stringContent;
	}
	public void setStringContent(String stringContent) {
		this.stringContent = stringContent;
	}
	public double getDoubleContent() {
		return doubleContent;
	}
	public void setDoubleContent(double doubleContent) {
		this.doubleContent = doubleContent;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((columnNum == null) ? 0 : columnNum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(doubleContent);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((rowNum == null) ? 0 : rowNum.hashCode());
		result = prime * result
				+ ((stringContent == null) ? 0 : stringContent.hashCode());
		result = prime * result + type;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (columnNum == null) {
			if (other.columnNum != null)
				return false;
		} else if (!columnNum.equals(other.columnNum))
			return false;
		if (Double.doubleToLongBits(doubleContent) != Double
				.doubleToLongBits(other.doubleContent))
			return false;
		if (rowNum == null) {
			if (other.rowNum != null)
				return false;
		} else if (!rowNum.equals(other.rowNum))
			return false;
		if (stringContent == null) {
			if (other.stringContent != null)
				return false;
		} else if (!stringContent.equals(other.stringContent))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cell [rowNum=" + rowNum + ", columnNum=" + columnNum
				+ ", stringContent=" + stringContent + ", doubleContent="
				+ doubleContent + ", type=" + type + "]";
	}
	
	
}
