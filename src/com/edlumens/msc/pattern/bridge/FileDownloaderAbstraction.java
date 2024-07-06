package com.edlumens.msc.pattern.bridge;

// Abstraction
public interface FileDownloaderAbstraction {

    public Object download(String path);
    public boolean store(Object object);
}