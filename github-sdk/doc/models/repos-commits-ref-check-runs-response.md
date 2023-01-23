
# Repos Commits Ref Check Runs Response

## Structure

`ReposCommitsRefCheckRunsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `CheckRuns` | [`List<CheckRun>`](../../doc/models/check-run.md) | Required | - | List<CheckRun> getCheckRuns() | setCheckRuns(List<CheckRun> checkRuns) |

## Example (as JSON)

```json
{
  "total_count": null,
  "check_runs": {
    "id": 21,
    "head_sha": "009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d",
    "node_id": "MDg6Q2hlY2tSdW40",
    "external_id": "42",
    "url": "https://api.github.com/repos/github/hello-world/check-runs/4",
    "html_url": "https://github.com/github/hello-world/runs/4",
    "details_url": "https://example.com",
    "status": null,
    "conclusion": null,
    "started_at": "05/04/2018 01:14:52",
    "completed_at": "05/04/2018 01:14:52",
    "output": null,
    "name": "test-coverage",
    "check_suite": null,
    "app": null,
    "pull_requests": null
  }
}
```

