package com.edlumens.msc.pattern.bridge;

// Implementer
public interface FileDownloadImplementor {

    public Object downloadFile(String path);
    public boolean storeFile(Object object);
}