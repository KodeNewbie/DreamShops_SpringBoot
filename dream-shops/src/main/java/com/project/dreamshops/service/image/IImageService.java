package com.project.dreamshops.service.image;

import com.project.dreamshops.dto.ImageDto;
import com.project.dreamshops.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService
{
    Image getImageById(long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> files, Long productId);
    void updateImage(MultipartFile file, Long imageId);
}
