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
import java.util.List;

/**
 * This is a model class for ReposActionsJobsJobIdResponse type.
 */
public class ReposActionsJobsJobIdResponse {
    private int id;
    private int runId;
    private String runUrl;
    private Integer runAttempt;
    private String nodeId;
    private String headSha;
    private String url;
    private String htmlUrl;
    private Status3Enum status;
    private Object conclusion;
    private LocalDateTime startedAt;
    private LocalDateTime completedAt;
    private String name;
    private List<Step> steps;
    private String checkRunUrl;
    private List<String> labels;
    private Integer runnerId;
    private String runnerName;
    private Integer runnerGroupId;
    private String runnerGroupName;
    private String workflowName;
    private String headBranch;

    /**
     * Default constructor.
     */
    public ReposActionsJobsJobIdResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  runId  int value for runId.
     * @param  runUrl  String value for runUrl.
     * @param  nodeId  String value for nodeId.
     * @param  headSha  String value for headSha.
     * @param  url  String value for url.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  status  Status3Enum value for status.
     * @param  conclusion  Object value for conclusion.
     * @param  startedAt  LocalDateTime value for startedAt.
     * @param  completedAt  LocalDateTime value for completedAt.
     * @param  name  String value for name.
     * @param  checkRunUrl  String value for checkRunUrl.
     * @param  labels  List of String value for labels.
     * @param  runnerId  Integer value for runnerId.
     * @param  runnerName  String value for runnerName.
     * @param  runnerGroupId  Integer value for runnerGroupId.
     * @param  runnerGroupName  String value for runnerGroupName.
     * @param  workflowName  String value for workflowName.
     * @param  headBranch  String value for headBranch.
     * @param  runAttempt  Integer value for runAttempt.
     * @param  steps  List of Step value for steps.
     */
    public ReposActionsJobsJobIdResponse(
            int id,
            int runId,
            String runUrl,
            String nodeId,
            String headSha,
            String url,
            String htmlUrl,
            Status3Enum status,
            Object conclusion,
            LocalDateTime startedAt,
            LocalDateTime completedAt,
            String name,
            String checkRunUrl,
            List<String> labels,
            Integer runnerId,
            String runnerName,
            Integer runnerGroupId,
            String runnerGroupName,
            String workflowName,
            String headBranch,
            Integer runAttempt,
            List<Step> steps) {
        this.id = id;
        this.runId = runId;
        this.runUrl = runUrl;
        this.runAttempt = runAttempt;
        this.nodeId = nodeId;
        this.headSha = headSha;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.status = status;
        this.conclusion = conclusion;
        this.startedAt = startedAt;
        this.completedAt = completedAt;
        this.name = name;
        this.steps = steps;
        this.checkRunUrl = checkRunUrl;
        this.labels = labels;
        this.runnerId = runnerId;
        this.runnerName = runnerName;
        this.runnerGroupId = runnerGroupId;
        this.runnerGroupName = runnerGroupName;
        this.workflowName = workflowName;
        this.headBranch = headBranch;
    }

    /**
     * Getter for Id.
     * The id of the job.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The id of the job.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for RunId.
     * The id of the associated workflow run.
     * @return Returns the int
     */
    @JsonGetter("run_id")
    public int getRunId() {
        return runId;
    }

    /**
     * Setter for RunId.
     * The id of the associated workflow run.
     * @param runId Value for int
     */
    @JsonSetter("run_id")
    public void setRunId(int runId) {
        this.runId = runId;
    }

    /**
     * Getter for RunUrl.
     * @return Returns the String
     */
    @JsonGetter("run_url")
    public String getRunUrl() {
        return runUrl;
    }

    /**
     * Setter for RunUrl.
     * @param runUrl Value for String
     */
    @JsonSetter("run_url")
    public void setRunUrl(String runUrl) {
        this.runUrl = runUrl;
    }

    /**
     * Getter for RunAttempt.
     * Attempt number of the associated workflow run, 1 for first attempt and higher if the workflow
     * was re-run.
     * @return Returns the Integer
     */
    @JsonGetter("run_attempt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRunAttempt() {
        return runAttempt;
    }

    /**
     * Setter for RunAttempt.
     * Attempt number of the associated workflow run, 1 for first attempt and higher if the workflow
     * was re-run.
     * @param runAttempt Value for Integer
     */
    @JsonSetter("run_attempt")
    public void setRunAttempt(Integer runAttempt) {
        this.runAttempt = runAttempt;
    }

    /**
     * Getter for NodeId.
     * @return Returns the String
     */
    @JsonGetter("node_id")
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Setter for NodeId.
     * @param nodeId Value for String
     */
    @JsonSetter("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * Getter for HeadSha.
     * The SHA of the commit that is being run.
     * @return Returns the String
     */
    @JsonGetter("head_sha")
    public String getHeadSha() {
        return headSha;
    }

    /**
     * Setter for HeadSha.
     * The SHA of the commit that is being run.
     * @param headSha Value for String
     */
    @JsonSetter("head_sha")
    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for HtmlUrl.
     * @return Returns the String
     */
    @JsonGetter("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * Setter for HtmlUrl.
     * @param htmlUrl Value for String
     */
    @JsonSetter("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     * Getter for Status.
     * @return Returns the Status3Enum
     */
    @JsonGetter("status")
    public Status3Enum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for Status3Enum
     */
    @JsonSetter("status")
    public void setStatus(Status3Enum status) {
        this.status = status;
    }

    /**
     * Getter for Conclusion.
     * @return Returns the Object
     */
    @JsonGetter("conclusion")
    public Object getConclusion() {
        return conclusion;
    }

    /**
     * Setter for Conclusion.
     * @param conclusion Value for Object
     */
    @JsonSetter("conclusion")
    public void setConclusion(Object conclusion) {
        this.conclusion = conclusion;
    }

    /**
     * Getter for StartedAt.
     * The time that the job started, in ISO 8601 format.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("started_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getStartedAt() {
        return startedAt;
    }

    /**
     * Setter for StartedAt.
     * The time that the job started, in ISO 8601 format.
     * @param startedAt Value for LocalDateTime
     */
    @JsonSetter("started_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStartedAt(LocalDateTime startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * Getter for CompletedAt.
     * The time that the job finished, in ISO 8601 format.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("completed_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    /**
     * Setter for CompletedAt.
     * The time that the job finished, in ISO 8601 format.
     * @param completedAt Value for LocalDateTime
     */
    @JsonSetter("completed_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * Getter for Name.
     * The name of the job.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the job.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Steps.
     * Steps in this job.
     * @return Returns the List of Step
     */
    @JsonGetter("steps")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Step> getSteps() {
        return steps;
    }

    /**
     * Setter for Steps.
     * Steps in this job.
     * @param steps Value for List of Step
     */
    @JsonSetter("steps")
    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    /**
     * Getter for CheckRunUrl.
     * @return Returns the String
     */
    @JsonGetter("check_run_url")
    public String getCheckRunUrl() {
        return checkRunUrl;
    }

    /**
     * Setter for CheckRunUrl.
     * @param checkRunUrl Value for String
     */
    @JsonSetter("check_run_url")
    public void setCheckRunUrl(String checkRunUrl) {
        this.checkRunUrl = checkRunUrl;
    }

    /**
     * Getter for Labels.
     * Labels for the workflow job. Specified by the "runs_on" attribute in the action's workflow
     * file.
     * @return Returns the List of String
     */
    @JsonGetter("labels")
    public List<String> getLabels() {
        return labels;
    }

    /**
     * Setter for Labels.
     * Labels for the workflow job. Specified by the "runs_on" attribute in the action's workflow
     * file.
     * @param labels Value for List of String
     */
    @JsonSetter("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    /**
     * Getter for RunnerId.
     * The ID of the runner to which this job has been assigned. (If a runner hasn't yet been
     * assigned, this will be null.)
     * @return Returns the Integer
     */
    @JsonGetter("runner_id")
    public Integer getRunnerId() {
        return runnerId;
    }

    /**
     * Setter for RunnerId.
     * The ID of the runner to which this job has been assigned. (If a runner hasn't yet been
     * assigned, this will be null.)
     * @param runnerId Value for Integer
     */
    @JsonSetter("runner_id")
    public void setRunnerId(Integer runnerId) {
        this.runnerId = runnerId;
    }

    /**
     * Getter for RunnerName.
     * The name of the runner to which this job has been assigned. (If a runner hasn't yet been
     * assigned, this will be null.)
     * @return Returns the String
     */
    @JsonGetter("runner_name")
    public String getRunnerName() {
        return runnerName;
    }

    /**
     * Setter for RunnerName.
     * The name of the runner to which this job has been assigned. (If a runner hasn't yet been
     * assigned, this will be null.)
     * @param runnerName Value for String
     */
    @JsonSetter("runner_name")
    public void setRunnerName(String runnerName) {
        this.runnerName = runnerName;
    }

    /**
     * Getter for RunnerGroupId.
     * The ID of the runner group to which this job has been assigned. (If a runner hasn't yet been
     * assigned, this will be null.)
     * @return Returns the Integer
     */
    @JsonGetter("runner_group_id")
    public Integer getRunnerGroupId() {
        return runnerGroupId;
    }

    /**
     * Setter for RunnerGroupId.
     * The ID of the runner group to which this job has been assigned. (If a runner hasn't yet been
     * assigned, this will be null.)
     * @param runnerGroupId Value for Integer
     */
    @JsonSetter("runner_group_id")
    public void setRunnerGroupId(Integer runnerGroupId) {
        this.runnerGroupId = runnerGroupId;
    }

    /**
     * Getter for RunnerGroupName.
     * The name of the runner group to which this job has been assigned. (If a runner hasn't yet
     * been assigned, this will be null.)
     * @return Returns the String
     */
    @JsonGetter("runner_group_name")
    public String getRunnerGroupName() {
        return runnerGroupName;
    }

    /**
     * Setter for RunnerGroupName.
     * The name of the runner group to which this job has been assigned. (If a runner hasn't yet
     * been assigned, this will be null.)
     * @param runnerGroupName Value for String
     */
    @JsonSetter("runner_group_name")
    public void setRunnerGroupName(String runnerGroupName) {
        this.runnerGroupName = runnerGroupName;
    }

    /**
     * Getter for WorkflowName.
     * The name of the workflow.
     * @return Returns the String
     */
    @JsonGetter("workflow_name")
    public String getWorkflowName() {
        return workflowName;
    }

    /**
     * Setter for WorkflowName.
     * The name of the workflow.
     * @param workflowName Value for String
     */
    @JsonSetter("workflow_name")
    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    /**
     * Getter for HeadBranch.
     * The name of the current branch.
     * @return Returns the String
     */
    @JsonGetter("head_branch")
    public String getHeadBranch() {
        return headBranch;
    }

    /**
     * Setter for HeadBranch.
     * The name of the current branch.
     * @param headBranch Value for String
     */
    @JsonSetter("head_branch")
    public void setHeadBranch(String headBranch) {
        this.headBranch = headBranch;
    }

    /**
     * Converts this ReposActionsJobsJobIdResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposActionsJobsJobIdResponse [" + "id=" + id + ", runId=" + runId + ", runUrl="
                + runUrl + ", nodeId=" + nodeId + ", headSha=" + headSha + ", url=" + url
                + ", htmlUrl=" + htmlUrl + ", status=" + status + ", conclusion=" + conclusion
                + ", startedAt=" + startedAt + ", completedAt=" + completedAt + ", name=" + name
                + ", checkRunUrl=" + checkRunUrl + ", labels=" + labels + ", runnerId=" + runnerId
                + ", runnerName=" + runnerName + ", runnerGroupId=" + runnerGroupId
                + ", runnerGroupName=" + runnerGroupName + ", workflowName=" + workflowName
                + ", headBranch=" + headBranch + ", runAttempt=" + runAttempt + ", steps=" + steps
                + "]";
    }

    /**
     * Builds a new {@link ReposActionsJobsJobIdResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposActionsJobsJobIdResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, runId, runUrl, nodeId, headSha, url, htmlUrl, status,
                conclusion, startedAt, completedAt, name, checkRunUrl, labels, runnerId, runnerName,
                runnerGroupId, runnerGroupName, workflowName, headBranch)
                .runAttempt(getRunAttempt())
                .steps(getSteps());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposActionsJobsJobIdResponse}.
     */
    public static class Builder {
        private int id;
        private int runId;
        private String runUrl;
        private String nodeId;
        private String headSha;
        private String url;
        private String htmlUrl;
        private Status3Enum status;
        private Object conclusion;
        private LocalDateTime startedAt;
        private LocalDateTime completedAt;
        private String name;
        private String checkRunUrl;
        private List<String> labels;
        private Integer runnerId;
        private String runnerName;
        private Integer runnerGroupId;
        private String runnerGroupName;
        private String workflowName;
        private String headBranch;
        private Integer runAttempt;
        private List<Step> steps;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  runId  int value for runId.
         * @param  runUrl  String value for runUrl.
         * @param  nodeId  String value for nodeId.
         * @param  headSha  String value for headSha.
         * @param  url  String value for url.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  status  Status3Enum value for status.
         * @param  conclusion  Object value for conclusion.
         * @param  startedAt  LocalDateTime value for startedAt.
         * @param  completedAt  LocalDateTime value for completedAt.
         * @param  name  String value for name.
         * @param  checkRunUrl  String value for checkRunUrl.
         * @param  labels  List of String value for labels.
         * @param  runnerId  Integer value for runnerId.
         * @param  runnerName  String value for runnerName.
         * @param  runnerGroupId  Integer value for runnerGroupId.
         * @param  runnerGroupName  String value for runnerGroupName.
         * @param  workflowName  String value for workflowName.
         * @param  headBranch  String value for headBranch.
         */
        public Builder(int id, int runId, String runUrl, String nodeId, String headSha, String url,
                String htmlUrl, Status3Enum status, Object conclusion, LocalDateTime startedAt,
                LocalDateTime completedAt, String name, String checkRunUrl, List<String> labels,
                Integer runnerId, String runnerName, Integer runnerGroupId, String runnerGroupName,
                String workflowName, String headBranch) {
            this.id = id;
            this.runId = runId;
            this.runUrl = runUrl;
            this.nodeId = nodeId;
            this.headSha = headSha;
            this.url = url;
            this.htmlUrl = htmlUrl;
            this.status = status;
            this.conclusion = conclusion;
            this.startedAt = startedAt;
            this.completedAt = completedAt;
            this.name = name;
            this.checkRunUrl = checkRunUrl;
            this.labels = labels;
            this.runnerId = runnerId;
            this.runnerName = runnerName;
            this.runnerGroupId = runnerGroupId;
            this.runnerGroupName = runnerGroupName;
            this.workflowName = workflowName;
            this.headBranch = headBranch;
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
         * Setter for runId.
         * @param  runId  int value for runId.
         * @return Builder
         */
        public Builder runId(int runId) {
            this.runId = runId;
            return this;
        }

        /**
         * Setter for runUrl.
         * @param  runUrl  String value for runUrl.
         * @return Builder
         */
        public Builder runUrl(String runUrl) {
            this.runUrl = runUrl;
            return this;
        }

        /**
         * Setter for nodeId.
         * @param  nodeId  String value for nodeId.
         * @return Builder
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setter for headSha.
         * @param  headSha  String value for headSha.
         * @return Builder
         */
        public Builder headSha(String headSha) {
            this.headSha = headSha;
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
         * Setter for htmlUrl.
         * @param  htmlUrl  String value for htmlUrl.
         * @return Builder
         */
        public Builder htmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  Status3Enum value for status.
         * @return Builder
         */
        public Builder status(Status3Enum status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for conclusion.
         * @param  conclusion  Object value for conclusion.
         * @return Builder
         */
        public Builder conclusion(Object conclusion) {
            this.conclusion = conclusion;
            return this;
        }

        /**
         * Setter for startedAt.
         * @param  startedAt  LocalDateTime value for startedAt.
         * @return Builder
         */
        public Builder startedAt(LocalDateTime startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * Setter for completedAt.
         * @param  completedAt  LocalDateTime value for completedAt.
         * @return Builder
         */
        public Builder completedAt(LocalDateTime completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for checkRunUrl.
         * @param  checkRunUrl  String value for checkRunUrl.
         * @return Builder
         */
        public Builder checkRunUrl(String checkRunUrl) {
            this.checkRunUrl = checkRunUrl;
            return this;
        }

        /**
         * Setter for labels.
         * @param  labels  List of String value for labels.
         * @return Builder
         */
        public Builder labels(List<String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Setter for runnerId.
         * @param  runnerId  Integer value for runnerId.
         * @return Builder
         */
        public Builder runnerId(Integer runnerId) {
            this.runnerId = runnerId;
            return this;
        }

        /**
         * Setter for runnerName.
         * @param  runnerName  String value for runnerName.
         * @return Builder
         */
        public Builder runnerName(String runnerName) {
            this.runnerName = runnerName;
            return this;
        }

        /**
         * Setter for runnerGroupId.
         * @param  runnerGroupId  Integer value for runnerGroupId.
         * @return Builder
         */
        public Builder runnerGroupId(Integer runnerGroupId) {
            this.runnerGroupId = runnerGroupId;
            return this;
        }

        /**
         * Setter for runnerGroupName.
         * @param  runnerGroupName  String value for runnerGroupName.
         * @return Builder
         */
        public Builder runnerGroupName(String runnerGroupName) {
            this.runnerGroupName = runnerGroupName;
            return this;
        }

        /**
         * Setter for workflowName.
         * @param  workflowName  String value for workflowName.
         * @return Builder
         */
        public Builder workflowName(String workflowName) {
            this.workflowName = workflowName;
            return this;
        }

        /**
         * Setter for headBranch.
         * @param  headBranch  String value for headBranch.
         * @return Builder
         */
        public Builder headBranch(String headBranch) {
            this.headBranch = headBranch;
            return this;
        }

        /**
         * Setter for runAttempt.
         * @param  runAttempt  Integer value for runAttempt.
         * @return Builder
         */
        public Builder runAttempt(Integer runAttempt) {
            this.runAttempt = runAttempt;
            return this;
        }

        /**
         * Setter for steps.
         * @param  steps  List of Step value for steps.
         * @return Builder
         */
        public Builder steps(List<Step> steps) {
            this.steps = steps;
            return this;
        }

        /**
         * Builds a new {@link ReposActionsJobsJobIdResponse} object using the set fields.
         * @return {@link ReposActionsJobsJobIdResponse}
         */
        public ReposActionsJobsJobIdResponse build() {
            return new ReposActionsJobsJobIdResponse(id, runId, runUrl, nodeId, headSha, url,
                    htmlUrl, status, conclusion, startedAt, completedAt, name, checkRunUrl, labels,
                    runnerId, runnerName, runnerGroupId, runnerGroupName, workflowName, headBranch,
                    runAttempt, steps);
        }
    }
}
