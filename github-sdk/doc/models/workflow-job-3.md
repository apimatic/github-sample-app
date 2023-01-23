
# Workflow Job 3

## Structure

`WorkflowJob3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CheckRunUrl` | `String` | Required | - | String getCheckRunUrl() | setCheckRunUrl(String checkRunUrl) |
| `CompletedAt` | `String` | Required | - | String getCompletedAt() | setCompletedAt(String completedAt) |
| `Conclusion` | `String` | Required | - | String getConclusion() | setConclusion(String conclusion) |
| `HeadSha` | `String` | Required | - | String getHeadSha() | setHeadSha(String headSha) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Labels` | `List<String>` | Required | - | List<String> getLabels() | setLabels(List<String> labels) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `RunAttempt` | `int` | Required | - | int getRunAttempt() | setRunAttempt(int runAttempt) |
| `RunId` | `double` | Required | - | double getRunId() | setRunId(double runId) |
| `RunUrl` | `String` | Required | - | String getRunUrl() | setRunUrl(String runUrl) |
| `RunnerGroupId` | `Integer` | Required | - | Integer getRunnerGroupId() | setRunnerGroupId(Integer runnerGroupId) |
| `RunnerGroupName` | `String` | Required | - | String getRunnerGroupName() | setRunnerGroupName(String runnerGroupName) |
| `RunnerId` | `Integer` | Required | - | Integer getRunnerId() | setRunnerId(Integer runnerId) |
| `RunnerName` | `String` | Required | - | String getRunnerName() | setRunnerName(String runnerName) |
| `StartedAt` | `LocalDateTime` | Required | - | LocalDateTime getStartedAt() | setStartedAt(LocalDateTime startedAt) |
| `HeadBranch` | `String` | Required | The name of the current branch. | String getHeadBranch() | setHeadBranch(String headBranch) |
| `WorkflowName` | `String` | Required | The name of the workflow. | String getWorkflowName() | setWorkflowName(String workflowName) |
| `Status` | [`Status25Enum`](../../doc/models/status-25-enum.md) | Required | - | Status25Enum getStatus() | setStatus(Status25Enum status) |
| `Steps` | [`List<WorkflowStep3>`](../../doc/models/workflow-step-3.md) | Required | - | List<WorkflowStep3> getSteps() | setSteps(List<WorkflowStep3> steps) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "check_run_url": "check_run_url4",
  "completed_at": "completed_at2",
  "conclusion": "conclusion4",
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
  "started_at": "2016-03-13T12:52:32.123Z",
  "head_branch": "head_branch0",
  "workflow_name": "workflow_name2",
  "status": "queued",
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

