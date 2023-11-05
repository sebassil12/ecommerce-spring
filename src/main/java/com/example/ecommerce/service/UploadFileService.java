package com.example.ecommerce.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class UploadFileService {
    final String folderImages = "images//";

    public String saveImages(MultipartFile file) throws IOException{
        if(!file.isEmpty()){
            byte[] imageBytes = file.getBytes();
            Path path = Paths.get(folderImages + file.getOriginalFilename());
            Files.write(path, imageBytes);
            return file.getOriginalFilename();
        }
        return "default.jpg";
    }

    public void deleteImage(String name){
        String path = "images//";
        File file = new File(path+name);
        file.delete();
    }

}
