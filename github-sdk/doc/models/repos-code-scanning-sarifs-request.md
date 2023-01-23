
# Repos Code Scanning Sarifs Request

## Structure

`ReposCodeScanningSarifsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CommitSha` | `String` | Required | The SHA of the commit to which the analysis you are uploading relates.<br>**Constraints**: *Minimum Length*: `40`, *Maximum Length*: `40`, *Pattern*: `^[0-9a-fA-F]+$` | String getCommitSha() | setCommitSha(String commitSha) |
| `Ref` | `String` | Required | The full Git reference, formatted as `refs/heads/<branch name>`,<br>`refs/pull/<number>/merge`, or `refs/pull/<number>/head`. | String getRef() | setRef(String ref) |
| `Sarif` | `String` | Required | A Base64 string representing the SARIF file to upload. You must first compress your SARIF file using [`gzip`](http://www.gnu.org/software/gzip/manual/gzip.html) and then translate the contents of the file into a Base64 encoding string. For more information, see "[SARIF support for code scanning](https://docs.github.com/code-security/secure-coding/sarif-support-for-code-scanning)." | String getSarif() | setSarif(String sarif) |
| `CheckoutUri` | `String` | Optional | The base directory used in the analysis, as it appears in the SARIF file.<br>This property is used to convert file paths from absolute to relative, so that alerts can be mapped to their correct location in the repository. | String getCheckoutUri() | setCheckoutUri(String checkoutUri) |
| `StartedAt` | `LocalDateTime` | Optional | The time that the analysis run began. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getStartedAt() | setStartedAt(LocalDateTime startedAt) |
| `ToolName` | `String` | Optional | The name of the tool used to generate the code scanning analysis. If this parameter is not used, the tool name defaults to "API". If the uploaded SARIF contains a tool GUID, this will be available for filtering using the `tool_guid` parameter of operations such as `GET /repos/{owner}/{repo}/code-scanning/alerts`. | String getToolName() | setToolName(String toolName) |
| `Validate` | `Boolean` | Optional | Whether the SARIF file will be validated according to the code scanning specifications.<br>This parameter is intended to help integrators ensure that the uploaded SARIF files are correctly rendered by code scanning. | Boolean getValidate() | setValidate(Boolean validate) |

## Example (as JSON)

```json
{
  "commit_sha": "commit_sha4",
  "ref": "ref0",
  "sarif": "sarif2",
  "checkout_uri": null,
  "started_at": null,
  "tool_name": null,
  "validate": null
}
```

