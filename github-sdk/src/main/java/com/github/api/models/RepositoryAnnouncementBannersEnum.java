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
 * RepositoryAnnouncementBannersEnum to be used.
 */
public enum RepositoryAnnouncementBannersEnum {
    READ,

    WRITE;


    private static TreeMap<String, RepositoryAnnouncementBannersEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        READ.value = "read";
        WRITE.value = "write";

        valueMap.put("read", READ);
        valueMap.put("write", WRITE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static RepositoryAnnouncementBannersEnum fromString(String toConvert) {
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
     * Convert list of RepositoryAnnouncementBannersEnum values to list of string values.
     * @param toConvert The list of RepositoryAnnouncementBannersEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<RepositoryAnnouncementBannersEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (RepositoryAnnouncementBannersEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 