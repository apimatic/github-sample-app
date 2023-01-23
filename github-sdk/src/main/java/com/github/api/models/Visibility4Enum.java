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
 * Visibility4Enum to be used.
 */
public enum Visibility4Enum {
    ENUM_PRIVATE,

    ENUM_PUBLIC;


    private static TreeMap<String, Visibility4Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_PRIVATE.value = "private";
        ENUM_PUBLIC.value = "public";

        valueMap.put("private", ENUM_PRIVATE);
        valueMap.put("public", ENUM_PUBLIC);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Visibility4Enum fromString(String toConvert) {
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
     * Convert list of Visibility4Enum values to list of string values.
     * @param toConvert The list of Visibility4Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Visibility4Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Visibility4Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 