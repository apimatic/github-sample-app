
# Repos Codeowners Errors Response

## Structure

`ReposCodeownersErrorsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`List<Error1>`](../../doc/models/error-1.md) | Required | - | List<Error1> getErrors() | setErrors(List<Error1> errors) |

## Example (as JSON)

```json
{
  "errors": {
    "line": 7,
    "column": 3,
    "kind": "Invalid owner",
    "message": "Invalid owner on line 7:\n\n  * user\n    ^",
    "path": ".github/CODEOWNERS"
  }
}
```

