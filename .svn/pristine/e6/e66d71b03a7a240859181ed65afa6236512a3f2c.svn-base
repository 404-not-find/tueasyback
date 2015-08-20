package com.hiyun.tueasy.model;

import java.io.Serializable;
import java.util.List;

public class MySheet implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1781724203149803863L;

	private String tableName;
	private List<Object> columns;
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public List<Object> getColumns() {
		return columns;
	}
	public void setColumns(List<Object> columns) {
		this.columns = columns;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((columns == null) ? 0 : columns.hashCode());
		result = prime * result
				+ ((tableName == null) ? 0 : tableName.hashCode());
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
		MySheet other = (MySheet) obj;
		if (columns == null) {
			if (other.columns != null)
				return false;
		} else if (!columns.equals(other.columns))
			return false;
		if (tableName == null) {
			if (other.tableName != null)
				return false;
		} else if (!tableName.equals(other.tableName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MySheet [tableName=" + tableName + ", columns=" + columns + "]";
	}
	
	
	
}
