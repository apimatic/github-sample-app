
# Repos Actions Caches Response

## Structure

`ReposActionsCachesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | Total number of caches | int getTotalCount() | setTotalCount(int totalCount) |
| `ActionsCaches` | [`List<ActionsCach>`](../../doc/models/actions-cach.md) | Required | Array of caches | List<ActionsCach> getActionsCaches() | setActionsCaches(List<ActionsCach> actionsCaches) |

## Example (as JSON)

```json
{
  "total_count": 2,
  "actions_caches": null
}
```

