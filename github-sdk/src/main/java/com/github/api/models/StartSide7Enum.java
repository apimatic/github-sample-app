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
 * StartSide7Enum to be used.
 */
public enum StartSide7Enum {
    LEFT,

    RIGHT,

    SIDE;


    private static TreeMap<String, StartSide7Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        LEFT.value = "LEFT";
        RIGHT.value = "RIGHT";
        SIDE.value = "side";

        valueMap.put("LEFT", LEFT);
        valueMap.put("RIGHT", RIGHT);
        valueMap.put("side", SIDE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static StartSide7Enum fromString(String toConvert) {
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
     * Convert list of StartSide7Enum values to list of string values.
     * @param toConvert The list of StartSide7Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<StartSide7Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (StartSide7Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 