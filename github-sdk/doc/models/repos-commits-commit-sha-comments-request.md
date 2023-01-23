
# Repos Commits Commit Sha Comments Request

## Structure

`ReposCommitsCommitShaCommentsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Body` | `String` | Required | The contents of the comment. | String getBody() | setBody(String body) |
| `Path` | `String` | Optional | Relative path of the file to comment on. | String getPath() | setPath(String path) |
| `Position` | `Integer` | Optional | Line index in the diff to comment on. | Integer getPosition() | setPosition(Integer position) |
| `Line` | `Integer` | Optional | **Deprecated**. Use **position** parameter instead. Line number in the file to comment on. | Integer getLine() | setLine(Integer line) |

## Example (as JSON)

```json
{
  "body": "body6",
  "path": null,
  "position": null,
  "line": null
}
```

