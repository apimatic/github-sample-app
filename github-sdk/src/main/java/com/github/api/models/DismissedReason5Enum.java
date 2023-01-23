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
 * DismissedReason5Enum to be used.
 */
public enum DismissedReason5Enum {
    FIX_STARTED,

    INACCURATE,

    NO_BANDWIDTH,

    NOT_USED,

    TOLERABLE_RISK;


    private static TreeMap<String, DismissedReason5Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        FIX_STARTED.value = "fix_started";
        INACCURATE.value = "inaccurate";
        NO_BANDWIDTH.value = "no_bandwidth";
        NOT_USED.value = "not_used";
        TOLERABLE_RISK.value = "tolerable_risk";

        valueMap.put("fix_started", FIX_STARTED);
        valueMap.put("inaccurate", INACCURATE);
        valueMap.put("no_bandwidth", NO_BANDWIDTH);
        valueMap.put("not_used", NOT_USED);
        valueMap.put("tolerable_risk", TOLERABLE_RISK);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static DismissedReason5Enum fromString(String toConvert) {
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
     * Convert list of DismissedReason5Enum values to list of string values.
     * @param toConvert The list of DismissedReason5Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DismissedReason5Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DismissedReason5Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 