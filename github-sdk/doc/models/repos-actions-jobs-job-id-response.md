
# Repos Actions Jobs Job Id Response

## Structure

`ReposActionsJobsJobIdResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | The id of the job. | int getId() | setId(int id) |
| `RunId` | `int` | Required | The id of the associated workflow run. | int getRunId() | setRunId(int runId) |
| `RunUrl` | `String` | Required | - | String getRunUrl() | setRunUrl(String runUrl) |
| `RunAttempt` | `Integer` | Optional | Attempt number of the associated workflow run, 1 for first attempt and higher if the workflow was re-run. | Integer getRunAttempt() | setRunAttempt(Integer runAttempt) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `HeadSha` | `String` | Required | The SHA of the commit that is being run. | String getHeadSha() | setHeadSha(String headSha) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Status` | [`Status3Enum`](../../doc/models/status-3-enum.md) | Required | - | Status3Enum getStatus() | setStatus(Status3Enum status) |
| `Conclusion` | `Object` | Required | - | Object getConclusion() | setConclusion(Object conclusion) |
| `StartedAt` | `LocalDateTime` | Required | The time that the job started, in ISO 8601 format. | LocalDateTime getStartedAt() | setStartedAt(LocalDateTime startedAt) |
| `CompletedAt` | `LocalDateTime` | Required | The time that the job finished, in ISO 8601 format. | LocalDateTime getCompletedAt() | setCompletedAt(LocalDateTime completedAt) |
| `Name` | `String` | Required | The name of the job. | String getName() | setName(String name) |
| `Steps` | [`List<Step>`](../../doc/models/step.md) | Optional | Steps in this job. | List<Step> getSteps() | setSteps(List<Step> steps) |
| `CheckRunUrl` | `String` | Required | - | String getCheckRunUrl() | setCheckRunUrl(String checkRunUrl) |
| `Labels` | `List<String>` | Required | Labels for the workflow job. Specified by the "runs_on" attribute in the action's workflow file. | List<String> getLabels() | setLabels(List<String> labels) |
| `RunnerId` | `Integer` | Required | The ID of the runner to which this job has been assigned. (If a runner hasn't yet been assigned, this will be null.) | Integer getRunnerId() | setRunnerId(Integer runnerId) |
| `RunnerName` | `String` | Required | The name of the runner to which this job has been assigned. (If a runner hasn't yet been assigned, this will be null.) | String getRunnerName() | setRunnerName(String runnerName) |
| `RunnerGroupId` | `Integer` | Required | The ID of the runner group to which this job has been assigned. (If a runner hasn't yet been assigned, this will be null.) | Integer getRunnerGroupId() | setRunnerGroupId(Integer runnerGroupId) |
| `RunnerGroupName` | `String` | Required | The name of the runner group to which this job has been assigned. (If a runner hasn't yet been assigned, this will be null.) | String getRunnerGroupName() | setRunnerGroupName(String runnerGroupName) |
| `WorkflowName` | `String` | Required | The name of the workflow. | String getWorkflowName() | setWorkflowName(String workflowName) |
| `HeadBranch` | `String` | Required | The name of the current branch. | String getHeadBranch() | setHeadBranch(String headBranch) |

## Example (as JSON)

```json
{
  "id": 21,
  "run_id": 5,
  "run_url": "https://api.github.com/repos/github/hello-world/actions/runs/5",
  "node_id": "MDg6Q2hlY2tSdW40",
  "head_sha": "009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d",
  "url": "https://api.github.com/repos/github/hello-world/actions/jobs/21",
  "html_url": "https://github.com/github/hello-world/runs/4",
  "status": null,
  "conclusion": null,
  "started_at": "08/08/2019 20:00:00",
  "completed_at": "08/08/2019 20:00:00",
  "name": "test-coverage",
  "check_run_url": "https://api.github.com/repos/github/hello-world/check-runs/4",
  "labels": [
    "self-hosted",
    "foo",
    "bar"
  ],
  "runner_id": 1,
  "runner_name": "my runner",
  "runner_group_id": 2,
  "runner_group_name": "my runner group",
  "workflow_name": "Build",
  "head_branch": "main"
}
```

