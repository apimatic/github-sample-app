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
 * Sort13Enum to be used.
 */
public enum Sort13Enum {
    CREATED,

    UPDATED,

    POPULARITY,

    LONGRUNNING;


    private static TreeMap<String, Sort13Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        CREATED.value = "created";
        UPDATED.value = "updated";
        POPULARITY.value = "popularity";
        LONGRUNNING.value = "long-running";

        valueMap.put("created", CREATED);
        valueMap.put("updated", UPDATED);
        valueMap.put("popularity", POPULARITY);
        valueMap.put("long-running", LONGRUNNING);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Sort13Enum fromString(String toConvert) {
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
     * Convert list of Sort13Enum values to list of string values.
     * @param toConvert The list of Sort13Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Sort13Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Sort13Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 