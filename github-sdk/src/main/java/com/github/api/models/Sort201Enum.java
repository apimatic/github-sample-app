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
 * Sort201Enum to be used.
 */
public enum Sort201Enum {
    FOLLOWERS,

    REPOSITORIES,

    JOINED;


    private static TreeMap<String, Sort201Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        FOLLOWERS.value = "followers";
        REPOSITORIES.value = "repositories";
        JOINED.value = "joined";

        valueMap.put("followers", FOLLOWERS);
        valueMap.put("repositories", REPOSITORIES);
        valueMap.put("joined", JOINED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Sort201Enum fromString(String toConvert) {
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
     * Convert list of Sort201Enum values to list of string values.
     * @param toConvert The list of Sort201Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Sort201Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Sort201Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 