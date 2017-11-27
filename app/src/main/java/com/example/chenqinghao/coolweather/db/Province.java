package com.example.chenqinghao.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by chenqinghao on 2017/11/26.
 */

public class Province extends DataSupport {
    private int id ;
    private String provinceName;
    private int provinceCode;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
