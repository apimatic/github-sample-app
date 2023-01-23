
# Workflow Job

## Structure

`WorkflowJob`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CheckRunUrl` | `String` | Required | - | String getCheckRunUrl() | setCheckRunUrl(String checkRunUrl) |
| `CompletedAt` | `String` | Required | - | String getCompletedAt() | setCompletedAt(String completedAt) |
| `Conclusion` | `Object` | Required | - | Object getConclusion() | setConclusion(Object conclusion) |
| `HeadSha` | `String` | Required | - | String getHeadSha() | setHeadSha(String headSha) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Labels` | `List<String>` | Required | Custom labels for the job. Specified by the [`"runs-on"` attribute](https://docs.github.com/actions/reference/workflow-syntax-for-github-actions#jobsjob_idruns-on) in the workflow YAML. | List<String> getLabels() | setLabels(List<String> labels) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `RunAttempt` | `int` | Required | - | int getRunAttempt() | setRunAttempt(int runAttempt) |
| `RunId` | `double` | Required | - | double getRunId() | setRunId(double runId) |
| `RunUrl` | `String` | Required | - | String getRunUrl() | setRunUrl(String runUrl) |
| `RunnerGroupId` | `Integer` | Required | The ID of the runner group that is running this job. This will be `null` as long as `workflow_job[status]` is `queued`. | Integer getRunnerGroupId() | setRunnerGroupId(Integer runnerGroupId) |
| `RunnerGroupName` | `String` | Required | The name of the runner group that is running this job. This will be `null` as long as `workflow_job[status]` is `queued`. | String getRunnerGroupName() | setRunnerGroupName(String runnerGroupName) |
| `RunnerId` | `Integer` | Required | The ID of the runner that is running this job. This will be `null` as long as `workflow_job[status]` is `queued`. | Integer getRunnerId() | setRunnerId(Integer runnerId) |
| `RunnerName` | `String` | Required | The name of the runner that is running this job. This will be `null` as long as `workflow_job[status]` is `queued`. | String getRunnerName() | setRunnerName(String runnerName) |
| `StartedAt` | `String` | Required | - | String getStartedAt() | setStartedAt(String startedAt) |
| `Status` | [`Status21Enum`](../../doc/models/status-21-enum.md) | Required | - | Status21Enum getStatus() | setStatus(Status21Enum status) |
| `HeadBranch` | `String` | Required | The name of the current branch. | String getHeadBranch() | setHeadBranch(String headBranch) |
| `WorkflowName` | `String` | Required | The name of the workflow. | String getWorkflowName() | setWorkflowName(String workflowName) |
| `Steps` | [`List<WorkflowStep>`](../../doc/models/workflow-step.md) | Required | - | List<WorkflowStep> getSteps() | setSteps(List<WorkflowStep> steps) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "check_run_url": "check_run_url4",
  "completed_at": "completed_at2",
  "conclusion": {
    "key1": "val1",
    "key2": "val2"
  },
  "head_sha": "head_sha6",
  "html_url": "html_url0",
  "id": 112,
  "labels": [
    "labels4",
    "labels5"
  ],
  "name": "name0",
  "node_id": "node_id2",
  "run_attempt": 226,
  "run_id": 250.68,
  "run_url": "run_url8",
  "runner_group_id": 142,
  "runner_group_name": "runner_group_name0",
  "runner_id": 22,
  "runner_name": "runner_name0",
  "started_at": "started_at2",
  "status": "queued",
  "head_branch": "head_branch0",
  "workflow_name": "workflow_name2",
  "steps": [
    {
      "completed_at": "completed_at8",
      "conclusion": {
        "key1": "val1",
        "key2": "val2"
      },
      "name": "name6",
      "number": 154,
      "started_at": "started_at8",
      "status": "completed"
    }
  ],
  "url": "url4"
}
```

