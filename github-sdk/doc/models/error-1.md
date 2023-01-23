
# Error 1

## Structure

`Error1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Line` | `int` | Required | The line number where this errors occurs. | int getLine() | setLine(int line) |
| `Column` | `int` | Required | The column number where this errors occurs. | int getColumn() | setColumn(int column) |
| `Source` | `String` | Optional | The contents of the line where the error occurs. | String getSource() | setSource(String source) |
| `Kind` | `String` | Required | The type of error. | String getKind() | setKind(String kind) |
| `Suggestion` | `String` | Optional | Suggested action to fix the error. This will usually be `null`, but is provided for some common errors. | String getSuggestion() | setSuggestion(String suggestion) |
| `Message` | `String` | Required | A human-readable description of the error, combining information from multiple fields, laid out for display in a monospaced typeface (for example, a command-line setting). | String getMessage() | setMessage(String message) |
| `Path` | `String` | Required | The path of the file where the error occured. | String getPath() | setPath(String path) |

## Example (as JSON)

```json
{
  "line": 7,
  "column": 3,
  "kind": "Invalid owner",
  "message": "Invalid owner on line 7:\n\n  * user\n    ^",
  "path": ".github/CODEOWNERS"
}
```

