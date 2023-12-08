package com.im.utils;

import com.jfinal.kit.PathKit;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SqlUtil {


    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(PathKit.getWebRootPath() + "\\src\\main\\resources\\im_v3.sql"));
        String sqlStr = br.lines().collect(Collectors.joining("\n"));
        Matcher matcher = Pattern.compile("`([\\w]*)`").matcher(sqlStr);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            matcher.appendReplacement(sb, doConvert(matcher.group(0)));
        }
        matcher.appendTail(sb);
//            System.out.println(sb.toString());
        try {
//            String str="hello world!";
            FileWriter writer;
            try {
                writer = new FileWriter("E:/im_v3.sql");
//                writer.append(sb);
                writer.write(sb.toString());
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String doConvert(String keyword) {
        if (keyword.matches("[\\S]*[A-Z][\\S]*")) {
            for (int i = 0; i < keyword.length(); i++) {
                char key = keyword.charAt(i);
                if (Character.isUpperCase(key)) {
                    String keyStr = key + "";
                    keyword = keyword.replace(keyStr, "_" + keyStr.toLowerCase());
//                    System.out.println("replaced to underline: "+ keyword);
                }
            }
        }
        return keyword;
    }

}
