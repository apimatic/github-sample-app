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
 * PriceModelEnum to be used.
 */
public enum PriceModelEnum {
    FREE,

    FLAT_RATE,

    PER_UNIT;


    private static TreeMap<String, PriceModelEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        FREE.value = "FREE";
        FLAT_RATE.value = "FLAT_RATE";
        PER_UNIT.value = "PER_UNIT";

        valueMap.put("FREE", FREE);
        valueMap.put("FLAT_RATE", FLAT_RATE);
        valueMap.put("PER_UNIT", PER_UNIT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static PriceModelEnum fromString(String toConvert) {
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
     * Convert list of PriceModelEnum values to list of string values.
     * @param toConvert The list of PriceModelEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PriceModelEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PriceModelEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 