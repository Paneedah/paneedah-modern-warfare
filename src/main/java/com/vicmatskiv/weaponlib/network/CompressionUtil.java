package com.paneedah.weaponlib.network;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class CompressionUtil {
	
	private static final Logger LOGGER = LogManager.getLogger(CompressionUtil.class);
	
	
	public static byte[] compressString(String str) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		GZIPOutputStream gos = null;
		try {
			gos = new GZIPOutputStream(bos);
		} catch (IOException e1) {
			LOGGER.catching(e1);
		}
		
		if(gos == null) {
			LOGGER.error("Failure to create compression output stream.");
			return null;
		}
		
		try {
			gos.write(str.getBytes());
		} catch (IOException e) {
			LOGGER.catching(e);
		}
		try {
			bos.close();
			gos.close();
		} catch (IOException e) {
			LOGGER.catching(e);
			LOGGER.error("Failed to close output streams.");
		}
		
		
		return bos.toByteArray();
	}
	
	public static String decompressString(byte[] bytes) {
		String line = "";

			ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
			GZIPInputStream gis = null;
			try {
				gis = new GZIPInputStream(bis);
			} catch (IOException e1) {
				LOGGER.catching(e1);
			}
			
			if(gis == null) {
				LOGGER.error("Error creating compression input stream!");
				return null;
			}
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(gis));
			
			try {
				while(reader.ready()) {
					line += reader.readLine();
				}
			} catch (IOException e1) {
				LOGGER.catching(e1);
				LOGGER.error("Failed while reading lines from compression stream.");
			}
			
			try {
				gis.close();
				bis.close();
				reader.close();
			} catch(IOException e) {
				LOGGER.catching(e);
				LOGGER.debug("Failed to close input streams");
			}
			
	
		
		
		return line;
	}

}
