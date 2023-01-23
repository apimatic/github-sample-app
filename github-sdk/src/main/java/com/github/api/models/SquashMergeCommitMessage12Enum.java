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
 * SquashMergeCommitMessage12Enum to be used.
 */
public enum SquashMergeCommitMessage12Enum {
    PR_BODY,

    COMMIT_MESSAGES,

    BLANK;


    private static TreeMap<String, SquashMergeCommitMessage12Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        PR_BODY.value = "PR_BODY";
        COMMIT_MESSAGES.value = "COMMIT_MESSAGES";
        BLANK.value = "BLANK";

        valueMap.put("PR_BODY", PR_BODY);
        valueMap.put("COMMIT_MESSAGES", COMMIT_MESSAGES);
        valueMap.put("BLANK", BLANK);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static SquashMergeCommitMessage12Enum fromString(String toConvert) {
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
     * Convert list of SquashMergeCommitMessage12Enum values to list of string values.
     * @param toConvert The list of SquashMergeCommitMessage12Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SquashMergeCommitMessage12Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SquashMergeCommitMessage12Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 