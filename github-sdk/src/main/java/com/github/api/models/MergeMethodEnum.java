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
 * MergeMethodEnum to be used.
 */
public enum MergeMethodEnum {
    MERGE,

    SQUASH,

    REBASE;


    private static TreeMap<String, MergeMethodEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        MERGE.value = "merge";
        SQUASH.value = "squash";
        REBASE.value = "rebase";

        valueMap.put("merge", MERGE);
        valueMap.put("squash", SQUASH);
        valueMap.put("rebase", REBASE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static MergeMethodEnum fromString(String toConvert) {
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
     * Convert list of MergeMethodEnum values to list of string values.
     * @param toConvert The list of MergeMethodEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<MergeMethodEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (MergeMethodEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 