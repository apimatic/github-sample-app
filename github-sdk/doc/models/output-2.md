
# Output 2

Check runs can accept a variety of data in the `output` object, including a `title` and `summary` and can optionally provide descriptive details about the run.

## Structure

`Output2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Title` | `String` | Required | The title of the check run. | String getTitle() | setTitle(String title) |
| `Summary` | `String` | Required | The summary of the check run. This parameter supports Markdown. **Maximum length**: 65535 characters.<br>**Constraints**: *Maximum Length*: `65535` | String getSummary() | setSummary(String summary) |
| `Text` | `String` | Optional | The details of the check run. This parameter supports Markdown. **Maximum length**: 65535 characters.<br>**Constraints**: *Maximum Length*: `65535` | String getText() | setText(String text) |
| `Annotations` | [`List<Annotation>`](../../doc/models/annotation.md) | Optional | Adds information from your analysis to specific lines of code. Annotations are visible on GitHub in the **Checks** and **Files changed** tab of the pull request. The Checks API limits the number of annotations to a maximum of 50 per API request. To create more than 50 annotations, you have to make multiple requests to the [Update a check run](https://docs.github.com/rest/reference/checks#update-a-check-run) endpoint. Each time you update the check run, annotations are appended to the list of annotations that already exist for the check run. For details about how you can view annotations on GitHub, see "[About status checks](https://docs.github.com/articles/about-status-checks#checks)".<br>**Constraints**: *Maximum Items*: `50` | List<Annotation> getAnnotations() | setAnnotations(List<Annotation> annotations) |
| `Images` | [`List<Image>`](../../doc/models/image.md) | Optional | Adds images to the output displayed in the GitHub pull request UI. | List<Image> getImages() | setImages(List<Image> images) |

## Example (as JSON)

```json
{
  "title": "title4",
  "summary": "summary2",
  "text": null,
  "annotations": null,
  "images": null
}
```

