import java.io.IOException;


public class HttpDownloader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String fileURL = "https://www.google.com/humans.txt";
	        String saveDir = "E:/Download";
	        try {
	            HttpDownloadUtility.downloadFile(fileURL, saveDir);
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	}

}
