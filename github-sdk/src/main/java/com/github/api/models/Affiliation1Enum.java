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
 * Affiliation1Enum to be used.
 */
public enum Affiliation1Enum {
    OUTSIDE,

    DIRECT,

    ALL;


    private static TreeMap<String, Affiliation1Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        OUTSIDE.value = "outside";
        DIRECT.value = "direct";
        ALL.value = "all";

        valueMap.put("outside", OUTSIDE);
        valueMap.put("direct", DIRECT);
        valueMap.put("all", ALL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Affiliation1Enum fromString(String toConvert) {
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
     * Convert list of Affiliation1Enum values to list of string values.
     * @param toConvert The list of Affiliation1Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Affiliation1Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Affiliation1Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 