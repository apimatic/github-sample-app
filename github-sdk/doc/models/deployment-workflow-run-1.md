
# Deployment Workflow Run 1

## Structure

`DeploymentWorkflowRun1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Actor` | `Object` | Required | - | Object getActor() | setActor(Object actor) |
| `ArtifactsUrl` | `String` | Optional | - | String getArtifactsUrl() | setArtifactsUrl(String artifactsUrl) |
| `CancelUrl` | `String` | Optional | - | String getCancelUrl() | setCancelUrl(String cancelUrl) |
| `CheckSuiteId` | `int` | Required | - | int getCheckSuiteId() | setCheckSuiteId(int checkSuiteId) |
| `CheckSuiteNodeId` | `String` | Required | - | String getCheckSuiteNodeId() | setCheckSuiteNodeId(String checkSuiteNodeId) |
| `CheckSuiteUrl` | `String` | Optional | - | String getCheckSuiteUrl() | setCheckSuiteUrl(String checkSuiteUrl) |
| `Conclusion` | `Object` | Required | - | Object getConclusion() | setConclusion(Object conclusion) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `DisplayTitle` | `String` | Required | - | String getDisplayTitle() | setDisplayTitle(String displayTitle) |
| `Event` | `String` | Required | - | String getEvent() | setEvent(String event) |
| `HeadBranch` | `String` | Required | - | String getHeadBranch() | setHeadBranch(String headBranch) |
| `HeadCommit` | `Object` | Optional | - | Object getHeadCommit() | setHeadCommit(Object headCommit) |
| `HeadRepository` | [`HeadRepository`](../../doc/models/head-repository.md) | Optional | - | HeadRepository getHeadRepository() | setHeadRepository(HeadRepository headRepository) |
| `HeadSha` | `String` | Required | - | String getHeadSha() | setHeadSha(String headSha) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `JobsUrl` | `String` | Optional | - | String getJobsUrl() | setJobsUrl(String jobsUrl) |
| `LogsUrl` | `String` | Optional | - | String getLogsUrl() | setLogsUrl(String logsUrl) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Path` | `String` | Required | - | String getPath() | setPath(String path) |
| `PreviousAttemptUrl` | `Object` | Optional | - | Object getPreviousAttemptUrl() | setPreviousAttemptUrl(Object previousAttemptUrl) |
| `PullRequests` | [`List<CheckRunPullRequest>`](../../doc/models/check-run-pull-request.md) | Required | - | List<CheckRunPullRequest> getPullRequests() | setPullRequests(List<CheckRunPullRequest> pullRequests) |
| `ReferencedWorkflows` | [`List<ReferencedWorkflow1>`](../../doc/models/referenced-workflow-1.md) | Optional | - | List<ReferencedWorkflow1> getReferencedWorkflows() | setReferencedWorkflows(List<ReferencedWorkflow1> referencedWorkflows) |
| `Repository` | [`HeadRepository`](../../doc/models/head-repository.md) | Optional | - | HeadRepository getRepository() | setRepository(HeadRepository repository) |
| `RerunUrl` | `String` | Optional | - | String getRerunUrl() | setRerunUrl(String rerunUrl) |
| `RunAttempt` | `int` | Required | - | int getRunAttempt() | setRunAttempt(int runAttempt) |
| `RunNumber` | `int` | Required | - | int getRunNumber() | setRunNumber(int runNumber) |
| `RunStartedAt` | `LocalDateTime` | Required | - | LocalDateTime getRunStartedAt() | setRunStartedAt(LocalDateTime runStartedAt) |
| `Status` | [`Status17Enum`](../../doc/models/status-17-enum.md) | Required | - | Status17Enum getStatus() | setStatus(Status17Enum status) |
| `TriggeringActor` | `Object` | Required | - | Object getTriggeringActor() | setTriggeringActor(Object triggeringActor) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `WorkflowId` | `int` | Required | - | int getWorkflowId() | setWorkflowId(int workflowId) |
| `WorkflowUrl` | `String` | Optional | - | String getWorkflowUrl() | setWorkflowUrl(String workflowUrl) |

## Example (as JSON)

```json
{
  "actor": {
    "key1": "val1",
    "key2": "val2"
  },
  "artifacts_url": null,
  "cancel_url": null,
  "check_suite_id": 84,
  "check_suite_node_id": "check_suite_node_id6",
  "check_suite_url": null,
  "conclusion": {
    "key1": "val1",
    "key2": "val2"
  },
  "created_at": "2016-03-13T12:52:32.123Z",
  "display_title": "display_title0",
  "event": "event0",
  "head_branch": "head_branch0",
  "head_commit": null,
  "head_repository": null,
  "head_sha": "head_sha6",
  "html_url": "html_url0",
  "id": 112,
  "jobs_url": null,
  "logs_url": null,
  "name": "name0",
  "node_id": "node_id2",
  "path": "path6",
  "previous_attempt_url": null,
  "pull_requests": [
    {
      "base": {
        "ref": "ref5",
        "sha": "sha1",
        "repo": {
          "id": 97,
          "name": "name1",
          "url": "url5"
        }
      },
      "head": {
        "ref": "ref1",
        "sha": "sha7",
        "repo": {
          "id": 219,
          "name": "name7",
          "url": "url1"
        }
      },
      "id": 157,
      "number": 143,
      "url": "url3"
    }
  ],
  "referenced_workflows": null,
  "repository": null,
  "rerun_url": null,
  "run_attempt": 226,
  "run_number": 144,
  "run_started_at": "2016-03-13T12:52:32.123Z",
  "status": "completed",
  "triggering_actor": {
    "key1": "val1",
    "key2": "val2"
  },
  "updated_at": "2016-03-13T12:52:32.123Z",
  "url": "url4",
  "workflow_id": 8,
  "workflow_url": null
}
```

