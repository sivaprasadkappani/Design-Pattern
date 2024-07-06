package com.edlumens.msc.pattern.bridge;

// Concrete Implementer 1
public class LinuxFileDownloadImplementor implements FileDownloadImplementor {

    @Override
    public Object downloadFile(String path) {
        return new Object();
    }

    @Override
    public boolean storeFile(Object object) {
        System.out.println("File downloaded successfully in LINUX !!");
        return true;
    }
}
