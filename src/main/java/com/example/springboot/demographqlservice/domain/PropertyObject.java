package com.example.springboot.demographqlservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PropertyObject {

    private ValueType valueType;

    private String value;

    public ValueType getValueType() { return valueType; }

    public void setDataType(ValueType valueType) {
        this.valueType = valueType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
