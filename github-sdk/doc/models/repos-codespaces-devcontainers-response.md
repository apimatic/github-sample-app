
# Repos Codespaces Devcontainers Response

## Structure

`ReposCodespacesDevcontainersResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `Devcontainers` | [`List<Devcontainer>`](../../doc/models/devcontainer.md) | Required | - | List<Devcontainer> getDevcontainers() | setDevcontainers(List<Devcontainer> devcontainers) |

## Example (as JSON)

```json
{
  "total_count": 104,
  "devcontainers": [
    {
      "path": "path4",
      "name": null
    },
    {
      "path": "path5",
      "name": null
    }
  ]
}
```

