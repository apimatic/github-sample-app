
# Licenses Response

## Structure

`LicensesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Key` | `String` | Required | - | String getKey() | setKey(String key) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `SpdxId` | `String` | Required | - | String getSpdxId() | setSpdxId(String spdxId) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Implementation` | `String` | Required | - | String getImplementation() | setImplementation(String implementation) |
| `Permissions` | `List<String>` | Required | - | List<String> getPermissions() | setPermissions(List<String> permissions) |
| `Conditions` | `List<String>` | Required | - | List<String> getConditions() | setConditions(List<String> conditions) |
| `Limitations` | `List<String>` | Required | - | List<String> getLimitations() | setLimitations(List<String> limitations) |
| `Body` | `String` | Required | - | String getBody() | setBody(String body) |
| `Featured` | `boolean` | Required | - | boolean getFeatured() | setFeatured(boolean featured) |

## Example (as JSON)

```json
{
  "key": "mit",
  "name": "MIT License",
  "spdx_id": "MIT",
  "url": "https://api.github.com/licenses/mit",
  "node_id": "MDc6TGljZW5zZW1pdA==",
  "html_url": "http://choosealicense.com/licenses/mit/",
  "description": "A permissive license that is short and to the point. It lets people do anything with your code with proper attribution and without warranty.",
  "implementation": "Create a text file (typically named LICENSE or LICENSE.txt) in the root of your source code and copy the text of the license into the file. Replace [year] with the current year and [fullname] with the name (or names) of the copyright holders.",
  "permissions": [
    "commercial-use",
    "modifications",
    "distribution",
    "sublicense",
    "private-use"
  ],
  "conditions": [
    "include-copyright"
  ],
  "limitations": [
    "no-liability"
  ],
  "body": "\n\nThe MIT License (MIT)\n\nCopyright (c) [year] [fullname]\n\nPermission is hereby granted, free of charge, to any person obtaining a copy\nof this software and associated documentation files (the \"Software\"), to deal\nin the Software without restriction, including without limitation the rights\nto use, copy, modify, merge, publish, distribute, sublicense, and/or sell\ncopies of the Software, and to permit persons to whom the Software is\nfurnished to do so, subject to the following conditions:\n\nThe above copyright notice and this permission notice shall be included in all\ncopies or substantial portions of the Software.\n\nTHE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\nIMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\nFITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\nAUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\nLIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\nOUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE\nSOFTWARE.\n",
  "featured": true
}
```

