package com.wenyu7980.area.aggregation;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 *
 * @author wenyu
 */
@ApiModel(description = "地区")
public class AreaAggregation {
    @ApiModelProperty(value = "id", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private Integer id;
    @ApiModelProperty(value = "省id", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private Integer provinceId;
    @ApiModelProperty(value = "市id", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private Integer cityId;
    @ApiModelProperty(value = "区/县id", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private Integer districtId;
    @ApiModelProperty(value = "省名", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private String provinceName;
    @ApiModelProperty(value = "市名", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private String cityName;
    @ApiModelProperty(value = "区县名", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private String districtName;
    @ApiModelProperty(value = "全名", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private String fullName;
    @ApiModelProperty(value = "经度", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private double longitude;
    @ApiModelProperty(value = "纬度", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private double latitude;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
