package com.wenyu7980.area.api.domain;

/**
 *
 * @author wenyu
 */
public class AreaInternal {
    /** id */
    private Integer id;
    /** 名称 */
    private String name;
    /** 等级：省1，市2，区县3 */
    private Integer level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
