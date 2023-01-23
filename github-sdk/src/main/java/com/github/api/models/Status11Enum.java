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
 * Status11Enum to be used.
 */
public enum Status11Enum {
    BUILT,

    BUILDING,

    ERRORED;


    private static TreeMap<String, Status11Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        BUILT.value = "built";
        BUILDING.value = "building";
        ERRORED.value = "errored";

        valueMap.put("built", BUILT);
        valueMap.put("building", BUILDING);
        valueMap.put("errored", ERRORED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Status11Enum fromString(String toConvert) {
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
     * Convert list of Status11Enum values to list of string values.
     * @param toConvert The list of Status11Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Status11Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Status11Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 