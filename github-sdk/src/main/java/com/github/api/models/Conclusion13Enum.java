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
 * Conclusion13Enum to be used.
 */
public enum Conclusion13Enum {
    SUCCESS,

    FAILURE,

    CANCELLED,

    NEUTRAL;


    private static TreeMap<String, Conclusion13Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        SUCCESS.value = "success";
        FAILURE.value = "failure";
        CANCELLED.value = "cancelled";
        NEUTRAL.value = "neutral";

        valueMap.put("success", SUCCESS);
        valueMap.put("failure", FAILURE);
        valueMap.put("cancelled", CANCELLED);
        valueMap.put("neutral", NEUTRAL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Conclusion13Enum fromString(String toConvert) {
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
     * Convert list of Conclusion13Enum values to list of string values.
     * @param toConvert The list of Conclusion13Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Conclusion13Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Conclusion13Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 