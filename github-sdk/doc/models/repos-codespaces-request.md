
# Repos Codespaces Request

## Structure

`ReposCodespacesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ref` | `String` | Optional | Git ref (typically a branch name) for this codespace | String getRef() | setRef(String ref) |
| `Location` | `String` | Optional | Location for this codespace. Assigned by IP if not provided | String getLocation() | setLocation(String location) |
| `ClientIp` | `String` | Optional | IP for location auto-detection when proxying a request | String getClientIp() | setClientIp(String clientIp) |
| `Machine` | `String` | Optional | Machine type to use for this codespace | String getMachine() | setMachine(String machine) |
| `DevcontainerPath` | `String` | Optional | Path to devcontainer.json config to use for this codespace | String getDevcontainerPath() | setDevcontainerPath(String devcontainerPath) |
| `MultiRepoPermissionsOptOut` | `Boolean` | Optional | Whether to authorize requested permissions from devcontainer.json | Boolean getMultiRepoPermissionsOptOut() | setMultiRepoPermissionsOptOut(Boolean multiRepoPermissionsOptOut) |
| `WorkingDirectory` | `String` | Optional | Working directory for this codespace | String getWorkingDirectory() | setWorkingDirectory(String workingDirectory) |
| `IdleTimeoutMinutes` | `Integer` | Optional | Time in minutes before codespace stops from inactivity | Integer getIdleTimeoutMinutes() | setIdleTimeoutMinutes(Integer idleTimeoutMinutes) |
| `DisplayName` | `String` | Optional | Display name for this codespace | String getDisplayName() | setDisplayName(String displayName) |
| `RetentionPeriodMinutes` | `Integer` | Optional | Duration in minutes after codespace has gone idle in which it will be deleted. Must be integer minutes between 0 and 43200 (30 days). | Integer getRetentionPeriodMinutes() | setRetentionPeriodMinutes(Integer retentionPeriodMinutes) |

## Example (as JSON)

```json
{
  "ref": null,
  "location": null,
  "client_ip": null,
  "machine": null,
  "devcontainer_path": null,
  "multi_repo_permissions_opt_out": null,
  "working_directory": null,
  "idle_timeout_minutes": null,
  "display_name": null,
  "retention_period_minutes": null
}
```

