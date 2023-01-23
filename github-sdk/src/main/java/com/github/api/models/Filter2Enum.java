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
 * Filter2Enum to be used.
 */
public enum Filter2Enum {
    ENUM_2FA_DISABLED,

    ALL;


    private static TreeMap<String, Filter2Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_2FA_DISABLED.value = "2fa_disabled";
        ALL.value = "all";

        valueMap.put("2fa_disabled", ENUM_2FA_DISABLED);
        valueMap.put("all", ALL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Filter2Enum fromString(String toConvert) {
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
     * Convert list of Filter2Enum values to list of string values.
     * @param toConvert The list of Filter2Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Filter2Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Filter2Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 