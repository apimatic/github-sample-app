
# Repos Issues Issue Number Labels Request 3

## Structure

`ReposIssuesIssueNumberLabelsRequest3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Labels` | `List<String>` | Optional | The names of the labels to set for the issue. The labels you set replace any existing labels. You can pass an empty array to remove all labels. Alternatively, you can pass a single label as a `string` or an `array` of labels directly, but GitHub recommends passing an object with the `labels` key. You can also add labels to the existing labels for an issue. For more information, see "[Add labels to an issue](https://docs.github.com/rest/reference/issues#add-labels-to-an-issue)."<br>**Constraints**: *Minimum Items*: `1` | List<String> getLabels() | setLabels(List<String> labels) |

## Example (as JSON)

```json
{
  "labels": null
}
```

