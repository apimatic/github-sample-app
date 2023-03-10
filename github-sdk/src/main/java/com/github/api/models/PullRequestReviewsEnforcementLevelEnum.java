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
 * PullRequestReviewsEnforcementLevelEnum to be used.
 */
public enum PullRequestReviewsEnforcementLevelEnum {
    OFF,

    NON_ADMINS,

    EVERYONE;


    private static TreeMap<String, PullRequestReviewsEnforcementLevelEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        OFF.value = "off";
        NON_ADMINS.value = "non_admins";
        EVERYONE.value = "everyone";

        valueMap.put("off", OFF);
        valueMap.put("non_admins", NON_ADMINS);
        valueMap.put("everyone", EVERYONE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static PullRequestReviewsEnforcementLevelEnum fromString(String toConvert) {
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
     * Convert list of PullRequestReviewsEnforcementLevelEnum values to list of string values.
     * @param toConvert The list of PullRequestReviewsEnforcementLevelEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PullRequestReviewsEnforcementLevelEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PullRequestReviewsEnforcementLevelEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 