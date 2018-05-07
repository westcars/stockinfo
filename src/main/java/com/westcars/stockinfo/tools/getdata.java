package com.westcars.stockinfo.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class getdata {

    public static String getResponse(String requestUrl, String content) {
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            httpConn.setDoOutput(true);
            httpConn.setDoInput(true);
            httpConn.setUseCaches(false);
            httpConn.setRequestMethod("GET");
            OutputStream outputStream = httpConn.getOutputStream();
            outputStream.write(content.getBytes("UTF-8"));
            outputStream.close();
            BufferedReader reader = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "UTF-8"));
            String readLine;
            StringBuilder responseSb = new StringBuilder();
            while ((readLine = reader.readLine()) != null) {
                responseSb.append(readLine);
            }
            return responseSb.toString();

        } catch (IOException ex) {
            ex.printStackTrace();
            return "ERROR";
        }

    }
}
