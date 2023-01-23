
# Api Overview

Api Overview

## Structure

`ApiOverview`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `VerifiablePasswordAuthentication` | `boolean` | Required | - | boolean getVerifiablePasswordAuthentication() | setVerifiablePasswordAuthentication(boolean verifiablePasswordAuthentication) |
| `SshKeyFingerprints` | [`SshKeyFingerprints`](../../doc/models/ssh-key-fingerprints.md) | Optional | - | SshKeyFingerprints getSshKeyFingerprints() | setSshKeyFingerprints(SshKeyFingerprints sshKeyFingerprints) |
| `SshKeys` | `List<String>` | Optional | - | List<String> getSshKeys() | setSshKeys(List<String> sshKeys) |
| `Hooks` | `List<String>` | Optional | - | List<String> getHooks() | setHooks(List<String> hooks) |
| `Web` | `List<String>` | Optional | - | List<String> getWeb() | setWeb(List<String> web) |
| `Api` | `List<String>` | Optional | - | List<String> getApi() | setApi(List<String> api) |
| `Git` | `List<String>` | Optional | - | List<String> getGit() | setGit(List<String> git) |
| `Packages` | `List<String>` | Optional | - | List<String> getPackages() | setPackages(List<String> packages) |
| `Pages` | `List<String>` | Optional | - | List<String> getPages() | setPages(List<String> pages) |
| `Importer` | `List<String>` | Optional | - | List<String> getImporter() | setImporter(List<String> importer) |
| `Actions` | `List<String>` | Optional | - | List<String> getActions() | setActions(List<String> actions) |
| `Dependabot` | `List<String>` | Optional | - | List<String> getDependabot() | setDependabot(List<String> dependabot) |

## Example (as JSON)

```json
{
  "verifiable_password_authentication": true
}
```

