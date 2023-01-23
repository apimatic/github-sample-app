
# Permissions

The set of permissions for the GitHub app

## Structure

`Permissions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | `String` | Optional | - | String getIssues() | setIssues(String issues) |
| `Checks` | `String` | Optional | - | String getChecks() | setChecks(String checks) |
| `Metadata` | `String` | Optional | - | String getMetadata() | setMetadata(String metadata) |
| `Contents` | `String` | Optional | - | String getContents() | setContents(String contents) |
| `Deployments` | `String` | Optional | - | String getDeployments() | setDeployments(String deployments) |

## Example (as JSON)

```json
{
  "issues": "read",
  "deployments": "write"
}
```

