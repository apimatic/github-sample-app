
# Repos Actions Runs Run Id Attempts Attempt Number Jobs Response

## Structure

`ReposActionsRunsRunIdAttemptsAttemptNumberJobsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `Jobs` | [`List<Job>`](../../doc/models/job.md) | Required | - | List<Job> getJobs() | setJobs(List<Job> jobs) |

## Example (as JSON)

```json
{
  "total_count": null,
  "jobs": {
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
}
```

