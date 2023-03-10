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
 * Sort191Enum to be used.
 */
public enum Sort191Enum {
    STARS,

    FORKS,

    HELPWANTEDISSUES,

    UPDATED;


    private static TreeMap<String, Sort191Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        STARS.value = "stars";
        FORKS.value = "forks";
        HELPWANTEDISSUES.value = "help-wanted-issues";
        UPDATED.value = "updated";

        valueMap.put("stars", STARS);
        valueMap.put("forks", FORKS);
        valueMap.put("help-wanted-issues", HELPWANTEDISSUES);
        valueMap.put("updated", UPDATED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Sort191Enum fromString(String toConvert) {
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
     * Convert list of Sort191Enum values to list of string values.
     * @param toConvert The list of Sort191Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Sort191Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Sort191Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 