
# Codes of Conduct Response

## Structure

`CodesOfConductResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Key` | `String` | Required | - | String getKey() | setKey(String key) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Body` | `String` | Optional | - | String getBody() | setBody(String body) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |

## Example (as JSON)

```json
{
  "key": "contributor_covenant",
  "name": "Contributor Covenant",
  "url": "https://api.github.com/codes_of_conduct/contributor_covenant",
  "html_url": null
}
```

