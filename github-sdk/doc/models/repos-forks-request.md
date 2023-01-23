
# Repos Forks Request

## Structure

`ReposForksRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Organization` | `String` | Optional | Optional parameter to specify the organization name if forking into an organization. | String getOrganization() | setOrganization(String organization) |
| `Name` | `String` | Optional | When forking from an existing repository, a new name for the fork. | String getName() | setName(String name) |
| `DefaultBranchOnly` | `Boolean` | Optional | When forking from an existing repository, fork with only the default branch. | Boolean getDefaultBranchOnly() | setDefaultBranchOnly(Boolean defaultBranchOnly) |

## Example (as JSON)

```json
{
  "organization": null,
  "name": null,
  "default_branch_only": null
}
```

