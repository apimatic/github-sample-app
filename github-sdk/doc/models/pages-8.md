
# Pages 8

## Structure

`Pages8`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Action` | [`Action3Enum`](../../doc/models/action-3-enum.md) | Required | - | Action3Enum getAction() | setAction(Action3Enum action) |
| `HtmlUrl` | `String` | Required | Points to the HTML wiki page. | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `PageName` | `String` | Required | The name of the page. | String getPageName() | setPageName(String pageName) |
| `Sha` | `String` | Required | The latest commit SHA of the page. | String getSha() | setSha(String sha) |
| `Summary` | `String` | Required | - | String getSummary() | setSummary(String summary) |
| `Title` | `String` | Required | The current page title. | String getTitle() | setTitle(String title) |

## Example (as JSON)

```json
{
  "action": "created",
  "html_url": "html_url0",
  "page_name": "page_name0",
  "sha": "sha6",
  "summary": "summary2",
  "title": "title4"
}
```

