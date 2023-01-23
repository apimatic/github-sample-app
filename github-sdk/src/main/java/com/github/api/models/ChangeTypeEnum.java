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
 * ChangeTypeEnum to be used.
 */
public enum ChangeTypeEnum {
    ADDED,

    REMOVED;


    private static TreeMap<String, ChangeTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ADDED.value = "added";
        REMOVED.value = "removed";

        valueMap.put("added", ADDED);
        valueMap.put("removed", REMOVED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ChangeTypeEnum fromString(String toConvert) {
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
     * Convert list of ChangeTypeEnum values to list of string values.
     * @param toConvert The list of ChangeTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ChangeTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ChangeTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 