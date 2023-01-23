
# Repos Actions Cache Usage Response

## Structure

`ReposActionsCacheUsageResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FullName` | `String` | Required | The repository owner and name for the cache usage being shown. | String getFullName() | setFullName(String fullName) |
| `ActiveCachesSizeInBytes` | `int` | Required | The sum of the size in bytes of all the active cache items in the repository. | int getActiveCachesSizeInBytes() | setActiveCachesSizeInBytes(int activeCachesSizeInBytes) |
| `ActiveCachesCount` | `int` | Required | The number of active caches in the repository. | int getActiveCachesCount() | setActiveCachesCount(int activeCachesCount) |

## Example (as JSON)

```json
{
  "full_name": "octo-org/Hello-World",
  "active_caches_size_in_bytes": 2322142,
  "active_caches_count": 3
}
```

