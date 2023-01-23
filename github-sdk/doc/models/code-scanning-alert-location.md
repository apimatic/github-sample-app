
# Code Scanning Alert Location

Describe a region within a file for the alert.

## Structure

`CodeScanningAlertLocation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Path` | `String` | Optional | - | String getPath() | setPath(String path) |
| `StartLine` | `Integer` | Optional | - | Integer getStartLine() | setStartLine(Integer startLine) |
| `EndLine` | `Integer` | Optional | - | Integer getEndLine() | setEndLine(Integer endLine) |
| `StartColumn` | `Integer` | Optional | - | Integer getStartColumn() | setStartColumn(Integer startColumn) |
| `EndColumn` | `Integer` | Optional | - | Integer getEndColumn() | setEndColumn(Integer endColumn) |

## Example (as JSON)

```json
{
  "path": null,
  "start_line": null,
  "end_line": null,
  "start_column": null,
  "end_column": null
}
```

