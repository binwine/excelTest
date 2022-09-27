package com.example.exceltest.controller;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qjiu
 * @time
 * read excel
 */
public class ExcelController {
    public static void main(String[] args) {
        System.out.println("ok");
        ExcelReader reader = ExcelUtil.getReader("C:\\Users\\Administrator\\Desktop\\原神祈愿记录_20220825_102047.xlsx");
        List<List<Object>> read = reader.read();
        for (Object o : read) {
            System.out.println(o);
        }

    }


    @Test
    public void test1(){
        List<String> row1 = CollUtil.newArrayList("aa", "bb", "cc", "dd");
        List<String> row2 = CollUtil.newArrayList("aa", "bb", "cc", "dd");
        List<String> row3 = CollUtil.newArrayList("aa", "bb", "cc", "dd");
        List<List<String>> row = CollUtil.newArrayList(row1, row2, row3);
        ExcelWriter writer = ExcelUtil.getWriter("d:/writerTest.xlsx");

        writer.write(row);
        writer.close();
    }

    @Test
    public void test2() {
        List<String> list = new ArrayList<>();
        list.add("2");
        list.add("4");
        list.add("5"); // {2, 4, 5},


    }
}
