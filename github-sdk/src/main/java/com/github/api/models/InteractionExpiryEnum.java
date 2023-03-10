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
 * InteractionExpiryEnum to be used.
 */
public enum InteractionExpiryEnum {
    ONE_DAY,

    THREE_DAYS,

    ONE_WEEK,

    ONE_MONTH,

    SIX_MONTHS;


    private static TreeMap<String, InteractionExpiryEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ONE_DAY.value = "one_day";
        THREE_DAYS.value = "three_days";
        ONE_WEEK.value = "one_week";
        ONE_MONTH.value = "one_month";
        SIX_MONTHS.value = "six_months";

        valueMap.put("one_day", ONE_DAY);
        valueMap.put("three_days", THREE_DAYS);
        valueMap.put("one_week", ONE_WEEK);
        valueMap.put("one_month", ONE_MONTH);
        valueMap.put("six_months", SIX_MONTHS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static InteractionExpiryEnum fromString(String toConvert) {
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
     * Convert list of InteractionExpiryEnum values to list of string values.
     * @param toConvert The list of InteractionExpiryEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InteractionExpiryEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InteractionExpiryEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 