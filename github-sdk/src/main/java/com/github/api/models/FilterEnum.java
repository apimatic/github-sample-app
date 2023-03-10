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
 * FilterEnum to be used.
 */
public enum FilterEnum {
    ASSIGNED,

    CREATED,

    MENTIONED,

    SUBSCRIBED,

    REPOS,

    ALL;


    private static TreeMap<String, FilterEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ASSIGNED.value = "assigned";
        CREATED.value = "created";
        MENTIONED.value = "mentioned";
        SUBSCRIBED.value = "subscribed";
        REPOS.value = "repos";
        ALL.value = "all";

        valueMap.put("assigned", ASSIGNED);
        valueMap.put("created", CREATED);
        valueMap.put("mentioned", MENTIONED);
        valueMap.put("subscribed", SUBSCRIBED);
        valueMap.put("repos", REPOS);
        valueMap.put("all", ALL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static FilterEnum fromString(String toConvert) {
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
     * Convert list of FilterEnum values to list of string values.
     * @param toConvert The list of FilterEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<FilterEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (FilterEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 