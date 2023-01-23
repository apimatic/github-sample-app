
# Orgs Actions Cache Usage by Repository Response

## Structure

`OrgsActionsCacheUsageByRepositoryResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `RepositoryCacheUsages` | [`List<ActionsCacheUsagebyrepository>`](../../doc/models/actions-cache-usagebyrepository.md) | Required | - | List<ActionsCacheUsagebyrepository> getRepositoryCacheUsages() | setRepositoryCacheUsages(List<ActionsCacheUsagebyrepository> repositoryCacheUsages) |

## Example (as JSON)

```json
{
  "total_count": null,
  "repository_cache_usages": {
    "full_name": "octo-org/Hello-World",
    "active_caches_size_in_bytes": 2322142,
    "active_caches_count": 3
  }
}
```

