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
 * Status81Enum to be used.
 */
public enum Status81Enum {
    COMPLETED,

    ACTION_REQUIRED,

    CANCELLED,

    FAILURE,

    NEUTRAL,

    SKIPPED,

    STALE,

    SUCCESS,

    TIMED_OUT,

    IN_PROGRESS,

    QUEUED,

    REQUESTED,

    WAITING;


    private static TreeMap<String, Status81Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        COMPLETED.value = "completed";
        ACTION_REQUIRED.value = "action_required";
        CANCELLED.value = "cancelled";
        FAILURE.value = "failure";
        NEUTRAL.value = "neutral";
        SKIPPED.value = "skipped";
        STALE.value = "stale";
        SUCCESS.value = "success";
        TIMED_OUT.value = "timed_out";
        IN_PROGRESS.value = "in_progress";
        QUEUED.value = "queued";
        REQUESTED.value = "requested";
        WAITING.value = "waiting";

        valueMap.put("completed", COMPLETED);
        valueMap.put("action_required", ACTION_REQUIRED);
        valueMap.put("cancelled", CANCELLED);
        valueMap.put("failure", FAILURE);
        valueMap.put("neutral", NEUTRAL);
        valueMap.put("skipped", SKIPPED);
        valueMap.put("stale", STALE);
        valueMap.put("success", SUCCESS);
        valueMap.put("timed_out", TIMED_OUT);
        valueMap.put("in_progress", IN_PROGRESS);
        valueMap.put("queued", QUEUED);
        valueMap.put("requested", REQUESTED);
        valueMap.put("waiting", WAITING);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Status81Enum fromString(String toConvert) {
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
     * Convert list of Status81Enum values to list of string values.
     * @param toConvert The list of Status81Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Status81Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Status81Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 