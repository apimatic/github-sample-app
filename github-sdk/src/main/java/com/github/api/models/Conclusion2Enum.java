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
 * Conclusion2Enum to be used.
 */
public enum Conclusion2Enum {
    SUCCESS,

    FAILURE,

    NEUTRAL,

    CANCELLED,

    SKIPPED,

    TIMED_OUT,

    ACTION_REQUIRED,

    STARTUP_FAILURE,

    STALE;


    private static TreeMap<String, Conclusion2Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        SUCCESS.value = "success";
        FAILURE.value = "failure";
        NEUTRAL.value = "neutral";
        CANCELLED.value = "cancelled";
        SKIPPED.value = "skipped";
        TIMED_OUT.value = "timed_out";
        ACTION_REQUIRED.value = "action_required";
        STARTUP_FAILURE.value = "startup_failure";
        STALE.value = "stale";

        valueMap.put("success", SUCCESS);
        valueMap.put("failure", FAILURE);
        valueMap.put("neutral", NEUTRAL);
        valueMap.put("cancelled", CANCELLED);
        valueMap.put("skipped", SKIPPED);
        valueMap.put("timed_out", TIMED_OUT);
        valueMap.put("action_required", ACTION_REQUIRED);
        valueMap.put("startup_failure", STARTUP_FAILURE);
        valueMap.put("stale", STALE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Conclusion2Enum fromString(String toConvert) {
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
     * Convert list of Conclusion2Enum values to list of string values.
     * @param toConvert The list of Conclusion2Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Conclusion2Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Conclusion2Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 