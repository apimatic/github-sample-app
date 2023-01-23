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
 * Conclusion10Enum to be used.
 */
public enum Conclusion10Enum {
    SUCCESS,

    FAILURE,

    NEUTRAL,

    CANCELLED,

    TIMED_OUT,

    ACTION_REQUIRED,

    STALE,

    STARTUP_FAILURE;


    private static TreeMap<String, Conclusion10Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        SUCCESS.value = "success";
        FAILURE.value = "failure";
        NEUTRAL.value = "neutral";
        CANCELLED.value = "cancelled";
        TIMED_OUT.value = "timed_out";
        ACTION_REQUIRED.value = "action_required";
        STALE.value = "stale";
        STARTUP_FAILURE.value = "startup_failure";

        valueMap.put("success", SUCCESS);
        valueMap.put("failure", FAILURE);
        valueMap.put("neutral", NEUTRAL);
        valueMap.put("cancelled", CANCELLED);
        valueMap.put("timed_out", TIMED_OUT);
        valueMap.put("action_required", ACTION_REQUIRED);
        valueMap.put("stale", STALE);
        valueMap.put("startup_failure", STARTUP_FAILURE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Conclusion10Enum fromString(String toConvert) {
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
     * Convert list of Conclusion10Enum values to list of string values.
     * @param toConvert The list of Conclusion10Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Conclusion10Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Conclusion10Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 