package com.example.assignment3.resource;

import com.example.assignment3.model.Photo;
import com.example.assignment3.model.User;
import com.example.assignment3.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PhotoResource {

    @Autowired
    private PhotoService photoService;

    @PostMapping("/photo")
    public Photo savePhoto(@RequestBody Photo photo) {
        return photoService.savePhoto(photo);
    }

    @GetMapping
    public List<Photo> getAllPhotos() {
        return photoService.getAllPhotos();
    }

    /*
    @GetMapping
    public List<Photo> getById(@RequestParam(name = "id") String id) {
        return photoService.getById(id);
    }

     */

    @PutMapping
    public Photo updatePhoto( @RequestBody Photo photo) {
        return photoService.updatePhoto(photo);
    }

    @DeleteMapping
    public void deletePhoto(@RequestParam(name = "photoId") String photoId) {
        photoService.deletePhoto(photoId);
    }


}
