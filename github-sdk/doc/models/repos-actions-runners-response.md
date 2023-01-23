
# Repos Actions Runners Response

## Structure

`ReposActionsRunnersResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `Runners` | [`List<Selfhostedrunners>`](../../doc/models/selfhostedrunners.md) | Required | - | List<Selfhostedrunners> getRunners() | setRunners(List<Selfhostedrunners> runners) |

## Example (as JSON)

```json
{
  "total_count": null,
  "runners": {
    "id": 5,
    "name": "iMac",
    "os": "macos",
    "status": "online",
    "busy": null,
    "labels": null
  }
}
```

