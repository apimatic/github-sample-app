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
 * AccessLevelEnum to be used.
 */
public enum AccessLevelEnum {
    NONE,

    USER,

    ORGANIZATION,

    ENTERPRISE;


    private static TreeMap<String, AccessLevelEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        NONE.value = "none";
        USER.value = "user";
        ORGANIZATION.value = "organization";
        ENTERPRISE.value = "enterprise";

        valueMap.put("none", NONE);
        valueMap.put("user", USER);
        valueMap.put("organization", ORGANIZATION);
        valueMap.put("enterprise", ENTERPRISE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static AccessLevelEnum fromString(String toConvert) {
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
     * Convert list of AccessLevelEnum values to list of string values.
     * @param toConvert The list of AccessLevelEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AccessLevelEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AccessLevelEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 