
# Annotation

## Structure

`Annotation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Path` | `String` | Required | The path of the file to add an annotation to. For example, `assets/css/main.css`. | String getPath() | setPath(String path) |
| `StartLine` | `int` | Required | The start line of the annotation. Line numbers start at 1. | int getStartLine() | setStartLine(int startLine) |
| `EndLine` | `int` | Required | The end line of the annotation. | int getEndLine() | setEndLine(int endLine) |
| `StartColumn` | `Integer` | Optional | The start column of the annotation. Annotations only support `start_column` and `end_column` on the same line. Omit this parameter if `start_line` and `end_line` have different values. Column numbers start at 1. | Integer getStartColumn() | setStartColumn(Integer startColumn) |
| `EndColumn` | `Integer` | Optional | The end column of the annotation. Annotations only support `start_column` and `end_column` on the same line. Omit this parameter if `start_line` and `end_line` have different values. | Integer getEndColumn() | setEndColumn(Integer endColumn) |
| `AnnotationLevel` | [`AnnotationLevelEnum`](../../doc/models/annotation-level-enum.md) | Required | - | AnnotationLevelEnum getAnnotationLevel() | setAnnotationLevel(AnnotationLevelEnum annotationLevel) |
| `Message` | `String` | Required | A short description of the feedback for these lines of code. The maximum size is 64 KB. | String getMessage() | setMessage(String message) |
| `Title` | `String` | Optional | The title that represents the annotation. The maximum size is 255 characters. | String getTitle() | setTitle(String title) |
| `RawDetails` | `String` | Optional | Details about this annotation. The maximum size is 64 KB. | String getRawDetails() | setRawDetails(String rawDetails) |

## Example (as JSON)

```json
{
  "path": "path6",
  "start_line": 194,
  "end_line": 34,
  "start_column": null,
  "end_column": null,
  "annotation_level": "failure",
  "message": "message0",
  "title": null,
  "raw_details": null
}
```

