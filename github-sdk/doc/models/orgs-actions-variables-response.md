
# Orgs Actions Variables Response

## Structure

`OrgsActionsVariablesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `Variables` | [`List<ActionsVariableforanOrganization>`](../../doc/models/actions-variableforan-organization.md) | Required | - | List<ActionsVariableforanOrganization> getVariables() | setVariables(List<ActionsVariableforanOrganization> variables) |

## Example (as JSON)

```json
{
  "total_count": null,
  "variables": {
    "name": "USERNAME",
    "value": "octocat",
    "created_at": "01/24/2019 22:45:36",
    "updated_at": "01/24/2019 22:45:36",
    "visibility": null
  }
}
```

