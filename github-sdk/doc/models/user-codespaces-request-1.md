
# User Codespaces Request 1

## Structure

`UserCodespacesRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PullRequest` | [`PullRequest58`](../../doc/models/pull-request-58.md) | Required | - | PullRequest58 getPullRequest() | setPullRequest(PullRequest58 pullRequest) |
| `Location` | `String` | Optional | Location for this codespace. Assigned by IP if not provided | String getLocation() | setLocation(String location) |
| `Machine` | `String` | Optional | Machine type to use for this codespace | String getMachine() | setMachine(String machine) |
| `DevcontainerPath` | `String` | Optional | Path to devcontainer.json config to use for this codespace | String getDevcontainerPath() | setDevcontainerPath(String devcontainerPath) |
| `WorkingDirectory` | `String` | Optional | Working directory for this codespace | String getWorkingDirectory() | setWorkingDirectory(String workingDirectory) |
| `IdleTimeoutMinutes` | `Integer` | Optional | Time in minutes before codespace stops from inactivity | Integer getIdleTimeoutMinutes() | setIdleTimeoutMinutes(Integer idleTimeoutMinutes) |

## Example (as JSON)

```json
{
  "pull_request": {
    "pull_request_number": 10,
    "repository_id": 232
  },
  "location": null,
  "machine": null,
  "devcontainer_path": null,
  "working_directory": null,
  "idle_timeout_minutes": null
}
```

