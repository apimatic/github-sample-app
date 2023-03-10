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
 * Visibility88Enum to be used.
 */
public enum Visibility88Enum {
    ENUM_PUBLIC,

    ENUM_PRIVATE;


    private static TreeMap<String, Visibility88Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_PUBLIC.value = "public";
        ENUM_PRIVATE.value = "private";

        valueMap.put("public", ENUM_PUBLIC);
        valueMap.put("private", ENUM_PRIVATE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Visibility88Enum fromString(String toConvert) {
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
     * Convert list of Visibility88Enum values to list of string values.
     * @param toConvert The list of Visibility88Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Visibility88Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Visibility88Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 