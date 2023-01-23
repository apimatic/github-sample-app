
# Orgs Actions Runner Groups Runners Response

## Structure

`OrgsActionsRunnerGroupsRunnersResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `double` | Required | - | double getTotalCount() | setTotalCount(double totalCount) |
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

