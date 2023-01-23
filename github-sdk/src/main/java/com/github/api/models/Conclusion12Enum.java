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
 * Conclusion12Enum to be used.
 */
public enum Conclusion12Enum {
    FAILURE,

    SKIPPED,

    SUCCESS,

    CANCELLED;


    private static TreeMap<String, Conclusion12Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        FAILURE.value = "failure";
        SKIPPED.value = "skipped";
        SUCCESS.value = "success";
        CANCELLED.value = "cancelled";

        valueMap.put("failure", FAILURE);
        valueMap.put("skipped", SKIPPED);
        valueMap.put("success", SUCCESS);
        valueMap.put("cancelled", CANCELLED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Conclusion12Enum fromString(String toConvert) {
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
     * Convert list of Conclusion12Enum values to list of string values.
     * @param toConvert The list of Conclusion12Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Conclusion12Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Conclusion12Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 