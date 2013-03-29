<%@ page import="com.google.appengine.api.blobstore.BlobstoreServiceFactory" %>
<%@ page import="com.google.appengine.api.blobstore.BlobstoreService" %>
<%@ page import="com.google.appengine.api.blobstore.UploadOptions" %>


<%
    BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService();
    UploadOptions uploadOptions = 
    		  UploadOptions.Builder.withGoogleStorageBucketName("premierbucket");
    String uploadUrl = blobstoreService.createUploadUrl("/upload", uploadOptions);
%>


<html>
    <head>
        <title>Upload Test - Storage2</title>
    </head>
    <body>
        <!-- form action="<%= blobstoreService.createUploadUrl("/upload") %>" method="post" enctype="multipart/form-data"-->
        <form action="<%= uploadUrl %>" method="post" enctype="multipart/form-data">
            <input type="text" name="foo">
            <input type="file" name="myFile">
            <input type="submit" value="Submit">
        </form>
    </body>
</html>