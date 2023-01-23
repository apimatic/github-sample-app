
# Job 1

## Structure

`Job1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The external ID of the job. | String getId() | setId(String id) |
| `Correlator` | `String` | Required | Correlator provides a key that is used to group snapshots submitted over time. Only the "latest" submitted snapshot for a given combination of `job.correlator` and `detector.name` will be considered when calculating a repository's current dependencies. Correlator should be as unique as it takes to distinguish all detection runs for a given "wave" of CI workflow you run. If you're using GitHub Actions, a good default value for this could be the environment variables GITHUB_WORKFLOW and GITHUB_JOB concatenated together. If you're using a build matrix, then you'll also need to add additional key(s) to distinguish between each submission inside a matrix variation. | String getCorrelator() | setCorrelator(String correlator) |
| `HtmlUrl` | `String` | Optional | The url for the job. | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |

## Example (as JSON)

```json
{
  "id": "5622a2b0-63f6-4732-8c34-a1ab27e102a11",
  "correlator": "yourworkflowname_yourjobname"
}
```

