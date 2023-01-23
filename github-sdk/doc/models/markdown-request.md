
# Markdown Request

## Structure

`MarkdownRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Text` | `String` | Required | The Markdown text to render in HTML. | String getText() | setText(String text) |
| `Mode` | [`ModeEnum`](../../doc/models/mode-enum.md) | Optional | - | ModeEnum getMode() | setMode(ModeEnum mode) |
| `Context` | `String` | Optional | The repository context to use when creating references in `gfm` mode.  For example, setting `context` to `octo-org/octo-repo` will change the text `#42` into an HTML link to issue 42 in the `octo-org/octo-repo` repository. | String getContext() | setContext(String context) |

## Example (as JSON)

```json
{
  "text": "text0",
  "mode": null,
  "context": null
}
```

