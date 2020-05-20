/*
 * Copyright © 2020 bjfansr@cn.ibm.com Inc. All rights reserved
 * @description: com.ibm.util.FileUtils
 * @version V1.0
 */
package com.moses.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author Moses
 */
public class FileUtils {
    //    public static String PATH = System.getProperty("user.dir") + File.separator + "photos" + File.separator;
    public static boolean upload(MultipartFile file, String fileName) {
        File dest = new File(fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest);
            return true;
        } catch (IllegalStateException e) {
            return false;
        } catch (IOException e) {
            return false;
        }
    }
}
