
# Repos Branches Branch Protection Restrictions Apps Request

## Structure

`ReposBranchesBranchProtectionRestrictionsAppsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Apps` | `List<String>` | Required | The GitHub Apps that have push access to this branch. Use the slugified version of the app name. **Note**: The list of users, apps, and teams in total is limited to 100 items. | List<String> getApps() | setApps(List<String> apps) |

## Example (as JSON)

```json
{
  "apps": [
    "my-app"
  ]
}
```

