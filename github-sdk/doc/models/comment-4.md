
# Comment 4

## Structure

`Comment4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Path` | `String` | Required | The relative path to the file that necessitates a review comment. | String getPath() | setPath(String path) |
| `Position` | `Integer` | Optional | The position in the diff where you want to add a review comment. Note this value is not the same as the line number in the file. For help finding the position value, read the note below. | Integer getPosition() | setPosition(Integer position) |
| `Body` | `String` | Required | Text of the review comment. | String getBody() | setBody(String body) |
| `Line` | `Integer` | Optional | - | Integer getLine() | setLine(Integer line) |
| `Side` | `String` | Optional | - | String getSide() | setSide(String side) |
| `StartLine` | `Integer` | Optional | - | Integer getStartLine() | setStartLine(Integer startLine) |
| `StartSide` | `String` | Optional | - | String getStartSide() | setStartSide(String startSide) |

## Example (as JSON)

```json
{
  "path": "path6",
  "position": null,
  "body": "body6",
  "line": null,
  "side": null,
  "start_line": null,
  "start_side": null
}
```

