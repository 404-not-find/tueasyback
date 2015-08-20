package com.hiyun.tueasy.model;

import java.io.Serializable;
import java.util.List;

public class MyExcel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7284043476521444501L;
	/**
	 * 唯一id
	 */
	private String uuid;
	private String schemaName;
	private List<MySheet> tables;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getSchemaName() {
		return schemaName;
	}
	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}
	public List<MySheet> getTables() {
		return tables;
	}
	public void setTables(List<MySheet> tables) {
		this.tables = tables;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((schemaName == null) ? 0 : schemaName.hashCode());
		result = prime * result + ((tables == null) ? 0 : tables.hashCode());
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
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
		MyExcel other = (MyExcel) obj;
		if (schemaName == null) {
			if (other.schemaName != null)
				return false;
		} else if (!schemaName.equals(other.schemaName))
			return false;
		if (tables == null) {
			if (other.tables != null)
				return false;
		} else if (!tables.equals(other.tables))
			return false;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MyExcel [uuid=" + uuid + ", schemaName=" + schemaName
				+ ", tables=" + tables + "]";
	}
	

}
