/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models.containers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.ApiHelper;
import com.github.api.DateTimeHelper;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = Repo20CreatedAt.Repo20CreatedAtDeserializer.class)
public abstract class Repo20CreatedAt {
    
    /**
     * One-of type initialization method.
     * @param number int value for number.
     * @return The NumberCase object.
     */
    public static Repo20CreatedAt fromNumber(int number) {
        return new NumberCase(number);
    }

    /**
     * One-of type initialization method.
     * @param dateTime LocalDateTime value for dateTime.
     * @return The DateTimeCase object.
     */
    public static Repo20CreatedAt fromDateTime(LocalDateTime dateTime) {
        return dateTime == null ? null : new DateTimeCase(dateTime);
    }

    /**
     * Method to match from the provided one-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The one-of type cases callback.
     * @return The one-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for one-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R number(int number);

        R dateTime(LocalDateTime dateTime);
    }

    /**
     * This is a implementation class for NumberCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class NumberCase extends Repo20CreatedAt {

        @JsonValue
        private int number;

        NumberCase(int number) {
            this.number = number;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.number(this.number);
        }

        @JsonCreator
        private NumberCase(JsonNode jsonNode) throws IOException {
            if (jsonNode.isInt()) {
                this.number = ApiHelper.deserialize(jsonNode, Integer.class);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return String.valueOf(number);
        }
    }

    /**
     * This is a implementation class for DateTimeCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class DateTimeCase extends Repo20CreatedAt {

        @JsonValue
        @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
        private LocalDateTime dateTime;

        DateTimeCase(LocalDateTime dateTime) {
            this.dateTime = dateTime;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.dateTime(this.dateTime);
        }

        @JsonCreator
        private DateTimeCase(JsonNode jsonNode) throws IOException {
            this.dateTime = DateTimeHelper.fromRfc8601DateTime(jsonNode.asText());
        }

        @Override
        public String toString() {
            return DateTimeHelper.toRfc8601DateTime(dateTime);
        }
    }

    /**
     * This is a custom deserializer class for Repo20CreatedAt.
     */
    protected static class Repo20CreatedAtDeserializer
            extends JsonDeserializer<Repo20CreatedAt> {

        @Override
        public Repo20CreatedAt deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(NumberCase.class,
                    DateTimeCase.class), true);
        }
    }

}
