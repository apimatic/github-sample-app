/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * PathEnum to be used.
 */
public enum PathEnum {
    ENUM_0,

    ENUM_1;


    private static TreeMap<String, PathEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_0.value = "/";
        ENUM_1.value = "/docs";

        valueMap.put("/", ENUM_0);
        valueMap.put("/docs", ENUM_1);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static PathEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of PathEnum values to list of string values.
     * @param toConvert The list of PathEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PathEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PathEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 