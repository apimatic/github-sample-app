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
 * State5Enum to be used.
 */
public enum State5Enum {
    ACTIVE,

    PENDING;


    private static TreeMap<String, State5Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        ACTIVE.value = "active";
        PENDING.value = "pending";

        valueMap.put("active", ACTIVE);
        valueMap.put("pending", PENDING);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static State5Enum fromString(String toConvert) {
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
     * Convert list of State5Enum values to list of string values.
     * @param toConvert The list of State5Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<State5Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (State5Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 