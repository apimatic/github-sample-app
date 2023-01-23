
# Repos Environments Response

## Structure

`ReposEnvironmentsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `Integer` | Optional | The number of environments in this repository | Integer getTotalCount() | setTotalCount(Integer totalCount) |
| `Environments` | [`List<Environment>`](../../doc/models/environment.md) | Optional | - | List<Environment> getEnvironments() | setEnvironments(List<Environment> environments) |

## Example (as JSON)

```json
{
  "total_count": null,
  "environments": null
}
```

