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
 * Status9Enum to be used.
 */
public enum Status9Enum {
    DIVERGED,

    AHEAD,

    BEHIND,

    IDENTICAL;


    private static TreeMap<String, Status9Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        DIVERGED.value = "diverged";
        AHEAD.value = "ahead";
        BEHIND.value = "behind";
        IDENTICAL.value = "identical";

        valueMap.put("diverged", DIVERGED);
        valueMap.put("ahead", AHEAD);
        valueMap.put("behind", BEHIND);
        valueMap.put("identical", IDENTICAL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Status9Enum fromString(String toConvert) {
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
     * Convert list of Status9Enum values to list of string values.
     * @param toConvert The list of Status9Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Status9Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Status9Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 