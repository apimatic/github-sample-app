
# Git Hub Pages 1

The GitHub Pages deployment status.

## Structure

`GitHubPages1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StatusUrl` | `String` | Required | The URI to monitor GitHub Pages deployment status. | String getStatusUrl() | setStatusUrl(String statusUrl) |
| `PageUrl` | `String` | Required | The URI to the deployed GitHub Pages. | String getPageUrl() | setPageUrl(String pageUrl) |
| `PreviewUrl` | `String` | Optional | The URI to the deployed GitHub Pages preview. | String getPreviewUrl() | setPreviewUrl(String previewUrl) |

## Example (as JSON)

```json
{
  "status_url": "https://api.github.com/repos/github/hello-world/pages/deployments/4fd754f7e594640989b406850d0bc8f06a121251/status",
  "page_url": "hello-world.github.io"
}
```

