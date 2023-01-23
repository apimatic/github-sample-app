
# Environment

Details of a deployment environment

## Structure

`Environment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | The id of the environment. | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Name` | `String` | Required | The name of the environment. | String getName() | setName(String name) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `CreatedAt` | `LocalDateTime` | Required | The time that the environment was created, in ISO 8601 format. | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | The time that the environment was last updated, in ISO 8601 format. | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `ProtectionRules` | [`List<ProtectionRule3>`]($m/EnvironmentProtectionRules) | Optional | - | List<ProtectionRule3> getProtectionRules() | setProtectionRules(List<ProtectionRule3> protectionRules) |
| `DeploymentBranchPolicy` | `Object` | Optional | - | Object getDeploymentBranchPolicy() | setDeploymentBranchPolicy(Object deploymentBranchPolicy) |

## Example (as JSON)

```json
{
  "id": 56780428,
  "node_id": "MDExOkVudmlyb25tZW50NTY3ODA0Mjg=",
  "name": "staging",
  "url": "https://api.github.com/repos/github/hello-world/environments/staging",
  "html_url": "https://github.com/github/hello-world/deployments/activity_log?environments_filter=staging",
  "created_at": "11/23/2020 22:00:40",
  "updated_at": "11/23/2020 22:00:40"
}
```

