package com.practice.homework.base.freemarker;


import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.util.ResourceUtils;

import java.io.BufferedWriter;
import java.io.*;
import java.io.FileWriter;

public class FreemarkerUtil {
	public static boolean createEntity(Entity entity) {
		Configuration configuration = new Configuration(Configuration.VERSION_2_3_31);
		try {
			String freemarkerPath = ResourceUtils.getURL("classpath:").getPath() + "freemarker";
			configuration.setDirectoryForTemplateLoading(new File(freemarkerPath));
			configuration.setDefaultEncoding("UTF-8");
			Template template = configuration.getTemplate("entity.ftl");
			String targetPath = ResourceUtils.getURL("classpath:").getPath();
			targetPath = targetPath.substring(0, targetPath.indexOf("target/classes/"));
			targetPath = targetPath + "src/main/java/";
			targetPath = targetPath + entity.getPackageName().replace(".", "/") + "/";
			File targetFile = new File(targetPath + entity.getClassName() + ".java");
			BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile));
			template.process(entity, bw);
			bw.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
