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
 * State10Enum to be used.
 */
public enum State10Enum {
    ERROR,

    FAILURE,

    INACTIVE,

    PENDING,

    SUCCESS,

    QUEUED,

    IN_PROGRESS;


    private static TreeMap<String, State10Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        ERROR.value = "error";
        FAILURE.value = "failure";
        INACTIVE.value = "inactive";
        PENDING.value = "pending";
        SUCCESS.value = "success";
        QUEUED.value = "queued";
        IN_PROGRESS.value = "in_progress";

        valueMap.put("error", ERROR);
        valueMap.put("failure", FAILURE);
        valueMap.put("inactive", INACTIVE);
        valueMap.put("pending", PENDING);
        valueMap.put("success", SUCCESS);
        valueMap.put("queued", QUEUED);
        valueMap.put("in_progress", IN_PROGRESS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static State10Enum fromString(String toConvert) {
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
     * Convert list of State10Enum values to list of string values.
     * @param toConvert The list of State10Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<State10Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (State10Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 