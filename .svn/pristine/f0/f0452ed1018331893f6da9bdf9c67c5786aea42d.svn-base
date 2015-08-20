package com.hiyun.tueasy.model;

import java.io.Serializable;
import java.util.List;

public class Sheet implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6661277147669583611L;

	private String sheetName;
	private List<Cell> cell;
	public String getSheetName() {
		return sheetName;
	}
	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
	}
	public List<Cell> getCell() {
		return cell;
	}
	public void setCell(List<Cell> cell) {
		this.cell = cell;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cell == null) ? 0 : cell.hashCode());
		result = prime * result
				+ ((sheetName == null) ? 0 : sheetName.hashCode());
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
		Sheet other = (Sheet) obj;
		if (cell == null) {
			if (other.cell != null)
				return false;
		} else if (!cell.equals(other.cell))
			return false;
		if (sheetName == null) {
			if (other.sheetName != null)
				return false;
		} else if (!sheetName.equals(other.sheetName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Sheet [sheetName=" + sheetName + ", cell=" + cell + "]";
	}
	
}
