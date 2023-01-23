
# Protected Branch Admin Enforced

Protected Branch Admin Enforced

## Structure

`ProtectedBranchAdminEnforced`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Enabled` | `boolean` | Required | - | boolean getEnabled() | setEnabled(boolean enabled) |

## Example (as JSON)

```json
{
  "url": "https://api.github.com/repos/octocat/Hello-World/branches/master/protection/enforce_admins",
  "enabled": true
}
```

