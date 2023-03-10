/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for Webhookdelivery type.
 */
public class Webhookdelivery {
    private int id;
    private String guid;
    private LocalDateTime deliveredAt;
    private boolean redelivery;
    private double duration;
    private String status;
    private int statusCode;
    private String event;
    private String action;
    private Integer installationId;
    private Integer repositoryId;
    private String url;
    private Request request;
    private Response response;

    /**
     * Default constructor.
     */
    public Webhookdelivery() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  guid  String value for guid.
     * @param  deliveredAt  LocalDateTime value for deliveredAt.
     * @param  redelivery  boolean value for redelivery.
     * @param  duration  double value for duration.
     * @param  status  String value for status.
     * @param  statusCode  int value for statusCode.
     * @param  event  String value for event.
     * @param  action  String value for action.
     * @param  installationId  Integer value for installationId.
     * @param  repositoryId  Integer value for repositoryId.
     * @param  request  Request value for request.
     * @param  response  Response value for response.
     * @param  url  String value for url.
     */
    public Webhookdelivery(
            int id,
            String guid,
            LocalDateTime deliveredAt,
            boolean redelivery,
            double duration,
            String status,
            int statusCode,
            String event,
            String action,
            Integer installationId,
            Integer repositoryId,
            Request request,
            Response response,
            String url) {
        this.id = id;
        this.guid = guid;
        this.deliveredAt = deliveredAt;
        this.redelivery = redelivery;
        this.duration = duration;
        this.status = status;
        this.statusCode = statusCode;
        this.event = event;
        this.action = action;
        this.installationId = installationId;
        this.repositoryId = repositoryId;
        this.url = url;
        this.request = request;
        this.response = response;
    }

    /**
     * Getter for Id.
     * Unique identifier of the delivery.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier of the delivery.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for Guid.
     * Unique identifier for the event (shared with all deliveries for all webhooks that subscribe
     * to this event).
     * @return Returns the String
     */
    @JsonGetter("guid")
    public String getGuid() {
        return guid;
    }

    /**
     * Setter for Guid.
     * Unique identifier for the event (shared with all deliveries for all webhooks that subscribe
     * to this event).
     * @param guid Value for String
     */
    @JsonSetter("guid")
    public void setGuid(String guid) {
        this.guid = guid;
    }

    /**
     * Getter for DeliveredAt.
     * Time when the delivery was delivered.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("delivered_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDeliveredAt() {
        return deliveredAt;
    }

    /**
     * Setter for DeliveredAt.
     * Time when the delivery was delivered.
     * @param deliveredAt Value for LocalDateTime
     */
    @JsonSetter("delivered_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDeliveredAt(LocalDateTime deliveredAt) {
        this.deliveredAt = deliveredAt;
    }

    /**
     * Getter for Redelivery.
     * Whether the delivery is a redelivery.
     * @return Returns the boolean
     */
    @JsonGetter("redelivery")
    public boolean getRedelivery() {
        return redelivery;
    }

    /**
     * Setter for Redelivery.
     * Whether the delivery is a redelivery.
     * @param redelivery Value for boolean
     */
    @JsonSetter("redelivery")
    public void setRedelivery(boolean redelivery) {
        this.redelivery = redelivery;
    }

    /**
     * Getter for Duration.
     * Time spent delivering.
     * @return Returns the double
     */
    @JsonGetter("duration")
    public double getDuration() {
        return duration;
    }

    /**
     * Setter for Duration.
     * Time spent delivering.
     * @param duration Value for double
     */
    @JsonSetter("duration")
    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     * Getter for Status.
     * Description of the status of the attempted delivery
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Description of the status of the attempted delivery
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for StatusCode.
     * Status code received when delivery was made.
     * @return Returns the int
     */
    @JsonGetter("status_code")
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Setter for StatusCode.
     * Status code received when delivery was made.
     * @param statusCode Value for int
     */
    @JsonSetter("status_code")
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Getter for Event.
     * The event that triggered the delivery.
     * @return Returns the String
     */
    @JsonGetter("event")
    public String getEvent() {
        return event;
    }

    /**
     * Setter for Event.
     * The event that triggered the delivery.
     * @param event Value for String
     */
    @JsonSetter("event")
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * Getter for Action.
     * The type of activity for the event that triggered the delivery.
     * @return Returns the String
     */
    @JsonGetter("action")
    public String getAction() {
        return action;
    }

    /**
     * Setter for Action.
     * The type of activity for the event that triggered the delivery.
     * @param action Value for String
     */
    @JsonSetter("action")
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Getter for InstallationId.
     * The id of the GitHub App installation associated with this event.
     * @return Returns the Integer
     */
    @JsonGetter("installation_id")
    public Integer getInstallationId() {
        return installationId;
    }

    /**
     * Setter for InstallationId.
     * The id of the GitHub App installation associated with this event.
     * @param installationId Value for Integer
     */
    @JsonSetter("installation_id")
    public void setInstallationId(Integer installationId) {
        this.installationId = installationId;
    }

    /**
     * Getter for RepositoryId.
     * The id of the repository associated with this event.
     * @return Returns the Integer
     */
    @JsonGetter("repository_id")
    public Integer getRepositoryId() {
        return repositoryId;
    }

    /**
     * Setter for RepositoryId.
     * The id of the repository associated with this event.
     * @param repositoryId Value for Integer
     */
    @JsonSetter("repository_id")
    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    /**
     * Getter for Url.
     * The URL target of the delivery.
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * The URL target of the delivery.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for Request.
     * @return Returns the Request
     */
    @JsonGetter("request")
    public Request getRequest() {
        return request;
    }

    /**
     * Setter for Request.
     * @param request Value for Request
     */
    @JsonSetter("request")
    public void setRequest(Request request) {
        this.request = request;
    }

    /**
     * Getter for Response.
     * @return Returns the Response
     */
    @JsonGetter("response")
    public Response getResponse() {
        return response;
    }

    /**
     * Setter for Response.
     * @param response Value for Response
     */
    @JsonSetter("response")
    public void setResponse(Response response) {
        this.response = response;
    }

    /**
     * Converts this Webhookdelivery into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Webhookdelivery [" + "id=" + id + ", guid=" + guid + ", deliveredAt=" + deliveredAt
                + ", redelivery=" + redelivery + ", duration=" + duration + ", status=" + status
                + ", statusCode=" + statusCode + ", event=" + event + ", action=" + action
                + ", installationId=" + installationId + ", repositoryId=" + repositoryId
                + ", request=" + request + ", response=" + response + ", url=" + url + "]";
    }

    /**
     * Builds a new {@link Webhookdelivery.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Webhookdelivery.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, guid, deliveredAt, redelivery, duration, status,
                statusCode, event, action, installationId, repositoryId, request, response)
                .url(getUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link Webhookdelivery}.
     */
    public static class Builder {
        private int id;
        private String guid;
        private LocalDateTime deliveredAt;
        private boolean redelivery;
        private double duration;
        private String status;
        private int statusCode;
        private String event;
        private String action;
        private Integer installationId;
        private Integer repositoryId;
        private Request request;
        private Response response;
        private String url;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  guid  String value for guid.
         * @param  deliveredAt  LocalDateTime value for deliveredAt.
         * @param  redelivery  boolean value for redelivery.
         * @param  duration  double value for duration.
         * @param  status  String value for status.
         * @param  statusCode  int value for statusCode.
         * @param  event  String value for event.
         * @param  action  String value for action.
         * @param  installationId  Integer value for installationId.
         * @param  repositoryId  Integer value for repositoryId.
         * @param  request  Request value for request.
         * @param  response  Response value for response.
         */
        public Builder(int id, String guid, LocalDateTime deliveredAt, boolean redelivery,
                double duration, String status, int statusCode, String event, String action,
                Integer installationId, Integer repositoryId, Request request, Response response) {
            this.id = id;
            this.guid = guid;
            this.deliveredAt = deliveredAt;
            this.redelivery = redelivery;
            this.duration = duration;
            this.status = status;
            this.statusCode = statusCode;
            this.event = event;
            this.action = action;
            this.installationId = installationId;
            this.repositoryId = repositoryId;
            this.request = request;
            this.response = response;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for guid.
         * @param  guid  String value for guid.
         * @return Builder
         */
        public Builder guid(String guid) {
            this.guid = guid;
            return this;
        }

        /**
         * Setter for deliveredAt.
         * @param  deliveredAt  LocalDateTime value for deliveredAt.
         * @return Builder
         */
        public Builder deliveredAt(LocalDateTime deliveredAt) {
            this.deliveredAt = deliveredAt;
            return this;
        }

        /**
         * Setter for redelivery.
         * @param  redelivery  boolean value for redelivery.
         * @return Builder
         */
        public Builder redelivery(boolean redelivery) {
            this.redelivery = redelivery;
            return this;
        }

        /**
         * Setter for duration.
         * @param  duration  double value for duration.
         * @return Builder
         */
        public Builder duration(double duration) {
            this.duration = duration;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for statusCode.
         * @param  statusCode  int value for statusCode.
         * @return Builder
         */
        public Builder statusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Setter for event.
         * @param  event  String value for event.
         * @return Builder
         */
        public Builder event(String event) {
            this.event = event;
            return this;
        }

        /**
         * Setter for action.
         * @param  action  String value for action.
         * @return Builder
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * Setter for installationId.
         * @param  installationId  Integer value for installationId.
         * @return Builder
         */
        public Builder installationId(Integer installationId) {
            this.installationId = installationId;
            return this;
        }

        /**
         * Setter for repositoryId.
         * @param  repositoryId  Integer value for repositoryId.
         * @return Builder
         */
        public Builder repositoryId(Integer repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * Setter for request.
         * @param  request  Request value for request.
         * @return Builder
         */
        public Builder request(Request request) {
            this.request = request;
            return this;
        }

        /**
         * Setter for response.
         * @param  response  Response value for response.
         * @return Builder
         */
        public Builder response(Response response) {
            this.response = response;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Builds a new {@link Webhookdelivery} object using the set fields.
         * @return {@link Webhookdelivery}
         */
        public Webhookdelivery build() {
            return new Webhookdelivery(id, guid, deliveredAt, redelivery, duration, status,
                    statusCode, event, action, installationId, repositoryId, request, response,
                    url);
        }
    }
}
