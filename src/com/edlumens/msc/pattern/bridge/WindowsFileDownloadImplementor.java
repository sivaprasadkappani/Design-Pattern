package com.edlumens.msc.pattern.bridge;

public class WindowsFileDownloadImplementor implements FileDownloadImplementor {

    @Override
    public Object downloadFile(String path) {
        return new Object();
    }

    @Override
    public boolean storeFile(Object object) {
        System.out.println("File downloaded successfully in WINDOWS !!");
        return true;
    }
}