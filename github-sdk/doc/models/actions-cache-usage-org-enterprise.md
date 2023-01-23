
# Actions Cache Usage Org Enterprise

## Structure

`ActionsCacheUsageOrgEnterprise`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalActiveCachesCount` | `int` | Required | The count of active caches across all repositories of an enterprise or an organization. | int getTotalActiveCachesCount() | setTotalActiveCachesCount(int totalActiveCachesCount) |
| `TotalActiveCachesSizeInBytes` | `int` | Required | The total size in bytes of all active cache items across all repositories of an enterprise or an organization. | int getTotalActiveCachesSizeInBytes() | setTotalActiveCachesSizeInBytes(int totalActiveCachesSizeInBytes) |

## Example (as JSON)

```json
{
  "total_active_caches_count": 190,
  "total_active_caches_size_in_bytes": 42
}
```

