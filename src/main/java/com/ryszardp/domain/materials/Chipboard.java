package com.ryszardp.domain.materials;

import java.util.Objects;

public class Chipboard {
    private Long materialId;
    private String materialArticle;
    private String materialName;
    private String groupNumber;
    private String groupName;
    private String unit;
    private String cost;
    private String coefficient;
    private Long length;
    private Long width;
    private Long thickness;
    private String designation;
    private Long overhang;
    private String color;
    private String texture;
    private String materialClass;

    public Chipboard() {
    }

    public Chipboard(Long materialId, String materialArticle, String materialName, String groupNumber, String groupName,
                     String unit, String cost, String coefficient, Long length, Long width, Long thickness,
                     String designation, Long overhang, String color, String texture, String materialClass) {
        this.materialId = materialId;
        this.materialArticle = materialArticle;
        this.materialName = materialName;
        this.groupNumber = groupNumber;
        this.groupName = groupName;
        this.unit = unit;
        this.cost = cost;
        this.coefficient = coefficient;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.designation = designation;
        this.overhang = overhang;
        this.color = color;
        this.texture = texture;
        this.materialClass = materialClass;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public String getMaterialArticle() {
        return materialArticle;
    }

    public void setMaterialArticle(String materialArticle) {
        this.materialArticle = materialArticle;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(String coefficient) {
        this.coefficient = coefficient;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public Long getThickness() {
        return thickness;
    }

    public void setThickness(Long thickness) {
        this.thickness = thickness;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Long getOverhang() {
        return overhang;
    }

    public void setOverhang(Long overhang) {
        this.overhang = overhang;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getMaterialClass() {
        return materialClass;
    }

    public void setMaterialClass(String materialClass) {
        this.materialClass = materialClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chipboard)) return false;
        Chipboard chipboard = (Chipboard) o;
        return Objects.equals(materialId, chipboard.materialId) &&
                Objects.equals(materialArticle, chipboard.materialArticle) &&
                Objects.equals(materialName, chipboard.materialName) &&
                Objects.equals(groupNumber, chipboard.groupNumber) &&
                Objects.equals(groupName, chipboard.groupName) &&
                Objects.equals(unit, chipboard.unit) &&
                Objects.equals(cost, chipboard.cost) &&
                Objects.equals(coefficient, chipboard.coefficient) &&
                Objects.equals(length, chipboard.length) &&
                Objects.equals(width, chipboard.width) &&
                Objects.equals(thickness, chipboard.thickness) &&
                Objects.equals(designation, chipboard.designation) &&
                Objects.equals(overhang, chipboard.overhang) &&
                Objects.equals(color, chipboard.color) &&
                Objects.equals(texture, chipboard.texture) &&
                Objects.equals(materialClass, chipboard.materialClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(materialId, materialArticle, materialName, groupNumber, groupName, unit, cost, coefficient,
                length, width, thickness, designation, overhang, color, texture, materialClass);
    }

    @Override
    public String toString() {
        return "Chipboard{" +
                "materialId=" + materialId +
                ", materialArticle='" + materialArticle + '\'' +
                ", materialName='" + materialName + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", groupName='" + groupName + '\'' +
                ", unit='" + unit + '\'' +
                ", cost='" + cost + '\'' +
                ", coefficient='" + coefficient + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", thickness=" + thickness +
                ", designation='" + designation + '\'' +
                ", overhang=" + overhang +
                ", color='" + color + '\'' +
                ", texture='" + texture + '\'' +
                ", materialClass='" + materialClass + '\'' +
                '}';
    }
}
