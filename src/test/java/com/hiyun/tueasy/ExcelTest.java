package com.hiyun.tueasy;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hiyun.tueasy.core.PoiReadExcelHelper;
import com.hiyun.tueasy.model.Excel;

public class ExcelTest {
	ObjectMapper objectMapper = new ObjectMapper();

	@Test
	public void test() throws JsonProcessingException {

		String fileName = "E:\\temp\\测试数据.xls";
		String json = PoiReadExcelHelper.getExcelJsonByColumn("610ea192f5ca45aaae8e805068736f0d", "Scatter", "体重（男）"
	);

		System.out.println(json);
		// System.out.println(excel);
	}

	@Test
	public void testGetExcelAsJson() throws JsonProcessingException {

		String[] fileName = {"E:\\temp\\测试数据.xls","E:\\temp\\某公司销售数据.xls"};
		String json = PoiReadExcelHelper.getExcelAsJson(fileName);

		System.out.println(json);
		// System.out.println(excel);
	}
	
	@Test
	public void testJson() {

		Map<String, Object> mapObject = new HashMap<String, Object>();
		mapObject.put("uuid", "JavaCodeGeeks.com");
		mapObject.put("excelName", "Java");

		List<Object> myList = new ArrayList<Object>();
		myList.add("时间");
		myList.add("最高气温");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Bar", myList);

		myList.clear();
		myList.add("类别");
		myList.add("半径");
		map.put("Pie", myList);

		mapObject.put("sheet", map);

		String json = "";
		try {
			json = objectMapper.writeValueAsString(mapObject);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(json);
	}

}
