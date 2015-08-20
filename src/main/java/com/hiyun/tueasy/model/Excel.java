package com.hiyun.tueasy.model;

import java.io.Serializable;
import java.util.List;

public class Excel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6415269088612056638L;

	/**
	 * 唯一id
	 */
	private String uuid;
	private String excelName;
	private List<Sheet> sheet;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getExcelName() {
		return excelName;
	}
	public void setExcelName(String excelName) {
		this.excelName = excelName;
	}
	public List<Sheet> getSheet() {
		return sheet;
	}
	public void setSheet(List<Sheet> sheet) {
		this.sheet = sheet;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((excelName == null) ? 0 : excelName.hashCode());
		result = prime * result + ((sheet == null) ? 0 : sheet.hashCode());
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
		Excel other = (Excel) obj;
		if (excelName == null) {
			if (other.excelName != null)
				return false;
		} else if (!excelName.equals(other.excelName))
			return false;
		if (sheet == null) {
			if (other.sheet != null)
				return false;
		} else if (!sheet.equals(other.sheet))
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
		return "Excel [uuid=" + uuid + ", excelName=" + excelName + ", sheet="
				+ sheet + "]";
	}
	
}
