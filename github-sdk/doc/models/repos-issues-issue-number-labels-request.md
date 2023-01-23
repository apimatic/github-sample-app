
# Repos Issues Issue Number Labels Request

## Structure

`ReposIssuesIssueNumberLabelsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Labels` | `List<String>` | Optional | The names of the labels to add to the issue's existing labels. You can pass an empty array to remove all labels. Alternatively, you can pass a single label as a `string` or an `array` of labels directly, but GitHub recommends passing an object with the `labels` key. You can also replace all of the labels for an issue. For more information, see "[Set labels for an issue](https://docs.github.com/rest/reference/issues#set-labels-for-an-issue)."<br>**Constraints**: *Minimum Items*: `1` | List<String> getLabels() | setLabels(List<String> labels) |

## Example (as JSON)

```json
{
  "labels": null
}
```

