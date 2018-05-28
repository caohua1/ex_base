package com.ex.controller;


import com.ex.pojo.FileEntity;
import com.ex.service.UserService;
import com.ex.util.FileUploadTool;
import com.ex.util.JsonView;
import com.ex.util.PageRequest;
import com.github.pagehelper.PageInfo;
import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private UserService userService;

    @RequestMapping("/video")
    public String video(){
        return "qq";
    }

    @RequestMapping("/all")
    @ResponseBody
    public JsonView findAll(PageRequest page) {
        logger.info("Request comming to find user list...");
        PageInfo<User> pageInfo = userService.findAll(page);
        return JsonView.success(pageInfo);
    }

    @RequestMapping("upload")
    public void upload(MultipartFile multipartFile,
                               HttpServletRequest request, ModelMap map) {
        String message = "";
        FileEntity entity = new FileEntity();
        FileUploadTool fileUploadTool = new FileUploadTool();
        try {
            entity = fileUploadTool.createFile(multipartFile, request);
            if (entity != null) {
//        service.saveFile(entity);
                message = "上传成功";
                map.put("entity", entity);
                map.put("result", message);
            } else {
                message = "上传失败";
                map.put("result", message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

