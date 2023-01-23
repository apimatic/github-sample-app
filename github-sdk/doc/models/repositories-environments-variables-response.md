
# Repositories Environments Variables Response

## Structure

`RepositoriesEnvironmentsVariablesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `Variables` | [`List<ActionsVariable>`](../../doc/models/actions-variable.md) | Required | - | List<ActionsVariable> getVariables() | setVariables(List<ActionsVariable> variables) |

## Example (as JSON)

```json
{
  "total_count": null,
  "variables": {
    "name": "USERNAME",
    "value": "octocat",
    "created_at": "01/24/2019 22:45:36",
    "updated_at": "01/24/2019 22:45:36"
  }
}
```

