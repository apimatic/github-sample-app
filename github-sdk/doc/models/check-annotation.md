
# Check Annotation

Check Annotation

## Structure

`CheckAnnotation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Path` | `String` | Required | - | String getPath() | setPath(String path) |
| `StartLine` | `int` | Required | - | int getStartLine() | setStartLine(int startLine) |
| `EndLine` | `int` | Required | - | int getEndLine() | setEndLine(int endLine) |
| `StartColumn` | `Integer` | Required | - | Integer getStartColumn() | setStartColumn(Integer startColumn) |
| `EndColumn` | `Integer` | Required | - | Integer getEndColumn() | setEndColumn(Integer endColumn) |
| `AnnotationLevel` | `String` | Required | - | String getAnnotationLevel() | setAnnotationLevel(String annotationLevel) |
| `Title` | `String` | Required | - | String getTitle() | setTitle(String title) |
| `Message` | `String` | Required | - | String getMessage() | setMessage(String message) |
| `RawDetails` | `String` | Required | - | String getRawDetails() | setRawDetails(String rawDetails) |
| `BlobHref` | `String` | Required | - | String getBlobHref() | setBlobHref(String blobHref) |

## Example (as JSON)

```json
{
  "path": "README.md",
  "start_line": 2,
  "end_line": 2,
  "start_column": 5,
  "end_column": 10,
  "annotation_level": "warning",
  "title": "Spell Checker",
  "message": "Check your spelling for 'banaas'.",
  "raw_details": "Do you mean 'bananas' or 'banana'?",
  "blob_href": null
}
```

