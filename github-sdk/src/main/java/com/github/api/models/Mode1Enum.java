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
 * Mode1Enum to be used.
 */
public enum Mode1Enum {
    ENUM_100644,

    ENUM_100755,

    ENUM_040000,

    ENUM_160000,

    ENUM_120000;


    private static TreeMap<String, Mode1Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_100644.value = "100644";
        ENUM_100755.value = "100755";
        ENUM_040000.value = "040000";
        ENUM_160000.value = "160000";
        ENUM_120000.value = "120000";

        valueMap.put("100644", ENUM_100644);
        valueMap.put("100755", ENUM_100755);
        valueMap.put("040000", ENUM_040000);
        valueMap.put("160000", ENUM_160000);
        valueMap.put("120000", ENUM_120000);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Mode1Enum fromString(String toConvert) {
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
     * Convert list of Mode1Enum values to list of string values.
     * @param toConvert The list of Mode1Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Mode1Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Mode1Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 