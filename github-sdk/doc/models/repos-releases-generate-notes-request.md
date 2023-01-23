
# Repos Releases Generate Notes Request

## Structure

`ReposReleasesGenerateNotesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TagName` | `String` | Required | The tag name for the release. This can be an existing tag or a new one. | String getTagName() | setTagName(String tagName) |
| `TargetCommitish` | `String` | Optional | Specifies the commitish value that will be the target for the release's tag. Required if the supplied tag_name does not reference an existing tag. Ignored if the tag_name already exists. | String getTargetCommitish() | setTargetCommitish(String targetCommitish) |
| `PreviousTagName` | `String` | Optional | The name of the previous tag to use as the starting point for the release notes. Use to manually specify the range for the set of changes considered as part this release. | String getPreviousTagName() | setPreviousTagName(String previousTagName) |
| `ConfigurationFilePath` | `String` | Optional | Specifies a path to a file in the repository containing configuration settings used for generating the release notes. If unspecified, the configuration file located in the repository at '.github/release.yml' or '.github/release.yaml' will be used. If that is not present, the default configuration will be used. | String getConfigurationFilePath() | setConfigurationFilePath(String configurationFilePath) |

## Example (as JSON)

```json
{
  "tag_name": "tag_name0",
  "target_commitish": null,
  "previous_tag_name": null,
  "configuration_file_path": null
}
```

