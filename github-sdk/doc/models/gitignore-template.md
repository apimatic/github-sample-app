
# Gitignore Template

Gitignore Template

## Structure

`GitignoreTemplate`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Source` | `String` | Required | - | String getSource() | setSource(String source) |

## Example (as JSON)

```json
{
  "name": "C",
  "source": "# Object files\n*.o\n\n# Libraries\n*.lib\n*.a\n\n# Shared objects (inc. Windows DLLs)\n*.dll\n*.so\n*.so.*\n*.dylib\n\n# Executables\n*.exe\n*.out\n*.app\n"
}
```

