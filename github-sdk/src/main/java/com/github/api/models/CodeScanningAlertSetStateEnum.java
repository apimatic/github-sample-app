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
 * CodeScanningAlertSetStateEnum to be used.
 */
public enum CodeScanningAlertSetStateEnum {
    OPEN,

    DISMISSED;


    private static TreeMap<String, CodeScanningAlertSetStateEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        OPEN.value = "open";
        DISMISSED.value = "dismissed";

        valueMap.put("open", OPEN);
        valueMap.put("dismissed", DISMISSED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static CodeScanningAlertSetStateEnum fromString(String toConvert) {
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
     * Convert list of CodeScanningAlertSetStateEnum values to list of string values.
     * @param toConvert The list of CodeScanningAlertSetStateEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CodeScanningAlertSetStateEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CodeScanningAlertSetStateEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 