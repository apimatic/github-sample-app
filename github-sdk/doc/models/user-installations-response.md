
# User Installations Response

## Structure

`UserInstallationsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `Installations` | [`List<Installation>`](../../doc/models/installation.md) | Required | - | List<Installation> getInstallations() | setInstallations(List<Installation> installations) |

## Example (as JSON)

```json
{
  "total_count": null,
  "installations": {
    "id": 1,
    "account": null,
    "repository_selection": null,
    "access_tokens_url": "https://api.github.com/installations/1/access_tokens",
    "repositories_url": "https://api.github.com/installation/repositories",
    "html_url": "https://github.com/organizations/github/settings/installations/1",
    "app_id": 1,
    "target_id": null,
    "target_type": "Organization",
    "permissions": null,
    "events": null,
    "created_at": null,
    "updated_at": null,
    "single_file_name": "config.yaml",
    "app_slug": "github-actions",
    "suspended_by": null,
    "suspended_at": null
  }
}
```

