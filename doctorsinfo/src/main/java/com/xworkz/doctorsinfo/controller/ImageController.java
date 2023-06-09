package com.xworkz.doctorsinfo.controller;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class ImageController {
	public ImageController() {
		System.out.println("Running in imageController");
	}

	@PostMapping("/upload")
	public String onUpload(@RequestParam("chitra") MultipartFile multipartFile, Model model) throws IOException {
		System.out.println("multipartFile" + multipartFile);
		System.out.println(multipartFile.getOriginalFilename());
		System.out.println(multipartFile.getContentType());
		System.out.println("Size of file"+multipartFile.getSize());
		System.out.println("Size of bite"+multipartFile.getBytes());
		if (multipartFile.isEmpty()) {
			System.out.println("file not uploaded");
			model.addAttribute("error", "please select file");
			return "ImageUpload";
		}
		model.addAttribute("sucess", "image uploaded sucessfully");
		byte[] bytes = multipartFile.getBytes();
		Path path = Paths.get("D:\\temp\\" + multipartFile.getOriginalFilename());
		Files.write(path, bytes);
		return "ImageUpload";
	}

	@GetMapping("/download")
	public void onDownload(HttpServletResponse response, @RequestParam String fileName) throws IOException {
		response.setContentType("image/jpeg");
		File file = new File("D:\\somu\\" + fileName);
		InputStream in = new BufferedInputStream(new FileInputStream(file));
		ServletOutputStream out = response.getOutputStream();
		IOUtils.copy(in, out);
		response.flushBuffer();

	}
}
