package com.wenyu7980.area.entity;

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author wenyu
 */
@Table(name = "area_area")
@Entity
public class AreaEntity {
    @Id
    private Integer id;
    /** 名称 */
    private String name;
    /** 级别 */
    private int level;
    /** 行政区划代码 */
    private String code;
    /** 全称 */
    private String fullName;
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private AreaEntity parent;
    @OneToMany(mappedBy = "parent")
    private List<AreaEntity> areas;
    /** 经度 */
    private double longitude;
    /** 纬度 */
    private double latitude;

    public static AreaEntity ofCache(AreaEntity entity) {
        if (entity == null) {
            return null;
        }
        AreaEntity area = new AreaEntity();
        area.id = entity.id;
        area.name = entity.name;
        area.fullName = entity.fullName;
        area.code = entity.code;
        area.latitude = entity.latitude;
        area.longitude = entity.longitude;
        area.level = entity.level;
        area.parent = ofCache(entity.parent);
        return area;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getCode() {
        return code;
    }

    public String getFullName() {
        return fullName;
    }

    public AreaEntity getParent() {
        return parent;
    }

    public List<AreaEntity> getAreas() {
        return areas;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }
}
