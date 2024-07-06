package com.edlumens.msc.pattern.bridge.change.abstraction;

public interface FileDownloaderAbstraction {

    public Object download(String path);
    public boolean store(Object object);
    public boolean delete(String object);
}
