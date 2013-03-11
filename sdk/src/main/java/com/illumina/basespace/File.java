/**
* Copyright 2012 Illumina
* 
 * Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*    http://www.apache.org/licenses/LICENSE-2.0
* 
 *  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/

package com.illumina.basespace;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A BaseSpace data file.
 * @author bking
 *
 */
@UriPath("/files")
public class File extends BaseSpaceEntity
{
    @JsonProperty("ContentType")
    private String contentType;
    public String getContentType()
    {
        return contentType;
    }
    protected void setContentType(String contentType)
    {
        this.contentType = contentType;
    }

    @JsonProperty("Size")
    private Long size;
    
    public Long getSize()
    {
        return size;
    }
    protected void setSize(Long size)
    {
        this.size = size;
    }
    
    @JsonProperty("Path")
    private String path;

    public String getPath()
    {
        return path;
    }
    protected void setPath(String path)
    {
        this.path = path;
    }
    
    @JsonProperty("OriginalScope")
    private String originalScope;
    public String getOriginalScope()
    {
        return originalScope;
    }
    public void setOriginalScope(String originalScope)
    {
        this.originalScope = originalScope;
    }
    
    @JsonProperty("HrefVariants")
    private String hrefVariants;
    public String getHrefVariants()
    {
        return hrefVariants;
    }
    protected void setHrefVariants(String hrefVariants)
    {
        this.hrefVariants = hrefVariants;
    }
    
    @JsonProperty("HrefCoverage")
    private String hrefCoverage;
    public String getHrefCoverage()
    {
        return hrefCoverage;
    }
    public void setHrefCoverage(String hrefCoverage)
    {
        this.hrefCoverage = hrefCoverage;
    }

    @JsonProperty("HrefContent")
    private String hrefContent;
    public String getHrefContent()
    {
        return hrefContent;
    }
    protected void setHrefContent(String hrefContent)
    {
        this.hrefContent = hrefContent;
    }
    
    @JsonProperty("UploadStatus")
    private String uploadStatus;
    public String getUploadStatus()
    {
        return uploadStatus;
    }
    public void setUploadStatus(String uploadStatus)
    {
        this.uploadStatus = uploadStatus;
    }

    
    @Override
    public String toString()
    {
        return "File [contentType=" + contentType + ", size=" + size + ", path=" + path + ", toString()="
                + super.toString() + "]";
    }


    
    
    
    
    
}
