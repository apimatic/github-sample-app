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
 * Visibility79Enum to be used.
 */
public enum Visibility79Enum {
    SELECTED,

    ALL,

    ENUM_PRIVATE;


    private static TreeMap<String, Visibility79Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        SELECTED.value = "selected";
        ALL.value = "all";
        ENUM_PRIVATE.value = "private";

        valueMap.put("selected", SELECTED);
        valueMap.put("all", ALL);
        valueMap.put("private", ENUM_PRIVATE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Visibility79Enum fromString(String toConvert) {
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
     * Convert list of Visibility79Enum values to list of string values.
     * @param toConvert The list of Visibility79Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Visibility79Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Visibility79Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 