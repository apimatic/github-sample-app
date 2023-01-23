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
 * State129Enum to be used.
 */
public enum State129Enum {
    OPEN,

    CLOSED;


    private static TreeMap<String, State129Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        OPEN.value = "open";
        CLOSED.value = "closed";

        valueMap.put("open", OPEN);
        valueMap.put("closed", CLOSED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static State129Enum fromString(String toConvert) {
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
     * Convert list of State129Enum values to list of string values.
     * @param toConvert The list of State129Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<State129Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (State129Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 