
# UBUNTU1

## Structure

`UBUNTU1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalMs` | `int` | Required | - | int getTotalMs() | setTotalMs(int totalMs) |
| `Jobs` | `int` | Required | - | int getJobs() | setJobs(int jobs) |
| `JobRuns` | [`List<JobRun>`](../../doc/models/job-run.md) | Optional | - | List<JobRun> getJobRuns() | setJobRuns(List<JobRun> jobRuns) |

## Example (as JSON)

```json
{
  "total_ms": 204,
  "jobs": 178,
  "job_runs": null
}
```

