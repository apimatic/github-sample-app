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
 * State16Enum to be used.
 */
public enum State16Enum {
    OPEN,

    DISMISSED,

    FIXED;


    private static TreeMap<String, State16Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        OPEN.value = "open";
        DISMISSED.value = "dismissed";
        FIXED.value = "fixed";

        valueMap.put("open", OPEN);
        valueMap.put("dismissed", DISMISSED);
        valueMap.put("fixed", FIXED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static State16Enum fromString(String toConvert) {
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
     * Convert list of State16Enum values to list of string values.
     * @param toConvert The list of State16Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<State16Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (State16Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 