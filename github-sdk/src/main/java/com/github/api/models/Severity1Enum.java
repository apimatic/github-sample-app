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
 * Severity1Enum to be used.
 */
public enum Severity1Enum {
    LOW,

    MEDIUM,

    HIGH,

    CRITICAL;


    private static TreeMap<String, Severity1Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        LOW.value = "low";
        MEDIUM.value = "medium";
        HIGH.value = "high";
        CRITICAL.value = "critical";

        valueMap.put("low", LOW);
        valueMap.put("medium", MEDIUM);
        valueMap.put("high", HIGH);
        valueMap.put("critical", CRITICAL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Severity1Enum fromString(String toConvert) {
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
     * Convert list of Severity1Enum values to list of string values.
     * @param toConvert The list of Severity1Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Severity1Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Severity1Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 