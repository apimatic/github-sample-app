
# License Simple

License Simple

## Structure

`LicenseSimple`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Key` | `String` | Required | - | String getKey() | setKey(String key) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `SpdxId` | `String` | Required | - | String getSpdxId() | setSpdxId(String spdxId) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `HtmlUrl` | `String` | Optional | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |

## Example (as JSON)

```json
{
  "key": "mit",
  "name": "MIT License",
  "url": "https://api.github.com/licenses/mit",
  "spdx_id": "MIT",
  "node_id": "MDc6TGljZW5zZW1pdA=="
}
```

